<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Votre compte a été créé avec success</title>
  </head>
  <body>
    <h3>Nous vous remercions pour votre inscription</h3>
    <p>Voici vos informations personnelles: <s:property value="personBean" /> </p>
    <p><a href="<s:url action='index' />" >Retourner à la page d'acceuil</a>.</p>
  </body>
</html>