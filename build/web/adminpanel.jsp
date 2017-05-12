<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <%@include file="headercss.jsp" %>
        <%@page import="java.sql.*" %>
        <%@include file="variables.jsp" %>
    </head>
    <body>
        <%@include file="headeradmin.jsp" %>
        <section id="contact-page2">
        <div class="container">
            <h1 style="color:black">Admin Panel</h1>
            <table width="75%" cellpadding="10px">
                <tr>
                    <td align="center"><a href="addcategory.jsp"><img src="images/add.png"></a><br><a href="addcategory.jsp">Add Category</a></td>
                    <td align="center"><a href="addcategory.jsp"><img src="images/add.png"></a><br><a href="addsubcategory.jsp">Add Sub Category</a></td>
                    <td align="center"><a href="addcategory.jsp"><img src="images/add.png"></a><br><a href="addproduct.jsp">Add Product</a></td>
                
                </tr>
                
            </table>
        </div>
            </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
