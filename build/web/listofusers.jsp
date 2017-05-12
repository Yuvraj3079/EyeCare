<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>
<%@page import="java.util.List"%>
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
          <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <%@include file="headeradmin.jsp" %>
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black;text-align:center">List of Users</h1>
          <%
             
                 try
                 {
                          Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                   StandardServiceRegistryBuilder builder = 
                           new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                   SessionFactory myfactory = configuration.buildSessionFactory(builder.build());
                  Session mysession=myfactory.openSession();
                  try
                  {
                      
                      Query myquery=mysession.createQuery("from Usertable");
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {
                          out.print("<table class='rwd-table'>"
                                  + "<tr><th>Name</th><th>Address</th><th>Phone</th><th>Emailid</th></tr>");
                          for(int x=0;x<myresult.size();x++)
                          {
                            Usertable obj=(Usertable) myresult.get(x);
                            out.println("<tr>");
                            out.println("<td>" + obj.getName() + "</td><td>" + obj.getAddress() + "</td><td>" + obj.getPhone() + "</td><td>"
                            + obj.getEmailid() + "</td>");
                            out.println("</tr>");
                           
                          }
                          out.println("</table>");
                      }
                      else
                      {
                          out.println("No Users found");
                      }
                      
                  }
                      catch(Exception e)
                      {
                           out.println("Error Occured  " + e.getMessage());
                      }
                      finally
                        {
                             mysession.close();
                            myfactory.close();
                           
                        }
                }
                catch(Exception e)
                {
                  out.println("Error Occured while establishing connection " + e.getMessage());
                }
                  
                  
             
              
              
          %>
        </div>
            </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
