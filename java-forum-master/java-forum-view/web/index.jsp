<%--
  Created by IntelliJ IDEA.
  User: Robson Manfroi
  Date: 14/10/2018
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forum</title>

    <style><%@include file="/WEB-INF/estilo/estilo.css"%></style>


</head>
<body>

     <div id="barra">
        <label>Bem vindo ao forum</label>
         <div id="login">
            <a href="login.jsp">Entrar &nbsp;&nbsp;</a>
            <a>Cadastrar</a>
         </div>
     </div>
     <h1>...........</h1>

     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


     <input type="button" name="novo" value="Novo Tópico" class="novo">
     <input type="text" name="buscar" placeholder="BUSCAR" class="busca">

    <table width="90%" align="center" cellpadding="10">
        <tr align="center" bgcolor="#CCC">
            <td><strong>Titulo Assunto</strong></td>
            <td><strong>Mensagem</strong></td>
            <td><strong>Status</strong></td>
        </tr>
    </table>


</body>
</html>
