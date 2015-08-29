<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf" %>
    <style type="text/css">
        body{
            margin: 0px;
        }
    </style>
</head>
<body>
<table id="dg"></table>

</body>
<script type="text/javascript">
    $(function () {
        $('#dg').datagrid({
            url: 'category_queryJoinAccount.action',
            striped: true,
            idField:"id",
            nowrap: false,
            fitColumns: true,
            singleSelect: false,
            checkbox: true,
            pagination: true,
            queryParams: {
                "model.type": ""
            },
            toolbar: [{
                iconCls: 'icon-add',
                text:"添加类别",
                handler: function(){
                    parent.$("#win").window({
                        title:"添加类别",
                        width:300,
                        height:200,
                        content:"<iframe src='send_category_save.action' frameborder='0' width='100%' height='100%'>"
                    });
                }
            },'-',{
                iconCls: 'icon-edit',
                text:"更新类别",
                handler: function(){alert('帮助按钮')}
            },'-',{
                iconCls: 'icon-remove',
                text:"删除",
                handler: function(){
                    var rows=$("#dg").datagrid("getSelections");
                    if(rows.length==0){
                        $.messager.show({
                            title:'提示',
                            msg:'请选择至少一条记录！',
                            timeout:2000,
                            showType:'slide'
                        });
                    }else{
                        $.messager.confirm('确认', '是否删除选中记录？', function(r){
                            if (r){
                                var ids="";
                                for(var index=0;index<rows.length;index++){
                                    ids+=rows[index].id+",";
                                }
                                ids=ids.substring(0,ids.lastIndexOf(","));
                                $.post("category_deleteByIds.action",{ids:ids},function(result){
                                    if("true"==result){
                                        $("#dg").datagrid("reload");
                                    }else{
                                        $.messager.show({
                                            title:'提示',
                                            msg:'删除失败！',
                                            timeout:2000,
                                            showType:'slide'
                                        });
                                    }
                                },"text");
                            }
                        });
                    }
                }
            },'-',{
                text:"<input type='text' id='search' name='search'/> "
            }],
            columns: [
                [
                    {field: "id", checkbox: true},
                    {field: 'type', title: '类型'},
                    {field: 'hot', title: '热点'},
                    {field: 'aid', title: '管理员ID'},
                    {field: 'account.login', title: '管理员',
                        formatter: function (value, row, index) {
                            if (row.account != null && row.account.login != null) {
                                return row.account.login;
                            }
                        }
                    }
                ]
            ]
        });

        $('#search').searchbox({
            searcher:function(value,name){
                $('#dg').datagrid('load',{
                    "model.type": value
                });
            },
            prompt:'请输入值'
        });

    });
</script>
</html>
