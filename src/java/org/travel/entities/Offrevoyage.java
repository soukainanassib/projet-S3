package org.travel.entities;
// Generated 19 nov. 2017 18:26:39 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Offrevoyage generated by hbm2java
 */
public class Offrevoyage  implements java.io.Serializable {


     private int idOffre;
     private String titre;
     private String plan;
     private Date dateDebut;
     private Integer duree;
     private String description;
     private String destination;
     private String villeDepart;
     private Integer voyageurId;
     private Integer typeId;

    public Offrevoyage() {
    }

	
    public Offrevoyage(int idOffre) {
        this.idOffre = idOffre;
    }
    public Offrevoyage(int idOffre, String titre, String plan, Date dateDebut, Integer duree, String description, String destination, String villeDepart, Integer voyageurId, Integer typeId) {
       this.idOffre = idOffre;
       this.titre = titre;
       this.plan = plan;
       this.dateDebut = dateDebut;
       this.duree = duree;
       this.description = description;
       this.destination = destination;
       this.villeDepart = villeDepart;
       this.voyageurId = voyageurId;
       this.typeId = typeId;
    }
   
    public int getIdOffre() {
        return this.idOffre;
    }
    
    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getPlan() {
        return this.plan;
    }
    
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public Date getDateDebut() {
        return this.dateDebut;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Integer getDuree() {
        return this.duree;
    }
    
    public void setDuree(Integer duree) {
        this.duree = duree;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDestination() {
        return this.destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getVilleDepart() {
        return this.villeDepart;
    }
    
    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }
    public Integer getVoyageurId() {
        return this.voyageurId;
    }
    
    public void setVoyageurId(Integer voyageurId) {
        this.voyageurId = voyageurId;
    }
    public Integer getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }




}

