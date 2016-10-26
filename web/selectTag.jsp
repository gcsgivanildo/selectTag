<%-- 
    Document   : selectTag
    Created on : 25/10/2016, 20:34:34
    Author     : givanildo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/selectTag" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%--Funcionando--%>
        <s:selectOption nameId="sel" nameLabel="Professor" nameSelect="professor" qtdOption="10" nameOption="Ana"/>
        
        <%--Testando com servlet e arrayList e outros--%>
        <s:selectOption nameId="sel" nameLabel="Professor" nameSelect="professor" qtdOption="${cont}" nameOption="${prof}"/>
        
        
        
    </body>
</html>
