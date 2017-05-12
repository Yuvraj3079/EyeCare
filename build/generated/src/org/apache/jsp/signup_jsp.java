package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import myhibernate.Usertable;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import java.sql.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/variables.jsp");
    _jspx_dependants.add("/headercss.jsp");
    _jspx_dependants.add("/header.jsp");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<header id=\"header\">\n");
      out.write("        <div class=\"top-bar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-xs-4\">\n");
      out.write("                        <div class=\"top-number\"><p><i class=\"fa fa-phone-square\"></i>  +91 98798496846\n");
      out.write("                             ");

                            if(session.getAttribute("uname")!=null)
                            {
                                out.print("Welcome " + session.getAttribute("name"));
                                out.print(" <a href='signout.jsp' style='color:white;'>Signout</a>");
                            }
                            
      out.write("\n");
      out.write("                            </p></div>\n");
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
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"products.jsp?catid=1\">Sun Glasses</a></li>\n");
      out.write("                                <li><a href=\"products.jsp?catid=2\">Eye Frames</a></li>\n");
      out.write("                                <li><a href=\"404.html\">404</a></li>\n");
      out.write("                                <li><a href=\"shortcodes.html\">Shortcodes</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"services.html\">Offers</a></li>\n");
      out.write("                         ");

                            if(session.getAttribute("uname")!=null)
                            {
                                out.print("<li><a href='orders.jsp'>My Orders</a></li>");
                                 out.print("<li><a href='account.jsp'>My Account</a></li>");
                            }
                            else
                            {
                                 out.print("<li><a href='signup.jsp'>Signup</a></li>");
                                 out.print("<li><a href='login.jsp'>Login</a></li>");
                        
                            }
                            
      out.write("\n");
      out.write("                       \n");
      out.write("                        <li><a href=\"contact-us.html\">Contact</a></li>                        \n");
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
      out.write("          <h1 style=\"color:black;text-align:center\">Signup</h1>\n");
      out.write("          <form name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("            <table width=\"500\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\n");
      out.write("              <tr>\n");
      out.write("                <td width=\"146\">Username</td>\n");
      out.write("                <td width=\"334\"><label for=\"uname\"></label>\n");
      out.write("                <input type=\"text\" name=\"uname\" id=\"uname\" class=\"form-control\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td><label for=\"password\"></label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td><label for=\"name\"></label>\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"name\" class=\"form-control\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Address</td>\n");
      out.write("                <td><label for=\"address\"></label>\n");
      out.write("                <textarea name=\"address\" cols=\"50\" rows=\"5\" id=\"address\" class=\"form-control\"></textarea></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Phone</td>\n");
      out.write("                <td><label for=\"phone\"></label>\n");
      out.write("                <input type=\"text\" name=\"phone\" id=\"phone\" class=\"form-control\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>EmailId</td>\n");
      out.write("                <td><label for=\"emailid\"></label>\n");
      out.write("                <input type=\"text\" name=\"emailid\" id=\"emailid\" class=\"form-control\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Gender</td>\n");
      out.write("                <td><p>\n");
      out.write("                  <label>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"male\" id=\"gender_0\">\n");
      out.write("                    Male</label>\n");
      out.write("                  \n");
      out.write("                  <label>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\" id=\"gender_1\">\n");
      out.write("                    Female</label>\n");
      out.write("                  <br>\n");
      out.write("                </p></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Country</td>\n");
      out.write("                <td><label for=\"country\"></label>\n");
      out.write("                  <select name=\"country\" id=\"country\" class=\"form-control\">\n");
      out.write("                    <option>Choose Country</option>\n");
      out.write("                    <option value=\"ind\">India</option>\n");
      out.write("                    <option value=\"aus\">Australia</option>\n");
      out.write("                </select></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>&nbsp;</td>\n");
      out.write("                <td><input type=\"submit\" name=\"Submit\" id=\"Submit\" value=\"Submit\" class=\"btn btn-primary btn-lg\">\n");
      out.write("                <input type=\"reset\" name=\"Reset\" id=\"Reset\" value=\"Reset\" class=\"btn btn-primary btn-lg\"></td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("          ");

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
