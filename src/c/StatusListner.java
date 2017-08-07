/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import m.MoneyBook;
import m.Product;
import m.Units;

/**
 *
 * @author suhada
 */
public class StatusListner implements AncestorListener {

    private StatusListner() {
    }
    private static StatusListner StatusListner = null;

    public static StatusListner getInstance() {
        if (StatusListner == null) {
            StatusListner = new StatusListner();
        }
        return StatusListner;
    }
    private v.Status status = null;

    public void setStatus(v.Status status) {
        this.status = status;
    }

    @Override
    public void ancestorAdded(AncestorEvent e) {
        if (e.getComponent().getAccessibleContext().getAccessibleName().equalsIgnoreCase("status")) {
            setProductSummoryToTable(this.status.tbl_currentstock);
            MoneyBook moneyBook = new m.MoneyBook();
            this.status.lbl_income_today.setText(m.ValueValidation.getInstance().toDeciaml(moneyBook.getTotalIncomeBy(new Date()), 2) + "");
            this.status.lbl_expend_today.setText(m.ValueValidation.getInstance().toDeciaml(moneyBook.getTotalExpendBy(new Date()), 2) + "");
            this.status.lbl_customer_count.setText(new m.Customer().getCustomerCount()+"");
            this.status.lbl_customer_total_credit.setText(new m.CusCredit().getTotalCredit()+"");
            this.status.lbl_employee_count.setText(new m.Employee().getEmployeeCount()+"");
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {

    }

    @Override
    public void ancestorMoved(AncestorEvent event) {

    }

    public void setProductSummoryToTable(JTable table) {
        try {
            Product products = new Product();
            ArrayList<pojo.Product> prlist = products.getAll();
            DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
            defaultTableModel.setRowCount(0);
            if (prlist != null && !prlist.isEmpty()) {
                Units units = new m.Units();
                for (pojo.Product p : prlist) {
                    pojo.Units un = units.getBy(p.getUnits().getId());
                    Vector v = new Vector();
                    v.add(p.getId().toString());
                    v.add(p.getName().toString() + " (" + un.getUnitName().toString() + ")");

                    double crntstock = p.getCurrentStock();
                    crntstock = (Math.round(crntstock * 100.0) / 100.0);

                    v.add((crntstock != 0) ? crntstock : 0.0);
                    double crntprice = p.getCurrentPrice();
                    crntprice = (Math.round(crntprice * 100.0) / 100.0);
                    v.add((crntprice != 0) ? crntprice : 0.0);
                    defaultTableModel.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Errormzg.displayerrorMessage("Connot Load Stock Data");
        }

    }

}
