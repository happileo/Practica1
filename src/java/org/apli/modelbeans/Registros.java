/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apli.modelbeans;

import java.util.ArrayList;
import java.util.Date;
import org.apli.modelbeans.Beneficiarios;
import org.apli.modelbeans.Institucion;
import org.apli.modelbeans.Medicamentos;
import org.apli.AD.AccesoDatos;


/**
 *
 * @author aurox
 */
public class Registros {
    /**
     * Fecha - String date
     * cantidad int
     * nombreMED
     * nombreBEN
     * institucion
     * receta
     * tipo
     */
    
    private int nFolio;
    private Date fFecha;
    private int Ncantidad;
    private String sNombreMed;
    private String sNombreBen;
    private String sNombreIns;
    private String sReceta;
    private String sTipoMed;

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
     * @return the fFecha
     */
    public Date getfFecha() {
        return fFecha;
    }

    /**
     * @param fFecha the fFecha to set
     */
    public void setfFecha(Date fFecha) {
        this.fFecha = fFecha;
    }

    /**
     * @return the Ncantidad
     */
    public int getNcantidad() {
        return Ncantidad;
    }

    /**
     * @param Ncantidad the Ncantidad to set
     */
    public void setNcantidad(int Ncantidad) {
        this.Ncantidad = Ncantidad;
    }

    /**
     * @return the sNombreMed
     */
    public String getsNombreMed() {
        return sNombreMed;
    }

    /**
     * @param sNombreMed the sNombreMed to set
     */
    public void setsNombreMed(String sNombreMed) {
        this.sNombreMed = sNombreMed;
    }

    /**
     * @return the sNombreBen
     */
    public String getsNombreBen() {
        return sNombreBen;
    }

    /**
     * @param sNombreBen the sNombreBen to set
     */
    public void setsNombreBen(String sNombreBen) {
        this.sNombreBen = sNombreBen;
    }

    /**
     * @return the sNombreIns
     */
    public String getsNombreIns() {
        return sNombreIns;
    }

    /**
     * @param sNombreIns the sNombreIns to set
     */
    public void setsNombreIns(String sNombreIns) {
        this.sNombreIns = sNombreIns;
    }

    /**
     * @return the sReceta
     */
    public String getsReceta() {
        return sReceta;
    }

    /**
     * @param sReceta the sReceta to set
     */
    public void setsReceta(String sReceta) {
        this.sReceta = sReceta;
    }

    /**
     * @return the sTipoMed
     */
    public String getsTipoMed() {
        return sTipoMed;
    }

    /**
     * @param sTipoMed the sTipoMed to set
     */
    public void setsTipoMed(String sTipoMed) {
        this.sTipoMed = sTipoMed;
    }
    
}
