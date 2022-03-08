<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Bienvenue sur notre application avec Struts </h1>
        <p><a href="<s:url action='hello'/>">Bonjour!!!</a></p>
        <p>cliquez sur le lien et découvrez la suite.</p>
    </body>
</html>