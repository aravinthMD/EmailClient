<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Show Contack</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>ContactNO</th>
                <th>Email</th>
                <th>phNO</th>
                
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${contactListuser1}" var="user">
                <tr>
                    <td><c:out value="${user.userid}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.phno}" /></td>
<!--                     
                    <td><a href="UserController?action=edit&userid=<c:out value="${user.userid}"/>">Update</a></td>
                    
                    <td><a href="UserController?action=delete&userid=<c:out value="${user.userid}"/>">Delete</a></td>
                </tr> -->
            </c:forEach>
        </tbody>
    </table>
    <!-- <p><a href="UserController?action=insert">Add User</a></p> --> -->
</body>
</html>