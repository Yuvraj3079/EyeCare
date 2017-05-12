<%-- 
    Document   : latestnews
    Created on : Nov 5, 2016, 12:37:35 PM
    Author     : gtb
--%>
<%@page import="java.net.*"%>
<%@ page import="java.util.*"%>  
<%@ page import="com.sun.syndication.feed.synd.*"%>  
<%@ page import="com.sun.syndication.io.*"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
        <div class="container">
        <h1>Latest News</h1>
        
         <%
	
			String rssFeedUrl="https://api.foxsports.com/v1/rss?partnerKey=zBaFxRyGKCfxBagJG9b8pqLyndmvo7UU&tag=soccer";
			try
			{
				URLConnection feedUrl = new URL(rssFeedUrl).openConnection();
				SyndFeedInput input = new SyndFeedInput();
				SyndFeed feed =null;
				feed=input.build(new XmlReader(feedUrl));
			
				List list = feed.getEntries();
				
				for (int i=0 ; i < 5; i++)
				{
					SyndEntry entry = (SyndEntry)list.get(i);
					StringBuilder display =new StringBuilder();
					display.append("<h3>" + entry.getTitle() +"</h3>");
					SyndContent mycontent=entry.getDescription();
					display.append(mycontent.getValue());
					out.println(display.toString()+"<br><br>");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	%>
        
        </div>
        
      
    </body>
</html>