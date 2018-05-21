/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class Epuisement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSortie ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEntree;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEpuisement;
    private int quantite;
    @ManyToOne // bi
    private Equipement Equipement;
    @ManyToOne //bi
    private Salle salle;
    @ManyToOne
    private Magasin magasin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateEpuisement() {
        return dateEpuisement;
    }

    public void setDateEpuisement(Date dateEpuisement) {
        this.dateEpuisement = dateEpuisement;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Equipement getEquipement() {
        return Equipement;
    }

    public void setEquipement(Equipement Equipement) {
        this.Equipement = Equipement;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }
    

    public Epuisement() {
    }

    public Epuisement(Long id) {
        this.id = id;
    }

    public Epuisement(Long id, Date dateSortie, Date dateEntree, Date dateEpuisement, int quantite) {
        this.id = id;
        this.dateSortie = dateSortie;
        this.dateEntree = dateEntree;
        this.dateEpuisement = dateEpuisement;
        this.quantite = quantite;
    }

    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Epuisement)) {
            return false;
        }
        Epuisement other = (Epuisement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Epuisement{" + "id=" + id + ", dateSortie=" + dateSortie + ", dateEntree=" + dateEntree + ", dateEpuisement=" + dateEpuisement + ", quantite=" + quantite + '}';
    }

    

    
    
}
