/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsf.agenda.controller;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Marcelo
 */
public abstract class AppController implements Serializable{
    public static void addMessage(String clientID, String message, FacesMessage.Severity severity){
        FacesContext.getCurrentInstance().addMessage(clientID, 
                new FacesMessage(severity,message,message));
    }
}
