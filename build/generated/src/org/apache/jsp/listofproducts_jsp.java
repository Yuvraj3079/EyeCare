package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import myhibernate.Producttable;
import java.util.List;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import myhibernate.Usertable;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import java.sql.*;

public final class listofproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/variables.jsp");
    _jspx_dependants.add("/headercss.jsp");
    _jspx_dependants.add("/headeradmin.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     String path="jdbc:mysql://localhost/";
     String place="eyecaredb";  
     String username="root";
     String password="";
     String salt="#$%#$%#$%#@$%$#";
     String adminsalt="#$%#$%##$";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Signup</title>        \n");
      out.write("        ");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">");
      out.write("\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("          <script src=\"js/jquery.js\"></script>\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("             \n");
      out.write("$(document).ready(function() \n");
      out.write("{\n");
      out.write("   $(\".mylink\").click(function(e){\n");
      out.write("\t e.preventDefault();\n");
      out.write("\t var pid=$(this).attr(\"id\") //anchor tag\n");
      out.write("        \n");
      out.write("\t var pr1=$(this).parent() //td\n");
      out.write("\t var pr=$(this).parent().parent(); //tr\n");
      out.write("          if(confirm(\"Are u sure you want to delete?\"))\n");
      out.write("                    {\n");
      out.write("                        \n");
      out.write("            $.ajax(\n");
      out.write("\t\t{\n");
      out.write("\t\t\t  url: 'deleteproduct.jsp',\n");
      out.write("\t\t\t  type: 'post',\n");
      out.write("\t\t\t  data: {\"productid\":pid},\n");
      out.write("\t\t\t beforeSend: function() \n");
      out.write("\t\t\t {\n");
      out.write("\t\t\t\t pr1.append(\"<img src='images/preloader.gif'>\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t  success: function(reslt) \n");
      out.write("\t\t\t\t  {\n");
      out.write("\t\t\t\t\tif($.trim(reslt)==\"done\")\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tpr.css({'backgroundColor':'#fb6c6c'});\n");
      out.write("\t\t\t\t\t\tpr.fadeOut(600,function()\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tpr.remove();\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\talert(\"Some Problem occured\" + reslt);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t  },\n");
      out.write("\t\t\t  error: function(e) \n");
      out.write("\t\t\t\t  {\n");
      out.write("\t\t\t\t\t  alert(\"Error in Ajax\" + e)\n");
      out.write("\t\t\t\t  }\n");
      out.write("\t\t\t});\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                });\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    
      out.write("\n");
      out.write("<header id=\"header\">\n");
      out.write("        <div class=\"top-bar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-xs-4\">\n");
      out.write("                        <div class=\"top-number\"><p><i class=\"fa fa-phone-square\"></i>  +91 98798496846\n");
      out.write("                            ");

                            if(session.getAttribute("adminname")!=null)
                            {
                                out.print("Welcome " + session.getAttribute("adminname"));
                                 out.print(" <a href='signout.jsp' style='color:white;'>Signout</a>");
                            }
                            else
                            {
                                response.sendRedirect("login.jsp");
                            }
                         
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                          \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 col-xs-8\">\n");
      out.write("                       <div class=\"social\">\n");
      out.write("                            <ul class=\"social-share\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li> \n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-skype\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"search\">\n");
      out.write("                                <form role=\"form\">\n");
      out.write("                                    <input type=\"text\" class=\"search-form\" autocomplete=\"off\" placeholder=\"Search\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </form>\n");
      out.write("                           </div>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </div><!--/.top-bar-->\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\" role=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\"><h1>Eye Care</h1></a>\n");
      out.write("                </div>\n");
      out.write("\t\t\t\t\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                      \n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Add <i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"addcategory.jsp\">Categories</a></li>\n");
      out.write("                                <li><a href=\"addsubcategory.jsp\">Sub Categories</a></li>\n");
      out.write("                                <li><a href=\"addproduct.jsp\">Products</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">List <i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"listofusers.jsp\">List of Users</a></li>\n");
      out.write("                                <li><a href=\"addsubcategory.jsp\">Sub Categories</a></li>\n");
      out.write("                                <li><a href=\"listofproducts.jsp\">Products</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"services.html\">Order History</a></li>\n");
      out.write("                        <li><a href=\"signup.jsp\">Change Password</a></li>\n");
      out.write("                       \n");
      out.write("                        <li><a href=\"login.jsp\">Signout</a></li> \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </nav><!--/nav-->\n");
      out.write("\t\t\n");
      out.write("    </header><!--/header-->");
      out.write("\n");
      out.write("        <section id=\"contact-page\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("          <h1 style=\"color:black\">List of Products</h1>\n");
      out.write("          ");

             
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
                      out.println(totalrecords);
                      
                      
                      Query myquery=mysession.createQuery("from Producttable");
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
                  
                  
             
              
              
          
      out.write("\n");
      out.write("        </div>\n");
      out.write("            </section>\n");
      out.write("        ");
      out.write("<footer id=\"footer\" class=\"midnight-blue\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    &copy; 2013 <a target=\"_blank\" href=\"http://shapebootstrap.net/\" title=\"Free Twitter Bootstrap WordPress Themes and HTML templates\">ShapeBootstrap</a>. All Rights Reserved.\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <ul class=\"pull-right\">\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Faq</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer><!--/#footer-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\r\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
