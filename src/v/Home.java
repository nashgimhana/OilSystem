/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import javax.swing.JFrame;

/**
 *
 * @author suhada
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        c.MenuStyler.getInstance().setHome(this);
    }
    public static Home Home = null;

    public static Home getInstance() {
        if (Home == null) {
            Home = new Home();
        }
        return Home;
    }

//    private void setBanner() {
//        Image image = new ImageIcon(getClass().getResource("/img/oilbaner.png")).getImage();
//        //lbl_baner.setIcon(new ImageIcon(image.getScaledInstance(lbl_baner.getWidth(), lbl_baner.getHeight(), Image.SCALE_SMOOTH)));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        lbl_baner = new javax.swing.JLabel();
        pnl_body = new javax.swing.JPanel();
        pnl_menu = new javax.swing.JPanel();
        lbl_status = new javax.swing.JLabel();
        lbl_stock = new javax.swing.JLabel();
        lbl_selfproduct = new javax.swing.JLabel();
        lbl_employee = new javax.swing.JLabel();
        lbl_cashcheck = new javax.swing.JLabel();
        lbl_vehicle = new javax.swing.JLabel();
        lbl_supplier = new javax.swing.JLabel();
        lbl_Customer = new javax.swing.JLabel();
        lbl_Invoice = new javax.swing.JLabel();
        pnl_container = new javax.swing.JPanel();
        dpnl_contain = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oil Suppliers");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 2));

        pnl_header.setBackground(c.View.getInstance().colorTheme);
        pnl_header.setMaximumSize(new java.awt.Dimension(32767, 90));
        pnl_header.setPreferredSize(new java.awt.Dimension(848, 90));
        pnl_header.setLayout(new java.awt.BorderLayout());

        lbl_baner.setFont(lbl_baner.getFont().deriveFont(lbl_baner.getFont().getStyle() | java.awt.Font.BOLD, lbl_baner.getFont().getSize()+25));
        lbl_baner.setForeground(new java.awt.Color(255, 255, 255));
        lbl_baner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_baner.setText("Kalpani Oil Delivers");
        pnl_header.add(lbl_baner, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_header, java.awt.BorderLayout.PAGE_START);

        pnl_body.setLayout(new javax.swing.BoxLayout(pnl_body, javax.swing.BoxLayout.LINE_AXIS));

        pnl_menu.setBackground(new java.awt.Color(255, 255, 255));
        pnl_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, c.View.getInstance().colorTheme));
        pnl_menu.setMaximumSize(new java.awt.Dimension(165, 32767));
        pnl_menu.setPreferredSize(new java.awt.Dimension(165, 413));
        pnl_menu.setLayout(new java.awt.GridLayout(10, 1, 1, 8));

        lbl_status.setBackground(new java.awt.Color(255, 255, 255));
        lbl_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_status.setText("Status");
        lbl_status.setToolTipText("Status");
        lbl_status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_status.setOpaque(true);
        lbl_status.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_status);

        lbl_stock.setBackground(new java.awt.Color(255, 255, 255));
        lbl_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_stock.setText("Stock");
        lbl_stock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_stock.setOpaque(true);
        lbl_stock.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_stock);

        lbl_selfproduct.setBackground(new java.awt.Color(255, 255, 255));
        lbl_selfproduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_selfproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_selfproduct.setText("Self Product");
        lbl_selfproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_selfproduct.setOpaque(true);
        lbl_selfproduct.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_selfproduct);

        lbl_employee.setBackground(new java.awt.Color(255, 255, 255));
        lbl_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_employee.setText("Employee");
        lbl_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_employee.setOpaque(true);
        lbl_employee.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_employee);

        lbl_cashcheck.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cashcheck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cashcheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cashcheck.setText("Cash/Check Book");
        lbl_cashcheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cashcheck.setOpaque(true);
        lbl_cashcheck.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_cashcheck);

        lbl_vehicle.setBackground(new java.awt.Color(255, 255, 255));
        lbl_vehicle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_vehicle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_vehicle.setText("Delivery");
        lbl_vehicle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_vehicle.setOpaque(true);
        lbl_vehicle.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_vehicle);

        lbl_supplier.setBackground(new java.awt.Color(255, 255, 255));
        lbl_supplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_supplier.setText("Supplier");
        lbl_supplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_supplier.setOpaque(true);
        lbl_supplier.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_supplier);

        lbl_Customer.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Customer.setText("Customer");
        lbl_Customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Customer.addMouseListener(c.MenuStyler.getInstance());
        lbl_Customer.setOpaque(true);
        lbl_supplier.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_Customer);

        lbl_Invoice.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Invoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Invoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Invoice.setText("Invoice");
        lbl_Invoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Invoice.addMouseListener(c.MenuStyler.getInstance());
        lbl_Invoice.setOpaque(true);
        lbl_supplier.addMouseListener(c.MenuStyler.getInstance());
        pnl_menu.add(lbl_Invoice);

        pnl_body.add(pnl_menu);

        pnl_container.setLayout(new java.awt.BorderLayout());

        dpnl_contain.setBackground(new java.awt.Color(255, 255, 255));
        dpnl_contain.setLayout(new java.awt.GridLayout(1, 0));
        pnl_container.add(dpnl_contain, java.awt.BorderLayout.CENTER);

        pnl_body.add(pnl_container);

        jPanel1.add(pnl_body, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("Home");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        c.View.getInstance().setStatusViewToDPane(dpnl_contain);
        lbl_status.setBackground(c.View.getInstance().colorMenuSelet);
    }//GEN-LAST:event_formWindowOpened

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (dpnl_contain.getComponentCount() > 0) {
            c.View.getInstance().setViewToDPane(dpnl_contain, dpnl_contain.getComponent(0));
        }
    }//GEN-LAST:event_formComponentResized


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.Home.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane dpnl_contain;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_Customer;
    public javax.swing.JLabel lbl_Invoice;
    private javax.swing.JLabel lbl_baner;
    public javax.swing.JLabel lbl_cashcheck;
    public javax.swing.JLabel lbl_employee;
    public javax.swing.JLabel lbl_selfproduct;
    public javax.swing.JLabel lbl_status;
    public javax.swing.JLabel lbl_stock;
    public javax.swing.JLabel lbl_supplier;
    public javax.swing.JLabel lbl_vehicle;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel pnl_container;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_menu;
    // End of variables declaration//GEN-END:variables
}
