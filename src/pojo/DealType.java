package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DealType generated by hbm2java
 */
public class DealType  implements java.io.Serializable {


     private Integer id;
     private DealCategory dealCategory;
     private String type;
     private Set moneyBooks = new HashSet(0);

    public DealType() {
    }

	
    public DealType(DealCategory dealCategory) {
        this.dealCategory = dealCategory;
    }
    public DealType(DealCategory dealCategory, String type, Set moneyBooks) {
       this.dealCategory = dealCategory;
       this.type = type;
       this.moneyBooks = moneyBooks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public DealCategory getDealCategory() {
        return this.dealCategory;
    }
    
    public void setDealCategory(DealCategory dealCategory) {
        this.dealCategory = dealCategory;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set getMoneyBooks() {
        return this.moneyBooks;
    }
    
    public void setMoneyBooks(Set moneyBooks) {
        this.moneyBooks = moneyBooks;
    }




}


