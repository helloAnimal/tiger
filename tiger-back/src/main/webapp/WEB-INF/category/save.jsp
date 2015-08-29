<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf" %>
</head>
<body>
<form id="ff" method="post">
    <div>
        <label>类别名称:</label>
        <input class="easyui-validatebox" type="text" name="type"/>
    </div>
    <div>
        <label>热点:</label>
        <input type="radio" name="hot" value="1"/>热点
        <input type="radio" name="hot" value="0"/>非热点
    </div>
    <div>
        <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加类别</a>
    </div>
</form>
<script type="text/javascript">
    $(function () {
        $("input[name=type]").validatebox({
            required: true,
            missingMessage: "请输入类别名称"
        });
        $("#ff").form("disableValidation");
        $("#btn").click(function () {
            $("#ff").form("enableValidation");
            if ($("#ff").form("validate")) {
                $('#ff').form('submit', {
                    url: "category_save.action",
                    success: function () {
                        parent.$("#win").window("close");
//                        parent.$("iframe").contains().find("#dg").datagrid("reload");
                        parent.$("iframe").get(0).contentWindow.$("#dg").datagrid("reload");
                    }
                });
            }
        });
    });
</script>
</body>
</html>
