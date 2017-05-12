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
        <script src="js/tinymce.min.js"></script>
         <script>
            tinymce.init({
  selector: '#features',
  height: 500,
  theme: 'modern',
  plugins: [
    'advlist autolink lists link image charmap print preview hr anchor pagebreak',
    'searchreplace wordcount visualblocks visualchars code fullscreen',
    'insertdatetime media nonbreaking save table contextmenu directionality',
    'emoticons template paste textcolor colorpicker textpattern imagetools codesample toc'
  ],
  toolbar1: 'undo redo | insert | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image',
  toolbar2: 'print preview media | forecolor backcolor emoticons | codesample',
  image_advtab: true,
  templates: [
    { title: 'Test template 1', content: 'Test 1' },
    { title: 'Test template 2', content: 'Test 2' }
  ],
  content_css: [
    '//fonts.googleapis.com/css?family=Lato:300,300i,400,400i',
    '//www.tinymce.com/css/codepen.min.css'
  ]
 });
         </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#form1").submit(function(e){
                    e.preventDefault();
                    var data = new FormData($(this)[0]);
                   // var data=("#form1").serialize();
                    $.ajax(
                            {
                           method: "post",
                           url: "ajax2.jsp",
                           contentType : false,
                           processData : false,
                           cache : false,
                           data: data,
                           beforeSend:function(){
                               $("#answer2").html("<img src='images/preloader.gif'>")
                           }
                       })
                           .done(function( msg ) {
                            $("#answer2").html(msg)
                           
                            });
                    
                });
                
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
                           data: { categoryid: catid },
                           beforeSend:function(){
                               $("#answer").html("<img src='images/preloader.gif'>")
                           }
                       })
                           .done(function( msg ) {
                            $("#answer").html("")
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
        <section id="contact-page">
        <div class="container">
            
          <h1 style="color:black;text-align:center">Add Product</h1>
          <form name="form1" id="form1" method="post" action="" enctype="multipart/form-data">
            <table width="80%" border="0" cellspacing="0" cellpadding="5">
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
          <div id="answer"></div>
                </td>
              </tr>
              <tr>
              <td width="146">Sub Category</td>
                <td width="334"><label for="subcategory"></label>
                    <div id="newselectbox"></div>
                    <div id="oldselectbox">
                        <select name="subcategory2" class="form-control">
                            <option>Choose Category First</option>
                        </select>
                    </div>
                </td>
              </tr>
              <tr>
                <td width="146">Name</td>
                <td width="334"><label for="name"></label>
                <input type="text" name="name" id="name" class="form-control"></td>
              </tr>
               <tr>
                <td width="146">Price</td>
                <td width="334"><label for="price"></label>
                <input type="text" name="price" id="price" class="form-control"></td>
              </tr>
               <tr>
                <td width="146">Quantity</td>
                <td width="334"><label for="quantity"></label>
                    <input type="text" name="quantity" id="quantity" class="form-control">
                </td>
              </tr>
              <tr>
                <td width="146">Features</td>
                <td width="600"><label for="features"></label>
                    <textarea name="features" class="form-control" id="features" rows="15" cols="15"></textarea>
                </td>
              </tr>
              <tr>
                <td>Image</td>
                <td><input type="file" name="pic"></td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td><input type="submit" name="Submit" id="Submit" value="Submit" class="btn btn-primary btn-lg" onclick="tinyMCE.triggerSave(true,true);">
                <input type="reset" name="Reset" id="Reset" value="Reset" class="btn btn-primary btn-lg"></td>
              </tr>
              <tr><td></td><td><span id="answer2"></span></td></tr>
            </table>
          </form>
          
        </div>
            </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
