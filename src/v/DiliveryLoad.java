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
            for (int i = 0; i < table.getRowCount(); i++) {
                pojo.DiliveryLoad load = new pojo.DiliveryLoad();

//                pojo.GrnLog grnLog = new GrnLog();
//                grnLog.setId(Integer.parseInt(itemJTable.getValueAt(i, 3).toString()));
//                deliveryItemLog.setGrnLog(grnLog);
//
//                deliveryItemLog.setDelivery(delivery);
                Product p = new m.Product().getBy(Integer.parseInt(table.getValueAt(i, 2).toString()));
                load.setProduct(p);
                load.setDelivery(d);
                load.setLoadqty(Double.parseDouble(table.getValueAt(i, 3).toString()));
                
                pojo.Units units = new Units();
                units.setId(new m.Units().getByName01(itemJTable.getValueAt(i, 1).toString()));
                deliveryItemLog.setUnits(units);
                
                deliveryItemLog.setQuantity(Double.parseDouble(itemJTable.getValueAt(i, 2).toString()));
                
                int saveLoadItems = new m.DelevrySummery().saveLoadItems(deliveryItemLog);
                if (saveLoadItems == 1) {
                    updateAveQty(i);
                    updateCurrentQty(i);
                    done = 1;
                }
            }
            DefaultTableModel dtm = (DefaultTableModel) itemJTable.getModel();
            dtm.setRowCount(0);
        } catch (Exception e) {
            Errormzg.displayerrorMessage(e.toString());
        }
    }
    
}
