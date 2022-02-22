/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apli.modelbeans;


import org.apli.AD.AccesoDatos;

/**
 *
 * @author aurox
 */
public class Beneficiarios {
    
    /**
     *  nombre - string
     * curp - string
     */
    private int nFolio;
    private String sNombre;
    private String sCurp;

    /**
     * @return the nFolio
     */
    public int getnFolio() {
        return nFolio;
    }

    /**
     * @param nFolio the nFolio to set
     */
    public void setnFolio(int nFolio) {
        this.nFolio = nFolio;
    }

    /**
     * @return the sNombre
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     * @param sNombre the sNombre to set
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * @return the sCurp
     */
    public String getsCurp() {
        return sCurp;
    }

    /**
     * @param sCurp the sCurp to set
     */
    public void setsCurp(String sCurp) {
        this.sCurp = sCurp;
    }
    
    
}
