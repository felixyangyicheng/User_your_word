<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
   <t:structure titre="Welcome ${utilisateur}">
   <h1>Welcome ${utilisateur}</h1>
   
   <c:forEach var="i" begin="0" end="7" step="1">
   <p>${i }</p>
   </c:forEach>
   </t:structure>

