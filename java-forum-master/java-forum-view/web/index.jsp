<%--
  Created by IntelliJ IDEA.
  User: Archibald
  Date: 06/10/2018
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div id="divLogin">
    <form action="login" method="post" style="text-align: center">
        <label>Usuário: </label><input type="text" name="nomeUsuario">
        <br><br>
        <label>Senha: </label><input type="password" name="senha">
        <br><br>
        <input type="submit" value="Logar">
    </form>
</div>
</body>
</html>
