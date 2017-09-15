package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * RouteCredit generated by hbm2java
 */
public class RouteCredit  implements java.io.Serializable {


     private Integer id;
     private RouteReg routeReg;
     private Date date;
     private Double credit;

    public RouteCredit() {
    }

	
    public RouteCredit(RouteReg routeReg) {
        this.routeReg = routeReg;
    }
    public RouteCredit(RouteReg routeReg, Date date, Double credit) {
       this.routeReg = routeReg;
       this.date = date;
       this.credit = credit;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public RouteReg getRouteReg() {
        return this.routeReg;
    }
    
    public void setRouteReg(RouteReg routeReg) {
        this.routeReg = routeReg;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getCredit() {
        return this.credit;
    }
    
    public void setCredit(Double credit) {
        this.credit = credit;
    }




}


