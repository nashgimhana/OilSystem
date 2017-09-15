package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MoneyBook generated by hbm2java
 */
public class MoneyBook  implements java.io.Serializable {


     private Integer id;
     private DealCategory dealCategory;
     private DealType dealType;
     private Date date;
     private String dscription;
     private Double amount;
     private Set invoicePays = new HashSet(0);
     private Set salaries = new HashSet(0);
     private Set customerPays = new HashSet(0);
     private Set routeDebits = new HashSet(0);
     private Set empCredits = new HashSet(0);
     private Set supplierPays = new HashSet(0);
     private Set shopTransferLogs = new HashSet(0);

    public MoneyBook() {
    }

	
    public MoneyBook(DealCategory dealCategory, DealType dealType) {
        this.dealCategory = dealCategory;
        this.dealType = dealType;
    }
    public MoneyBook(DealCategory dealCategory, DealType dealType, Date date, String dscription, Double amount, Set invoicePays, Set salaries, Set customerPays, Set routeDebits, Set empCredits, Set supplierPays, Set shopTransferLogs) {
       this.dealCategory = dealCategory;
       this.dealType = dealType;
       this.date = date;
       this.dscription = dscription;
       this.amount = amount;
       this.invoicePays = invoicePays;
       this.salaries = salaries;
       this.customerPays = customerPays;
       this.routeDebits = routeDebits;
       this.empCredits = empCredits;
       this.supplierPays = supplierPays;
       this.shopTransferLogs = shopTransferLogs;
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
    public DealType getDealType() {
        return this.dealType;
    }
    
    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDscription() {
        return this.dscription;
    }
    
    public void setDscription(String dscription) {
        this.dscription = dscription;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Set getInvoicePays() {
        return this.invoicePays;
    }
    
    public void setInvoicePays(Set invoicePays) {
        this.invoicePays = invoicePays;
    }
    public Set getSalaries() {
        return this.salaries;
    }
    
    public void setSalaries(Set salaries) {
        this.salaries = salaries;
    }
    public Set getCustomerPays() {
        return this.customerPays;
    }
    
    public void setCustomerPays(Set customerPays) {
        this.customerPays = customerPays;
    }
    public Set getRouteDebits() {
        return this.routeDebits;
    }
    
    public void setRouteDebits(Set routeDebits) {
        this.routeDebits = routeDebits;
    }
    public Set getEmpCredits() {
        return this.empCredits;
    }
    
    public void setEmpCredits(Set empCredits) {
        this.empCredits = empCredits;
    }
    public Set getSupplierPays() {
        return this.supplierPays;
    }
    
    public void setSupplierPays(Set supplierPays) {
        this.supplierPays = supplierPays;
    }
    public Set getShopTransferLogs() {
        return this.shopTransferLogs;
    }
    
    public void setShopTransferLogs(Set shopTransferLogs) {
        this.shopTransferLogs = shopTransferLogs;
    }




}


