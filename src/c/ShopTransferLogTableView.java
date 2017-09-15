/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojo.GrnLog;
import pojo.Product;
import pojo.ShopTransfer;
import pojo.ShopTransferLog;
import pojo.Units;

/**
 *
 * @author User
 */
public class ShopTransferLogTableView {

    public void setShopTransferLogTable(JTable jTable) {
        try {
            ArrayList<ShopTransfer> st = new m.ShopTransfer().viewAllShopTransfer();
            DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
            dtm.setRowCount(0);

            for (ShopTransfer shopTransfer : st) {
                Vector<Object> v = new Vector<Object>();

                System.out.println("Date : " + shopTransfer.getDate().toString());

                ShopTransferLog shopTransferLog = new m.ShopTrasnferLog().getBy(shopTransfer);
                System.out.println("Product Quantity : " + shopTransferLog.getQuantity().toString());

                System.out.println("Grn Log id : " + shopTransferLog.getGrnLog().getId());
                GrnLog grnLog = new m.GrnLog().getById(shopTransferLog.getGrnLog().getId());
                System.out.println("Buying Price : " + grnLog.getBuyingPrice().toString());

                System.out.println("Product id : " + grnLog.getProduct().getId());
                Product product = new m.Product().getByGRNLog(grnLog);
                System.out.println("Product name : " + product.getName());

                Units units = new m.Units().getBy(product.getUnits().getId());
                System.out.println("Unit : " + units.getUnitName());

                System.out.println("Total : " + shopTransferLog.getQuantity() * grnLog.getBuyingPrice());

                v.add(shopTransfer.getDate());
                v.add(product.getName());
                v.add(units.getUnitName());
                v.add(shopTransferLog.getQuantity());
                v.add(grnLog.getBuyingPrice());
                Double Total = shopTransferLog.getQuantity() * grnLog.getBuyingPrice();
                Total = (Math.round(Total * 100.0) / 100.0);
                v.add(Total);
                dtm.addRow(v);
                System.out.println("#############################");
            }
            dtm.setNumRows(20);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int setShopTransferLogTableByDate(JTable jTable, JDateChooser dateChooser) {
        int i = 0;
        try {
            int shopTransferByDateCheck = new m.ShopTransfer().getShopTransferByDateCheck(dateChooser.getDate());

            if (shopTransferByDateCheck == 1) {
                //Errormzg.displayerrorMessage("Please enter a date where Shop Transfer is available");
            } else if (shopTransferByDateCheck == 2) {
                ArrayList<ShopTransfer> st = new m.ShopTransfer().getShopTransferByDate(dateChooser.getDate());
                DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
                dtm.setRowCount(0);
                for (ShopTransfer shopTransfer : st) {
                    Vector<Object> v = new Vector<Object>();

                    System.out.println("Date : " + shopTransfer.getDate().toString());

                    ShopTransferLog shopTransferLog = new m.ShopTrasnferLog().getBy(shopTransfer);
                    System.out.println("Product Quantity : " + shopTransferLog.getQuantity().toString());

                    System.out.println("Grn Log id : " + shopTransferLog.getGrnLog().getId());
                    GrnLog grnLog = new m.GrnLog().getById(shopTransferLog.getGrnLog().getId());
                    System.out.println("Buying Price : " + grnLog.getBuyingPrice().toString());

                    System.out.println("Product id : " + grnLog.getProduct().getId());
                    Product product = new m.Product().getByGRNLog(grnLog);
                    System.out.println("Product name : " + product.getName());

                    Units units = new m.Units().getBy(product.getUnits().getId());
                    System.out.println("Unit : " + units.getUnitName());

                    System.out.println("Total : " + shopTransferLog.getQuantity() * grnLog.getBuyingPrice());

                    v.add(shopTransfer.getDate());
                    v.add(product.getName());
                    v.add(units.getUnitName());
                    v.add(shopTransferLog.getQuantity());
                    v.add(grnLog.getBuyingPrice());
                    Double Total = shopTransferLog.getQuantity() * grnLog.getBuyingPrice();
                    Total = (Math.round(Total * 100.0) / 100.0);
                    v.add(Total);
                    dtm.addRow(v);
                    System.out.println("#############################");
                    i = 1;
                }

            } else {
                Errormzg.displayerrorMessage("Restart the software");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

}
