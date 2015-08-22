<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf" %>
    <style type="text/css">
        html {
            font-family: '微软雅黑';
        }

        #menu {
            margin: 0px;
            padding: 0px;
            list-style: none;
        }

        #menu li {
            border-bottom: 1px dotted;
            width: 100%;
            font-size: 1rem;
        }

        #menu li a {
            padding: 5px;
            color: #000000;
            text-decoration: none;
            background-color: #FFFFCC;
            display: block;
            text-align: center;
        }

        #menu li a:hover {
            background-color: #99CCFF;
        }
    </style>
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'欢迎来到在线商城系统',split:true" style="height:100px;"></div>
<div data-options="region:'west',title:'菜单',split:true" style="width:200px;">
    <div id="aa" class="easyui-accordion" style="width:200px;" data-options="fit:true">
        <div title="系统管理" data-options="selected:true">
            <ul id="menu">
                <li><a href="javascript:void(0);" title="send_main_right.action">类别管理</a></li>
                <li><a href="javascript:void(0);" title="send_main_left.action">账户管理</a></li>
            </ul>
        </div>
        <div title="其他菜单">
        </div>
    </div>
</div>
<div data-options="region:'center'" style="padding:1px;">
    <div id="tt" class="easyui-tabs" data-options="fit:true">
        <div title="欢迎主页">
            tab1
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function(){
        $("a[title]").click(function(){
            var text=$(this).text();
            var href=$(this).attr("title");
            if($("#tt").tabs("exists",text)){
                $("#tt").tabs("select",text);
            }else{
                $("#tt").tabs("add",{
                    title:text,
                    content:"<iframe frameborder='0' width='100%' height='100%' src='"+href+"'>",
                    closable:true
                });
            }
        });
    });
</script>
</html>

