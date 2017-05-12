<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>
<%@page import="myhibernate.Producttable"%>
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
          <script src="js/jquery.js"></script>
          <script type="text/javascript">
             
$(document).ready(function() 
{
   $(".mylink").click(function(e){
	 e.preventDefault();
	 var pid=$(this).attr("id") //anchor tag
        
	 var pr1=$(this).parent() //td
	 var pr=$(this).parent().parent(); //tr
          if(confirm("Are u sure you want to delete?"))
                    {
                        
            $.ajax(
		{
			  url: 'deleteproduct.jsp',
			  type: 'post',
			  data: {"productid":pid},
			 beforeSend: function() 
			 {
				 pr1.append("<img src='images/preloader.gif'>");
				
			},
			  success: function(reslt) 
				  {
					if($.trim(reslt)=="done")
					{
						pr.css({'backgroundColor':'#fb6c6c'});
						pr.fadeOut(600,function()
						{
							pr.remove();
						});
					}
					else
					{
						alert("Some Problem occured" + reslt);
					}
				  },
			  error: function(e) 
				  {
					  alert("Error in Ajax" + e)
				  }
			});
                    }
                });
                });
</script>
    </head>
    <body>
        <%@include file="headeradmin.jsp" %>
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black">List of Products</h1>
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
                      double totalrecords=0;
                      
                      totalrecords = ((Long)mysession.createQuery("select count(*) from Producttable").uniqueResult()).intValue();
                      
                      int records_per_page=2;
                      
                      int pages=(int)Math.ceil(totalrecords/records_per_page);
                      int pagenumber;
                      if(request.getParameter("pageno")!=null)
                      {
                          pagenumber=Integer.parseInt(request.getParameter("pageno"));
                      }
                      else
                      {
                          pagenumber=1;
                      }
                      int offset=(int)records_per_page*(pagenumber-1);
                      
                      Query myquery=mysession.createQuery("from Producttable");
                      myquery.setFirstResult(offset);
                      myquery.setMaxResults(records_per_page);
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {
                          out.print("<table class='rwd-table'>"
                                  + "<tr><th>Name</th><th>Price</th><th>Qty</th><th>Image</th><th>Update</th><th>Delete</th></tr>");
                          for(int x=0;x<myresult.size();x++)
                          {
                            Producttable obj=(Producttable) myresult.get(x);
                            out.println("<tr>");
                            out.println("<td>" + obj.getName() + "</td><td>" + obj.getPrice() + "</td><td>" + obj.getQty() + "</td>"
                            + "<td><img src='userimages/" + obj.getImage() + "' width='100px' height='100px'>"
                                    + "<td><a style='color:white' href='updateproduct.jsp?id=" + obj.getProductid() + "'>Update</a></td><td><a style='color:white' id=" +  obj.getProductid() + " href='#' class='mylink'>Delete</a>" );
                            out.println("</tr>");
                           
                          }
                          out.println("</table>");
                          out.println("</table><table align=center cellpadding=10 cellspacing=10 width='20%'><tr>");
                                            for (int i = 1; i <= pages; i++) {
                                                if (i == pagenumber) {

                                                    out.println("<td>" + i + "</td>");
                                                } else {

                                                    out.println("<td><a href='listofproducts.jsp?pageno=" + i + "'>" + i + "</a></td>");

                                                }

                                            }
                                            out.println("</tr></table>");
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
