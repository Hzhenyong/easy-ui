<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${ctx}/resources/css/login.css">
   
    <%@include file="resources/common/header.jsp" %>
    
  

</head>

<body>
 <div id="login" style="padding-left:6px">  
        <p>账号：<input  type="text" id="loginName" name="loginName" value="" /></p>  
        <p>密码：<input  type="password" id="password" name="password" value="" /></p>  
    </div>  
    <div id="btn">  
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="javascript:$('#login').dialog('close')">取消</a>  
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="login()">登陆</a>  
    </div>  
</body>

</html>
 <script type="text/javascript" src="${ctx}/resources/js/login.js"></script>