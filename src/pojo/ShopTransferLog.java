package pojo;
// Generated Aug 2, 2017 11:22:50 AM by Hibernate Tools 4.3.1



/**
 * ShopTransferLog generated by hbm2java
 */
public class ShopTransferLog  implements java.io.Serializable {


     private Integer id;
     private GrnLog grnLog;
     private MoneyBook moneyBook;
     private ShopTransfer shopTransfer;
     private Double quantity;

    public ShopTransferLog() {
    }

	
    public ShopTransferLog(GrnLog grnLog, MoneyBook moneyBook, ShopTransfer shopTransfer) {
        this.grnLog = grnLog;
        this.moneyBook = moneyBook;
        this.shopTransfer = shopTransfer;
    }
    public ShopTransferLog(GrnLog grnLog, MoneyBook moneyBook, ShopTransfer shopTransfer, Double quantity) {
       this.grnLog = grnLog;
       this.moneyBook = moneyBook;
       this.shopTransfer = shopTransfer;
       this.quantity = quantity;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public GrnLog getGrnLog() {
        return this.grnLog;
    }
    
    public void setGrnLog(GrnLog grnLog) {
        this.grnLog = grnLog;
    }
    public MoneyBook getMoneyBook() {
        return this.moneyBook;
    }
    
    public void setMoneyBook(MoneyBook moneyBook) {
        this.moneyBook = moneyBook;
    }
    public ShopTransfer getShopTransfer() {
        return this.shopTransfer;
    }
    
    public void setShopTransfer(ShopTransfer shopTransfer) {
        this.shopTransfer = shopTransfer;
    }
    public Double getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }




}


