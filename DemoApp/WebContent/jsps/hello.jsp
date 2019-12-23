<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Hello</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/testdb" user="root"  password="admin"/>

<sql:query dataSource ="${db}" var = "rs">
          select * from person; 
</sql:query>
 <c:forEach items="${rs.rows}" var="person">
 	<c:out value="${person.id}"></c:out> : <c:out value="${person.pcity}"></c:out> : <c:out value="${person.name}"></c:out>
 	<br><br>
 </c:forEach>
 
 <c:set var="str" value="Harshitha is a good girl"/>
 
 <br>	Length: ${fn:length(str)} 
 
 <c:forEach items="${fn:split(str, 'a')}" var="s">
 
 <br> ${s}
 </c:forEach>


</body>
</html>