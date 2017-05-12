package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.*;
import java.util.*;
import com.sun.syndication.feed.synd.*;
import com.sun.syndication.io.*;

public final class fetch_005fsports_005frss_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("        <h1>Latest News</h1>\n");
      out.write("        \n");
      out.write("         ");

	
			String rssFeedUrl="http://www.espnfc.com/rss";
			try
			{
				URLConnection feedUrl = new URL(rssFeedUrl).openConnection();
				SyndFeedInput input = new SyndFeedInput();
				SyndFeed feed =null;
				feed=input.build(new XmlReader(feedUrl));
			
				List list = feed.getEntries();
				
				for (int i=0 ; i < list.size(); i++)
				{
					SyndEntry entry = (SyndEntry)list.get(i);
					StringBuilder display =new StringBuilder();
					display.append("<a href=" + entry.getLink() +">" 
                                                + entry.getTitle() +"</a><br>");
					SyndContent mycontent=entry.getDescription();
					display.append(mycontent.getValue());
					out.println(display.toString()+"<br><br>");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
      out.write("\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
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
      out.write("</html>");
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
