<%@page import="myhibernate.Subcategory"%>
<%@page import="myhibernate.Categorytable"%>
<%@page import="myhibernate.Admintable"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="myhibernate.Usertable"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.*"%>
<%
    
Thread.sleep(1000);
    String catid=request.getParameter("categoryid");
  try
                 {
                          Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                   StandardServiceRegistryBuilder builder = 
                           new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                   SessionFactory myfactory = configuration.buildSessionFactory(builder.build());
                  Session mysession=myfactory.openSession();
                  try
                  {
                     
                     
                      Query myquery=mysession.createQuery("from Subcategory P where P.categorytable.catid=" + catid);  
                      
                     
                      List myresult;
                      myresult=myquery.list();
                           out.println("<select name='subcategory' class='form-control'>");                  
                      if(myresult.size()>0)
                      {
                        
                          out.println("<option>Choose Sub Category now</option>");
                          for(int x=0;x<myresult.size();x++)
                          {
                              Subcategory obj2=(Subcategory)myresult.get(x);
                              out.println("<option value=" + obj2.getSubcatid() + ">"+  obj2.getSubcatname() +"</option>");
                          }
                         
                      }
                      else
                      {
                           out.println("<option>No Sub Categories added</option>");
                      }
                       out.println("</select>");
                      
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