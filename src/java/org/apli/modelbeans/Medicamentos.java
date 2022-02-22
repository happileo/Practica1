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
public class Medicamentos {
    
    /**
     * nombre-String
     * tipo-String
     * presentacion String
     * gramaje double
     */
    private int nFolio;
    private String sNombre;
    private String sPresentacion;
    private String sTipo;
    private String sGramaje;
    private AccesoDatos oAD;
    
    public int registraMedicamento (String sNombre, String sPresentacion, String sTipo, String sGramaje)throws Exception{
        int nRet=0;
        
        String sQuery="INSERT INTO medicamento (nombre, presentacion, tipo, gramaje) VALUES ('"+sNombre + "','"+sPresentacion+"',"+sTipo+","+sGramaje+");";
        
        if(oAD == null){
            oAD=new AccesoDatos();
            
            if(oAD.conectar()){
                nRet=oAD.ejecutarComando(sQuery);
                oAD.desconectar();
            }
            oAD = null;
        }else{
            nRet = oAD.ejecutarComando(sQuery);
        }
        return nRet;
    }

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
     * @return the sPresentacion
     */
    public String getsPresentacion() {
        return sPresentacion;
    }

    /**
     * @param sPresentacion the sPresentacion to set
     */
    public void setsPresentacion(String sPresentacion) {
        this.sPresentacion = sPresentacion;
    }

    /**
     * @return the sTipo
     */
    public String getsTipo() {
        return sTipo;
    }

    /**
     * @param sTipo the sTipo to set
     */
    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    /**
     * @return the sGramaje
     */
    public String getsGramaje() {
        return sGramaje;
    }

    /**
     * @param sGramaje the sGramaje to set
     */
    public void setsGramaje(String sGramaje) {
        this.sGramaje = sGramaje;
    }
    
}
