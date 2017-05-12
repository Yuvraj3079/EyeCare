<%
  
    session.invalidate();
    
    Cookie mycookie=new Cookie("adminname",null);
    mycookie.setMaxAge(0);
    response.addCookie(mycookie);
    
    Cookie mycookie2=new Cookie("uname",null);
    mycookie.setMaxAge(0);
    response.addCookie(mycookie2);
    
    response.sendRedirect("index.jsp");


%>