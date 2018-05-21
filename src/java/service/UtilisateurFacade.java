/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> {

    @PersistenceContext(unitName = "gmaov1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }
    
    public int creerCompte(Utilisateur utilisateur) {
      
            Utilisateur u = new Utilisateur();
            u.setId(utilisateur.getId());
            u.setNom(utilisateur.getNom());
            u.setPrenom(utilisateur.getPrenom());
            u.setPassword(utilisateur.getPassword());
            u.setBlocked(utilisateur.getBlocked());
            u.setType(utilisateur.getType());
            u.setMdpChanged(true);
            create(u);
            return 1;
            
               }
    
}
            
//            c1.setAdresseComplement(utilisateur.getAdresseComplement());
//            c1.setBlocked(false);
//            c1.setEmail(utilisateur.getEmail());
//            c1.setNom(utilisateur.getNom());
//            c1.setPassword(utilisateur.getPassword());
//            c1.setPhone(utilisateur.getPassword());
//            c1.setPhone(utilisateur.getPhone());
//            c1.setSecteur(utilisateur.getSecteur());
            
       
 
