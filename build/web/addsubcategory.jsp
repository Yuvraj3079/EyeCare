<%-- 
    Document   : signup
    Created on : Mar 3, 2017, 6:53:09 PM
    Author     : GTB Student
--%>
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
        <title>Add Sub Category</title>        
        <%@include file="headercss.jsp" %>
    </head>
    <body>
        <%@include file="headeradmin.jsp" %>
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black;text-align:center">Add Sub Category</h1>
          <form name="form1" method="post" action="" enctype="multipart/form-data">
            <table width="500" border="0" cellspacing="0" cellpadding="5">
                 <tr>
                <td width="146">Category</td>
                <td width="334"><label for="name"></label>
                    <select name="category" class="form-control">
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
                            out.println("<option value=" + obj.getCatid() + ">" + obj.getCatname() + "</option>");
                            
                          
                           
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
                
                </td>
              </tr>
              <tr>
                <td width="146">Name</td>
                <td width="334"><label for="name"></label>
                <input type="text" name="name" id="uname" class="form-control"></td>
              </tr>
              <tr>
                <td>Image</td>
                <td><input type="file" name="pic"></td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td><input type="submit" name="Submit" id="Submit" value="Submit" class="btn btn-primary btn-lg">
                <input type="reset" name="Reset" id="Reset" value="Reset" class="btn btn-primary btn-lg"></td>
              </tr>
            </table>
          </form>
          <%
         
           String name="", imagename="",path1="",catid="";
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
                name=value;
            }
            else if(itemName1.equals("category")) //control's name - textbox name
           {
                catid=value;
            }
         }
        else
        {
                String type=myitem.getContentType();
                long size=myitem.getSize()/1024; //kbytes
                
                if(size==0)
                {
                    imagename="default.jpg";
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
                  Subcategory obj=new Subcategory();
                
                  Categorytable obj2=new Categorytable();
                  obj2.setCatid(Integer.parseInt(catid));
                  
                  obj.setSubcatname(name);
                  obj.setImage(imagename);
                  obj.setCategorytable(obj2);
                  
                  mysession.beginTransaction();
                  mysession.save(obj);
                  mysession.getTransaction().commit();
                  mysession.close();
                  myfactory.close();
                  out.println("Sub Category added Successfully");
                          
              
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
