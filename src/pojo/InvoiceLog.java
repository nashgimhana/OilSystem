package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1



/**
 * InvoiceLog generated by hbm2java
 */
public class InvoiceLog  implements java.io.Serializable {


     private Integer id;
     private Invoice invoice;
     private Product product;
     private Double qty;
     private Double price;
     private Double total;

    public InvoiceLog() {
    }

	
    public InvoiceLog(Invoice invoice, Product product) {
        this.invoice = invoice;
        this.product = product;
    }
    public InvoiceLog(Invoice invoice, Product product, Double qty, Double price, Double total) {
       this.invoice = invoice;
       this.product = product;
       this.qty = qty;
       this.price = price;
       this.total = total;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Double getQty() {
        return this.qty;
    }
    
    public void setQty(Double qty) {
        this.qty = qty;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }




}


