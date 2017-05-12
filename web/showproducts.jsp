<%-- 
    Document   : index
    Created on : Mar 3, 2017, 6:48:13 PM
    Author     : GTB Student
--%>
<%@page import="myhibernate.Producttable"%>
<%@page import="myhibernate.Subcategory"%>
<%@page import="myhibernate.Categorytable"%>
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
        <title>Welcome to EyeCare</title>
      <%@include file="headercss.jsp" %>
    </head>
    <body>
        <%@include file="header.jsp" %>
       
        <section id="recent-works">
        <div class="container">
            <div class="center wow fadeInDown">
                <h2>Choose Products</h2>                
            </div>
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
                      int id=Integer.parseInt(request.getParameter("id"));
                      Query myquery=mysession.createQuery("from Producttable where subcatid=:id");
                      myquery.setParameter("id", id);
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {
                          out.print("<table cellpadding=10px width='80%'>"
                                  + "<tr>");
                          int counter=1;
                          for(int x=0;x<myresult.size();x++)
                          {
                            Producttable obj=(Producttable) myresult.get(x);
                           
                            out.println("<td align=center><a href='productdetails.jsp?id=" + obj.getProductid() + "'><img src='userimages/" + obj.getImage() + "' width='200px' height='200px'>"
                                    + "<br> " + obj.getName() + "</a></td>");
                            counter++;
                            if(counter==4)
                            {
                            out.println("</tr><tr>");
                            counter=1;
                            }
                           
                          }
                          out.println("</table>");
                      }
                      else
                      {
                          out.println("No Products found");
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
           
           
        </div><!--/.container-->
    </section><!--/#recent-works-->
    
        <%@include file="footer.jsp" %>
    </body>
</html>
