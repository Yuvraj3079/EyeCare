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
<%@include file="variables.jsp" %>
<%
         
           String category="", subcategory="", productname="", features="", price="",imagename="",path1="",qty="";
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
                  
                  
                  mysession.beginTransaction();
                  mysession.save(obj);
                  mysession.getTransaction().commit();
                  mysession.close();
                  myfactory.close();
                  out.println("Product added Successfully");
                          
              
              }
              catch(Exception e)
              {
                  out.println("Error Occured while establishing connection " + e.getMessage());
              }
   }
    }
        %>