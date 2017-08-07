package pojo;
// Generated Aug 2, 2017 11:22:50 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Supplier generated by hbm2java
 */
public class Supplier  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String adressLine1;
     private String adressLine2;
     private String adressLine3;
     private String contact1;
     private String contact2;
     private String contact3;
     private Integer status;
     private String details;
     private Double currentCredit;
     private Set supplierPays = new HashSet(0);
     private Set supplierCredits = new HashSet(0);
     private Set grns = new HashSet(0);

    public Supplier() {
    }

    public Supplier(String name, String adressLine1, String adressLine2, String adressLine3, String contact1, String contact2, String contact3, Integer status, String details, Double currentCredit, Set supplierPays, Set supplierCredits, Set grns) {
       this.name = name;
       this.adressLine1 = adressLine1;
       this.adressLine2 = adressLine2;
       this.adressLine3 = adressLine3;
       this.contact1 = contact1;
       this.contact2 = contact2;
       this.contact3 = contact3;
       this.status = status;
       this.details = details;
       this.currentCredit = currentCredit;
       this.supplierPays = supplierPays;
       this.supplierCredits = supplierCredits;
       this.grns = grns;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAdressLine1() {
        return this.adressLine1;
    }
    
    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }
    public String getAdressLine2() {
        return this.adressLine2;
    }
    
    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }
    public String getAdressLine3() {
        return this.adressLine3;
    }
    
    public void setAdressLine3(String adressLine3) {
        this.adressLine3 = adressLine3;
    }
    public String getContact1() {
        return this.contact1;
    }
    
    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }
    public String getContact2() {
        return this.contact2;
    }
    
    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }
    public String getContact3() {
        return this.contact3;
    }
    
    public void setContact3(String contact3) {
        this.contact3 = contact3;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    public Double getCurrentCredit() {
        return this.currentCredit;
    }
    
    public void setCurrentCredit(Double currentCredit) {
        this.currentCredit = currentCredit;
    }
    public Set getSupplierPays() {
        return this.supplierPays;
    }
    
    public void setSupplierPays(Set supplierPays) {
        this.supplierPays = supplierPays;
    }
    public Set getSupplierCredits() {
        return this.supplierCredits;
    }
    
    public void setSupplierCredits(Set supplierCredits) {
        this.supplierCredits = supplierCredits;
    }
    public Set getGrns() {
        return this.grns;
    }
    
    public void setGrns(Set grns) {
        this.grns = grns;
    }




}


