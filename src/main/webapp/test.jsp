
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@include file="resources/common/header.jsp" %>
    <script type="text/javascript" src="${ctx}/resources/js/login.js"></script>
    <link rel="stylesheet" href="${ctx}/resources/css/login.css">

</head>

<body>
 <div id="login" style="padding-left:6px">  
        <p>管理员账号：<input class="easyui-textbox" type="text" id="loginName" name="loginName" value="" /></p>  
        <p>管理员密码：<input class="easyui-passwordbox" type="password" id="password" name="password" value="" /></p>  
    </div>  
    <div id="btn">  
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="javascript:$('#login').dialog('close')">取消</a>  
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="">登陆</a>  
    </div>  
</body>

</html>

 
