<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf" %>
</head>
<body>
<table id="dg"></table>
</body>
<script type="text/javascript">
    $(function () {
        $('#dg').datagrid({
            url: 'category_queryJoinAccount.action',
            striped: true,
            nowrap: false,
            fitColumns: true,
            singleSelect: true,
            checkbox: true,
            pagination: true,
            queryParams: {
                "model.type": ""
            },
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
    });
</script>
</html>
