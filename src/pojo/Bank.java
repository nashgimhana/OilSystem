package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bank generated by hbm2java
 */
public class Bank  implements java.io.Serializable {


     private Integer id;
     private String bank;
     private Double amount;
     private Set bankDealses = new HashSet(0);
     private Set chequeses = new HashSet(0);

    public Bank() {
    }

    public Bank(String bank, Double amount, Set bankDealses, Set chequeses) {
       this.bank = bank;
       this.amount = amount;
       this.bankDealses = bankDealses;
       this.chequeses = chequeses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBank() {
        return this.bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Set getBankDealses() {
        return this.bankDealses;
    }
    
    public void setBankDealses(Set bankDealses) {
        this.bankDealses = bankDealses;
    }
    public Set getChequeses() {
        return this.chequeses;
    }
    
    public void setChequeses(Set chequeses) {
        this.chequeses = chequeses;
    }




}


