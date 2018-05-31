/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import c.Errormzg;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojo.DeliveryItemLog;
import pojo.GrnLog;
import pojo.Product;
import pojo.Units;

/**
 *
 * @author Nash
 */
public class DiliveryLoad {

    public void savediliveryload(JTable table, pojo.Delivery d) {
        try {
            System.out.println("calling");
            for (int i = 0; i < table.getRowCount(); i++) {
                System.out.println("dil id = " + d.getId());

                System.out.println("prodct " + table.getValueAt(i, 0).toString());
                pojo.DiliveryLoad load = new pojo.DiliveryLoad();
                Product p = new m.Product().getByName(table.getValueAt(i, 0).toString());
                load.setProduct(p);
                load.setDelivery(d);
                load.setLoadqty(Double.parseDouble(table.getValueAt(i, 3).toString()));
                load.setCrntPrice(p.getCurrentPrice());
                load.setReturnqty(Double.parseDouble(table.getValueAt(i, 4).toString()));
                int save = new m.DiliveryLoad().save(load);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
