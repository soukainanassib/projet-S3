package org.travel.entities;
// Generated 19 nov. 2017 18:26:39 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Article generated by hbm2java
 */
public class Article  implements java.io.Serializable {


     private int idArticle;
     private String titre;
     private String texte;
     private String image;
     private Date created;
     private Integer adminId;

    public Article() {
    }

	
    public Article(int idArticle) {
        this.idArticle = idArticle;
    }
    public Article(int idArticle, String titre, String texte, String image, Date created, Integer adminId) {
       this.idArticle = idArticle;
       this.titre = titre;
       this.texte = texte;
       this.image = image;
       this.created = created;
       this.adminId = adminId;
    }
   
    public int getIdArticle() {
        return this.idArticle;
    }
    
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getTexte() {
        return this.texte;
    }
    
    public void setTexte(String texte) {
        this.texte = texte;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Integer getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }




}


