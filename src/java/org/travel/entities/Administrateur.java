package org.travel.entities;
// Generated 19 nov. 2017 18:26:39 by Hibernate Tools 4.3.1



/**
 * Administrateur generated by hbm2java
 */
public class Administrateur  implements java.io.Serializable {


     private int idAdmin;
     private String role;
     private Integer userId;

    public Administrateur() {
    }

	
    public Administrateur(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    public Administrateur(int idAdmin, String role, Integer userId) {
       this.idAdmin = idAdmin;
       this.role = role;
       this.userId = userId;
    }
   
    public int getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }




}

