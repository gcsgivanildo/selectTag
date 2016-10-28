<%-- 
    Document   : selectTag
    Created on : 25/10/2016, 20:34:34
    Author     : givanildo
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/selectTag" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #frutas{
                color: brown;
                background-color: aliceblue;
            }
            
            #sel{
                color:blue;
                background-color: antiquewhite;
            }
        </style>
    </head>
    <body>
        
      <%
      String[] Lfrutas = {"Maçã", "Laranja", "Uva", "Caju", "Manga"}; 
      List<String> frutas = Arrays.asList(Lfrutas);
        %>        
      <%--pegando os dados do array de frutas e gerando um Select--%>
      <s:selectOption id="frutas" nameLabel="Frutas" nameSelect="frutas" nameOption="<%=frutas%>" />
        
      
       <s:selectOption id="frut" nameLabel="Frutas" nameSelect="frutas" nameOption="<%=frutas%>" />
      
       
        <%--Para funcionar executar a pagina SelectTagServlet, ou tirar esse select a baixo,
        ou criar uma página que chama a servlet. Pois essa parte a baixo precisa de parâmentros
        Pegando os dados de um Servlet e gerando um Select --%>
        <s:selectOption id="sel" nameLabel="Professor" nameSelect="professor" nameOption="${profs}"/>
       
        
        
    </body>
</html>
