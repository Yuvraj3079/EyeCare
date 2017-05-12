<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>
<%@page import="myhibernate.Admintable"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="myhibernate.Usertable"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@include file="headercss.jsp" %>
        <%@page import="java.sql.*" %>
        <%@include file="variables.jsp" %>
    </head>
    <body>
        <%
        Cookie mycookies[]=request.getCookies();
        if(mycookies!=null)
        {
            for(int x=0;x<mycookies.length;x++)
            {
                if(mycookies[x].getName().equals("adminname"))
                {
                    session.setAttribute("adminname", mycookies[x].getValue());
                    response.sendRedirect("adminpanel.jsp");
                }
                else if(mycookies[x].getName().equals("uname"))
                {
                    session.setAttribute("uname", mycookies[x].getValue());
                    response.sendRedirect("welcome.jsp");
                }
            }
            
        }
            
            
            
            
            
        %>
        <%@include file="header.jsp" %>
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black;text-align:center">Login</h1>
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
                <td></td>
                <td><label for="signedin"></label>
                <input type="checkbox" name="signedin" id="signedin">Stay Signed in</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><input type="submit" name="Submit" id="Submit" value="Login" class="btn btn-primary btn-lg">
                <input type="reset" name="Reset" id="Reset" value="Reset" class="btn btn-primary btn-lg"></td>
              </tr>
              <tr><td></td><td>
          
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
                  try
                  {
                      String pass=request.getParameter("password") + salt;
                      Query myquery=mysession.createQuery("from Usertable where username='" + request.getParameter("uname") 
                       + "' and password='" + DigestUtils.md5Hex(pass) + "'");
                      List myresult;
                      myresult=myquery.list();
                      
                      String adminpass=request.getParameter("password") + adminsalt;
                      Query myquery2=mysession.createQuery("from Admintable where username='" + request.getParameter("uname") 
                       + "' and password='" + DigestUtils.md5Hex(adminpass) + "'");
                      List myresult2;
                      myresult2=myquery2.list();
                      
                      if(myresult.size()>0)
                      {
                          if(request.getParameter("signedin")!=null)
                          {
                              Cookie mycookie=new Cookie("uname", request.getParameter("uname"));
                              mycookie.setMaxAge(24*7*60*60);
                              response.addCookie(mycookie);
                          }
                            Usertable obj=(Usertable) myresult.get(0);
                            session.setAttribute("uname", obj.getUsername());
                            session.setAttribute("name", obj.getName());
                            session.setAttribute("emailid", obj.getEmailid());
                            request.getRequestDispatcher("welcome.jsp").forward(request, response);
                      }
                      else if(myresult2.size()>0)
                      {
                           if(request.getParameter("signedin")!=null)
                          {
                              Cookie mycookie=new Cookie("adminname", request.getParameter("uname"));
                              mycookie.setMaxAge(24*7*60*60);
                              response.addCookie(mycookie);
                          }
                           Admintable obj=(Admintable) myresult2.get(0);
                            session.setAttribute("adminname", obj.getUsername());   
                            response.sendRedirect("adminpanel.jsp");
                            //request.getRequestDispatcher("adminpanel.jsp").forward(request, response);
                      }
                      else
                      {
                          out.println("Wrong username/password");
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
                  
                  
              }
              
              
          %>
                  </td></tr>
           </table>
          </form>
        </div>
            </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
