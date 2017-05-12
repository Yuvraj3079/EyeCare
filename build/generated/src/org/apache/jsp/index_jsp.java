package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import myhibernate.Categorytable;
import java.util.List;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import myhibernate.Usertable;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Welcome to EyeCare</title>\n");
      out.write("      ");
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
      out.write("                        <li><a href=\"contactus.jsp\">Contact</a></li>                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </nav><!--/nav-->\n");
      out.write("\t\t\n");
      out.write("    </header><!--/header-->");
      out.write("\n");
      out.write("        <section id=\"main-slider\" class=\"no-margin\">\n");
      out.write("        <div class=\"carousel slide\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("                <div class=\"item active\" style=\"background-image: url(images/slider/bg1.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("                                    <h1 class=\"animation animated-item-1\">Welcome to Eye Care</h1>\n");
      out.write("                                    <h2 class=\"animation animated-item-2\">A place to find excellent spectacles at reasonable cost</h2>\n");
      out.write("                                    <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 hidden-xs animation animated-item-4\">\n");
      out.write("                                <div class=\"slider-img\">\n");
      out.write("                                    <img src=\"images/slider/women.jpg\" class=\"img-responsive\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("\n");
      out.write("                <div class=\"item\" style=\"background-image: url(images/slider/bg2.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("                                    <h1 class=\"animation animated-item-1\">Lorem ipsum dolor sit amet consectetur adipisicing elit</h1>\n");
      out.write("                                    <h2 class=\"animation animated-item-2\">Accusantium doloremque laudantium totam rem aperiam, eaque ipsa...</h2>\n");
      out.write("                                    <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 hidden-xs animation animated-item-4\">\n");
      out.write("                                <div class=\"slider-img\">\n");
      out.write("                                    <img src=\"images/slider/img2.png\" class=\"img-responsive\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("\n");
      out.write("                <div class=\"item\" style=\"background-image: url(images/slider/bg3.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("                                    <h1 class=\"animation animated-item-1\">Lorem ipsum dolor sit amet consectetur adipisicing elit</h1>\n");
      out.write("                                    <h2 class=\"animation animated-item-2\">Accusantium doloremque laudantium totam rem aperiam, eaque ipsa...</h2>\n");
      out.write("                                    <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 hidden-xs animation animated-item-4\">\n");
      out.write("                                <div class=\"slider-img\">\n");
      out.write("                                    <img src=\"images/slider/img3.png\" class=\"img-responsive\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("            </div><!--/.carousel-inner-->\n");
      out.write("        </div><!--/.carousel-->\n");
      out.write("        <a class=\"prev hidden-xs\" href=\"#main-slider\" data-slide=\"prev\">\n");
      out.write("            <i class=\"fa fa-chevron-left\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"next hidden-xs\" href=\"#main-slider\" data-slide=\"next\">\n");
      out.write("            <i class=\"fa fa-chevron-right\"></i>\n");
      out.write("        </a>\n");
      out.write("    </section><!--/#main-slider-->\n");
      out.write("        <section id=\"recent-works\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"center wow fadeInDown\">\n");
      out.write("                <h2>Categories</h2>                \n");
      out.write("            </div>\n");

             
                 try
                 {
                          Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                   StandardServiceRegistryBuilder builder = 
                           new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                   SessionFactory myfactory = configuration.buildSessionFactory(builder.build());
                  Session mysession=myfactory.openSession();
                  try
                  {
                      
                      Query myquery=mysession.createQuery("from Categorytable");
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {
                          out.print("<table cellpadding=10px width='80%'>"
                                  + "<tr>");
                          int counter=1;
                          for(int x=0;x<myresult.size();x++)
                          {
                            Categorytable obj=(Categorytable) myresult.get(x);
                           
                            out.println("<td align=center><a href='showcategories.jsp?id=" + obj.getCatid() + "'><img src='userimages/" + obj.getImage() + "' width='200px' height='200px'>"
                                    + "<br> " + obj.getCatname() + "</a></td>");
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
      out.write("           \n");
      out.write("           \n");
      out.write("        </div><!--/.container-->\n");
      out.write("    </section><!--/#recent-works-->\n");
      out.write("    <section id=\"feature\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"center wow fadeInDown\">\n");
      out.write("                <h2>Features</h2>\n");
      out.write("                <p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut <br> et dolore magna aliqua. Ut enim ad minim veniam</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"features\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-bullhorn\"></i>\n");
      out.write("                            <h2>Fresh and Clean</h2>\n");
      out.write("                            <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-comments\"></i>\n");
      out.write("                            <h2>Retina ready</h2>\n");
      out.write("                            <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-cloud-download\"></i>\n");
      out.write("                            <h2>Easy to customize</h2>\n");
      out.write("                            <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("                \n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-leaf\"></i>\n");
      out.write("                            <h2>Adipisicing elit</h2>\n");
      out.write("                            <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-cogs\"></i>\n");
      out.write("                            <h2>Sed do eiusmod</h2>\n");
      out.write("                            <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-heart\"></i>\n");
      out.write("                            <h2>Labore et dolore</h2>\n");
      out.write("                            <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("                </div><!--/.services-->\n");
      out.write("            </div><!--/.row-->    \n");
      out.write("        </div><!--/.container-->\n");
      out.write("    </section><!--/#feature-->\n");
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
