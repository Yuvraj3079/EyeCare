<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>
<%@page import="myhibernate.Producttable"%>
<%@page import="myhibernate.Subcategory"%>
<%@page import="myhibernate.Categorytable"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
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
        <title>Add Product</title>        
        <%@include file="headercss.jsp" %>
        <script src="js/jquery-3.2.0.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#category").change(function(){
                    catid=$("#category").val();
                    if(catid=="Choose Category")
                    {
                        alert("Please Choose some Category")
                    }
                    else
                    {
                     $.ajax({method: "post",
                           url: "myajax.jsp",
                           data: { categoryid: catid }
                       })
                           .done(function( msg ) {
                            $("#newselectbox").html(msg) ;
                            $("#oldselectbox").hide();
                            });
                        
                    }
                    });
                    
            });
            
        </script>
    </head>
    <body>
        <%@include file="headeradmin.jsp" %>
          <%
             String category="", subcategory="",productname="", features="", price="",imagename="",path1="",qty="",productid="";
             
                 try
                 {
                          Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                   StandardServiceRegistryBuilder builder = 
                           new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                   SessionFactory myfactory = configuration.buildSessionFactory(builder.build());
                  Session mysession=myfactory.openSession();
                  try
                  {
                      
                      Query myquery=mysession.createQuery("from Producttable where productid=:id");
                      myquery.setParameter("id", Integer.parseInt(request.getParameter("id")));
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {                        
                         
                            
                            
                             Producttable obj3=(Producttable) myresult.get(0);
                             productname=obj3.getName();
                             features=obj3.getFeatures();
                             price=String.valueOf(obj3.getPrice());
                             imagename=obj3.getImage();
                             session.setAttribute("imagename", imagename);
                             qty=String.valueOf(obj3.getQty());
                             Categorytable obj=obj3.getCategorytable();
                             category=String.valueOf(obj.getCatid());
                             Subcategory obj2=obj3.getSubcategory();
                             subcategory=String.valueOf(obj2.getSubcatid());
                  
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
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black;text-align:center">Update Product</h1>
          <form name="form1" method="post" action="" enctype="multipart/form-data">
            <table width="500" border="0" cellspacing="0" cellpadding="5">
                 <tr>
                <td width="146">Category</td>
                <td width="334"><label for="name"></label>
                    <select name="category" id="category" class="form-control">
                        <option>Choose Category</option>
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
                      
                      Query myquery=mysession.createQuery("from Categorytable");
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {                        
                          for(int x=0;x<myresult.size();x++)
                          {                              
                            Categorytable obj=(Categorytable) myresult.get(x);
                            if(obj.getCatid().toString().equals(category))
                            {
                                 out.println("<option value=" + obj.getCatid() + " selected>" + obj.getCatname() + "</option>");
                            }
                            else
                            {
                            out.println("<option value=" + obj.getCatid() + ">" + obj.getCatname() + "</option>");
                            }
                          }
                  
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
                        
                        
                        
                        
                    </select>
          <div id="answer"></div>
                </td>
              </tr>
              <tr>
              <td width="146">Sub Category</td>
                <td width="334"><label for="subcategory"></label>
                    <div id="newselectbox"></div>
                    <div id="oldselectbox">
                        <select name="subcategory2" class="form-control">
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
                      
                      Query myquery=mysession.createQuery("from Subcategory where catid=:catid");
                      myquery.setParameter("catid", category);
                      List myresult;
                      myresult=myquery.list();
                      if(myresult.size()>0)
                      {                        
                          for(int x=0;x<myresult.size();x++)
                          {                              
                            Subcategory obj=(Subcategory) myresult.get(x);
                            if(obj.getSubcatid().toString().equals(subcategory))
                            {
                                 out.println("<option value=" + obj.getSubcatid() + " selected>" + obj.getSubcatname() + "</option>");
                            }
                            else
                            {
                            out.println("<option value=" + obj.getSubcatid() + ">" + obj.getSubcatname() + "</option>");
                            }
                          }
                  
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
                        </select>
                    </div>
                </td>
              </tr>
              <tr>
                <td width="146">Name</td>
                <td width="334"><label for="name"></label>
                <input type="text" name="name" id="name" class="form-control" value="<%=productname%>" ></td>
              </tr>
               <tr>
                <td width="146">Price</td>
                <td width="334"><label for="price"></label>
                <input type="text" name="price" id="price" class="form-control" value="<%=price%>"></td>
              </tr>
               <tr>
                <td width="146">Quantity</td>
                <td width="334"><label for="quantity"></label>
                    <input type="text" name="quantity" id="quantity" class="form-control" value="<%=qty%>">
                </td>
              </tr>
              <tr>
                <td width="146">Features</td>
                <td width="334"><label for="features"></label>
                    <textarea name="features" class="form-control"><%=features%></textarea>
                </td>
              </tr>
              <tr>
                <td>Image</td>
                <td><input type="file" name="pic"><% out.print("<img src='userimages/" + imagename + "' width='75px' height='75px'>");%></td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td>
                    <input type="hidden" name="productid" value="<%=request.getParameter("id")%>">
                    <input type="submit" name="Submit" id="Submit" value="Update" class="btn btn-primary btn-lg">
                <input type="reset" name="Reset" id="Reset" value="Reset" class="btn btn-primary btn-lg"></td>
              </tr>
            </table>
          </form>
          <%
         
          
           boolean successful=true;
              boolean isMultipart = ServletFileUpload.isMultipartContent(request);
              
    if(isMultipart)
    {
   
    FileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);
    List<FileItem> items = null;
   try
   {
   items = upload.parseRequest(request);
   }
   catch (FileUploadException e)
   {
       e.printStackTrace();
   }
   
   for(FileItem myitem:items)
   {
        if (myitem.isFormField())
        {
            String itemName1 = myitem.getFieldName();
            String value=myitem.getString();
          
            if(itemName1.equals("name")) //control's name - textbox name
           {
                productname=value;
            }
            else if(itemName1.equals("category")) //control's name - textbox name
           {
                category=value;
            }
             else if(itemName1.equals("subcategory")) //control's name - textbox name
           {
                subcategory=value;
            }
             else if(itemName1.equals("price")) //control's name - textbox name
           {
                price=value;
            }
               else if(itemName1.equals("quantity")) //control's name - textbox name
           {
                qty=value;
            }
             else if(itemName1.equals("features")) //control's name - textbox name
           {
                features=value;
            }
              else if(itemName1.equals("productid")) //control's name - textbox name
           {
                productid=value;
            }
         }
        else
        {
                String type=myitem.getContentType();
                long size=myitem.getSize()/1024; //kbytes
                
                if(size==0)
                {
                    imagename=session.getAttribute("imagename").toString();
                }
                else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                        || type.equals("image/png") || type.equals("image/x-png")
                        || type.equals("image/gif")) && size<400)
                    {
                        
               
               imagename=new java.util.Date().getTime()+myitem.getName();
                path=config.getServletContext().getRealPath("/") + "userimages\\" + imagename;
                File savefile=new File(path);
                myitem.write(savefile);    
                
               
                }
                else
                    {
                        successful=false;
                        out.println("Sorry only pictures of less than 400kb are allowed to upload");
                    }
                        
        }
   
  }
   
   if(successful==true)
   {
       try
              {
                  Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                   StandardServiceRegistryBuilder builder = 
                           new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                   SessionFactory myfactory = configuration.buildSessionFactory(builder.build());
                  Session mysession=myfactory.openSession();
                  
                  Producttable obj=new Producttable();
                
                  Categorytable obj2=new Categorytable();
                  obj2.setCatid(Integer.parseInt(category));
                  
                  Subcategory obj3=new Subcategory();
                  obj3.setSubcatid(Integer.parseInt(subcategory));
                  
                  obj.setCategorytable(obj2);
                  obj.setSubcategory(obj3);
                  obj.setName(productname);
                  obj.setPrice(Integer.parseInt(price));
                  obj.setQty(Integer.parseInt(qty));
                  obj.setFeatures(features);                  
                  obj.setImage(imagename);
                  obj.setProductid(Integer.parseInt(productid));
                  
                  mysession.beginTransaction();
                  mysession.update(obj);
                  mysession.getTransaction().commit();
                  mysession.close();
                  myfactory.close();
                  out.println("Product updated Successfully");
                          
              
              }
              catch(Exception e)
              {
                  out.println("Error Occured while establishing connection " + e.getMessage());
              }
   }
    }
        %>
        </div>
            </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
