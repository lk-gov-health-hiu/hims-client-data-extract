/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Patientdemographic;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dr M H B Ariyaratne<buddhika.ari@gmail.com>
 */
@Stateless
public class PatientdemographicFacade extends AbstractFacade<Patientdemographic> {

    @PersistenceContext(unitName = "HimsPatientImportPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PatientdemographicFacade() {
        super(Patientdemographic.class);
    }
    
}
