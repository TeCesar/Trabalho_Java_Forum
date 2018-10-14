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

    <style>
        #barra{
            height: 50px;
            width: 100%;
            position: fixed;
            left: 0;
            top: 0;
            background: #069;
            color: #fff;
            text-align: center;

        }
        .busca{

            right: 105px;
            width: 500px;
            position: absolute;
            top: 58px;
        }
        #login{
            right: 105px;
            position: absolute;
            cursor: pointer;

        }
        a {
            color: inherit;
            text-decoration:none;
        }


    </style>
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



     <input type="text" name="buscar" placeholder="BUSCAR" class="busca">

    <table width="90%" align="center" cellpadding="10">
        <tr align="center" bgcolor="#CCC">

            <td><strong>Nª Ticket</strong></td>
            <td><strong>Titulo Assunto</strong></td>
            <td><strong>E-mail</strong></td>
            <td><strong>Mensagem</strong></td>
            <td><strong>Imagem</strong></td>
            <td><strong>Status</strong></td>


        </tr>
    </table>


</body>
</html>
