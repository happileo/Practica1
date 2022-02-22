/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.api.jbs;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.apli.modelbeans.Medicamentos;
import org.primefaces.context.RequestContext;


/**
 *
 * @author aurox
 */

@ManagedBean(name="oRegMed")
@SessionScoped
public class registroMedicamentoJB implements Serializable {

    private String sNombre;
    private String sPresentacion;
    private String sTipo;
    private String sGramaje;
    
    public void registrar() throws Exception{
        Medicamentos oMed= new Medicamentos();
        
        oMed.registraMedicamento(sNombre, sPresentacion, sTipo, sGramaje);
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
