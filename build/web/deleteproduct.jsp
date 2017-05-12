<%@page import="myhibernate.Subcategory"%>
<%@page import="myhibernate.Categorytable"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="myhibernate.Producttable"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.*"%>
<%@page import="java.sql.*" %>

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
                        
                      Producttable obj=new Producttable();
                      obj.setQty(0);
                      obj.setName("");
                      obj.setFeatures("");
                      obj.setPrice(0);
                      obj.setImage("");
                      obj.setProductid(Integer.parseInt(request.getParameter("productid")));
                      Categorytable obj2=new Categorytable();
                      obj2.setCatid(0);                      
                      
                      Subcategory obj3=new Subcategory();
                      obj3.setSubcatid(0);
                      obj.setSubcategory(obj3);
                      obj.setCategorytable(obj2);
                          obj.setImage("");

                          mysession.beginTransaction();
                          mysession.delete(obj);
                          mysession.getTransaction().commit();
                         out.print("done");
                      
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