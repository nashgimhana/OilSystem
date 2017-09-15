package pojo;
// Generated Sep 15, 2017 10:55:14 AM by Hibernate Tools 4.3.1



/**
 * AttenenceLog generated by hbm2java
 */
public class AttenenceLog  implements java.io.Serializable {


     private Integer id;
     private Attendence attendence;
     private Employee employee;
     private String status;

    public AttenenceLog() {
    }

	
    public AttenenceLog(Attendence attendence, Employee employee) {
        this.attendence = attendence;
        this.employee = employee;
    }
    public AttenenceLog(Attendence attendence, Employee employee, String status) {
       this.attendence = attendence;
       this.employee = employee;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Attendence getAttendence() {
        return this.attendence;
    }
    
    public void setAttendence(Attendence attendence) {
        this.attendence = attendence;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


