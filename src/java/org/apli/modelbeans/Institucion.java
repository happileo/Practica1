/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apli.modelbeans;

/**
 *
 * @author aurox
 */
public class Institucion {
    /**
     * nombre - string
     * direccion - string
     */
    private int nFolio;
    private String sNombre;

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
}
