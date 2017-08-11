/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;

/**
 *
 * @author Buddhika Prasanna
 */
public class DeliverDetail {

    /**
     * @return the dcDeleverDateDI
     */
    public static JDateChooser getDcDeleverDateDI() {
        return dcDeleverDateDI;
    }

    /**
     * @param aDcDeleverDateDI the dcDeleverDateDI to set
     */
    public static void setDcDeleverDateDI(JDateChooser aDcDeleverDateDI) {
        dcDeleverDateDI = aDcDeleverDateDI;
    }

    /**
     * @return the txtRouteNameDI
     */
    public static JTextField getTxtRouteNameDI() {
        return txtRouteNameDI;
    }

    /**
     * @param aTxtRouteNameDI the txtRouteNameDI to set
     */
    public static void setTxtRouteNameDI(JTextField aTxtRouteNameDI) {
        txtRouteNameDI = aTxtRouteNameDI;
    }

    /**
     * @return the txtRouteIdDI
     */
    public static JTextField getTxtRouteIdDI() {
        return txtRouteIdDI;
    }

    /**
     * @param aTxtRouteIdDI the txtRouteIdDI to set
     */
    public static void setTxtRouteIdDI(JTextField aTxtRouteIdDI) {
        txtRouteIdDI = aTxtRouteIdDI;
    }

    /**
     * @return the txtVehicleiNumberDI
     */
    public static JTextField getTxtVehicleiNumberDI() {
        return txtVehicleiNumberDI;
    }

    /**
     * @param aTxtVehicleiNumberDI the txtVehicleiNumberDI to set
     */
    public static void setTxtVehicleiNumberDI(JTextField aTxtVehicleiNumberDI) {
        txtVehicleiNumberDI = aTxtVehicleiNumberDI;
    }

    /**
     * @return the txtVehicleIdDI
     */
    public static JTextField getTxtVehicleIdDI() {
        return txtVehicleIdDI;
    }

    /**
     * @param aTxtVehicleIdDI the txtVehicleIdDI to set
     */
    public static void setTxtVehicleIdDI(JTextField aTxtVehicleIdDI) {
        txtVehicleIdDI = aTxtVehicleIdDI;
    }
    
    private static JDateChooser dcDeleverDateDI;
    private static JTextField txtRouteNameDI;
    private static JTextField txtRouteIdDI;
    private static JTextField txtVehicleiNumberDI;
    private static JTextField txtVehicleIdDI;

    public DeliverDetail() {

    }

}
