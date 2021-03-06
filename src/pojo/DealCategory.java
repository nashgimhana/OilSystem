package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DealCategory generated by hbm2java
 */
public class DealCategory  implements java.io.Serializable {


     private Integer id;
     private String category;
     private Set dealTypes = new HashSet(0);
     private Set moneyBooks = new HashSet(0);

    public DealCategory() {
    }

    public DealCategory(String category, Set dealTypes, Set moneyBooks) {
       this.category = category;
       this.dealTypes = dealTypes;
       this.moneyBooks = moneyBooks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public Set getDealTypes() {
        return this.dealTypes;
    }
    
    public void setDealTypes(Set dealTypes) {
        this.dealTypes = dealTypes;
    }
    public Set getMoneyBooks() {
        return this.moneyBooks;
    }
    
    public void setMoneyBooks(Set moneyBooks) {
        this.moneyBooks = moneyBooks;
    }




}


