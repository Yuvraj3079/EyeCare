<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="myhibernate.Usertable"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.*"%>
<%@page import="java.sql.*" %>
<%@include file="variables.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup</title>        
        <%@include file="headercss.jsp" %>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black;text-align:center">Signup</h1>
          <form name="form1" method="post" action="">
            <table width="500" border="0" cellspacing="0" cellpadding="5">
              <tr>
                <td width="146">Username</td>
                <td width="334"><label for="uname"></label>
                <input type="text" name="uname" id="uname" class="form-control"></td>
              </tr>
              <tr>
                <td>Password</td>
                <td><label for="password"></label>
                <input type="password" name="password" id="password" class="form-control"></td>
              </tr>
              <tr>
                <td>Name</td>
                <td><label for="name"></label>
                <input type="text" name="name" id="name" class="form-control"></td>
              </tr>
              <tr>
                <td>Address</td>
                <td><label for="address"></label>
                <textarea name="address" cols="50" rows="5" id="address" class="form-control"></textarea></td>
              </tr>
              <tr>
                <td>Phone</td>
                <td><label for="phone"></label>
                <input type="text" name="phone" id="phone" class="form-control"></td>
              </tr>
              <tr>
                <td>EmailId</td>
                <td><label for="emailid"></label>
                <input type="text" name="emailid" id="emailid" class="form-control"></td>
              </tr>
              <tr>
                <td>Gender</td>
                <td><p>
                  <label>
                    <input type="radio" name="gender" value="male" id="gender_0">
                    Male</label>
                  
                  <label>
                    <input type="radio" name="gender" value="female" id="gender_1">
                    Female</label>
                  <br>
                </p></td>
              </tr>
              <tr>
                <td>Country</td>
                <td><label for="country"></label>
                  <select name="country" id="country" class="form-control">
                    <option>Choose Country</option>
                    <option value="ind">India</option>
                    <option value="aus">Australia</option>
                </select></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><input type="submit" name="Submit" id="Submit" value="Submit" class="btn btn-primary btn-lg">
                <input type="reset" name="Reset" id="Reset" value="Reset" class="btn btn-primary btn-lg"></td>
              </tr>
            </table>
          </form>
          <%
          if(request.getParameter("Submit")!=null)
          {
              try
              {
                  Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                   StandardServiceRegistryBuilder builder = 
                           new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                   SessionFactory myfactory = configuration.buildSessionFactory(builder.build());
                  Session mysession=myfactory.openSession();
                  Usertable obj=new Usertable();
                  obj.setUsername(request.getParameter("uname"));
                  obj.setPassword(DigestUtils.md5Hex(request.getParameter("password") + salt));
                  obj.setName(request.getParameter("name"));
                  obj.setAddress(request.getParameter("address"));
                  obj.setEmailid(request.getParameter("emailid"));                  
                  obj.setGender(request.getParameter("gender"));
                  obj.setPhone(request.getParameter("phone"));
                  obj.setCountry(request.getParameter("country"));
                  mysession.beginTransaction();
                  mysession.save(obj);
                  mysession.getTransaction().commit();
                  mysession.close();
                  myfactory.close();
                  out.println("Sign up Successful");
                          
              
              }
              catch(Exception e)
              {
                  out.println("Error Occured while establishing connection " + e.getMessage());
              }
              
          }
              
              
              
              
          %>
        </div>
            </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
