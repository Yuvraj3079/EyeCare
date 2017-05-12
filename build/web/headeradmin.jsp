<%
    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    %>
<header id="header">
        <div class="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-4">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +91 98798496846
                            <%
                            if(session.getAttribute("adminname")!=null)
                            {
                                out.print("Welcome " + session.getAttribute("adminname"));
                                 out.print(" <a href='signout.jsp' style='color:white;'>Signout</a>");
                            }
                            else
                            {
                                response.sendRedirect("login.jsp");
                            }
                         %>
                            </p>
                          
                        
                        </div>
                      
                    </div>
                    <div class="col-sm-6 col-xs-8">
                       <div class="social">
                            <ul class="social-share">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                            </ul>
                            <div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                           </div>
                       </div>
                    </div>
                </div>
            </div><!--/.container-->
        </div><!--/.top-bar-->

        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><h1>Eye Care</h1></a>
                </div>
				
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.jsp">Home</a></li>
                      
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Add <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="addcategory.jsp">Categories</a></li>
                                <li><a href="addsubcategory.jsp">Sub Categories</a></li>
                                <li><a href="addproduct.jsp">Products</a></li>
                                
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">List <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="listofusers.jsp">List of Users</a></li>
                                <li><a href="addsubcategory.jsp">Sub Categories</a></li>
                                <li><a href="listofproducts.jsp">Products</a></li>
                                
                            </ul>
                        </li>
                        <li><a href="services.html">Order History</a></li>
                        <li><a href="signup.jsp">Change Password</a></li>
                       
                        <li><a href="login.jsp">Signout</a></li> 
                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
		
    </header><!--/header-->