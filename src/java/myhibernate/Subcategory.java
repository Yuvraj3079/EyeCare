package myhibernate;
// Generated Mar 29, 2017 7:27:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Subcategory generated by hbm2java
 */
public class Subcategory  implements java.io.Serializable {


     private Integer subcatid;
     private Categorytable categorytable;
     private String subcatname;
     private String image;
     private Set producttables = new HashSet(0);

    public Subcategory() {
    }

	
    public Subcategory(Categorytable categorytable, String subcatname, String image) {
        this.categorytable = categorytable;
        this.subcatname = subcatname;
        this.image = image;
    }
    public Subcategory(Categorytable categorytable, String subcatname, String image, Set producttables) {
       this.categorytable = categorytable;
       this.subcatname = subcatname;
       this.image = image;
       this.producttables = producttables;
    }
   
    public Integer getSubcatid() {
        return this.subcatid;
    }
    
    public void setSubcatid(Integer subcatid) {
        this.subcatid = subcatid;
    }
    public Categorytable getCategorytable() {
        return this.categorytable;
    }
    
    public void setCategorytable(Categorytable categorytable) {
        this.categorytable = categorytable;
    }
    public String getSubcatname() {
        return this.subcatname;
    }
    
    public void setSubcatname(String subcatname) {
        this.subcatname = subcatname;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Set getProducttables() {
        return this.producttables;
    }
    
    public void setProducttables(Set producttables) {
        this.producttables = producttables;
    }




}


