<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf" %>
</head>
<body>
<table id="dg"></table>
</body>
<script type="text/javascript">
    $(function(){
        $('#dg').datagrid({
            url:'datagrid_data.json',
            striped:true,
            nowrap:false,
            fitColumns:true,
            singleSelect:true,
            checkbox:true,
            pagination:true,
            columns:[[
                {field:"id",checkbox:true},
                {field:'productid',title:'Code',width:100},
                {field:'productname',title:'Name',width:100},
                {field:'unitcost',title:'Price',width:100,align:'right'},
                {field:'status',title:'status',width:100,align:'right'},
                {field:'listprice',title:'listprice',width:100,align:'right'},
                {field:'attr1',title:'attr1',width:100,align:'right'},
                {field:'itemid',title:'itemid',width:100,align:'right'}
            ]]
        });
    });
</script>
</html>
