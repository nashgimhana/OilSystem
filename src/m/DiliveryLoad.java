/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import c.Errormzg;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nash
 */
public class DiliveryLoad {

    Errormzg er = new Errormzg();

    public int save(pojo.DiliveryLoad diliveryLoad) {
        Session s = conn.NewHibernateUtil.getSessionFactory().openSession();
        try {
            Transaction beginTransaction = s.beginTransaction();
            int i = (int) s.save(diliveryLoad);
            beginTransaction.commit();
            s.flush();
            return i;
        } catch (Exception e) {
            er.displayerrorMessage(e.toString());
            return 0;

        } finally {
            s.close();
        }
    }
}
