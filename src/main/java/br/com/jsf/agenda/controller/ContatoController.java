/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsf.agenda.controller;

import br.com.jsf.agenda.dao.ContatoDao;
import br.com.jsf.agenda.dao.JPAUtil;
import br.com.jsf.agenda.model.Contato;
import java.awt.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Marcelo
 */
@ManagedBean
@SessionScoped
public class ContatoController {
    private Contato contato;
    private DataModel listContatos;
    

    public Contato getContato() {
        JPAUtil.init();
        if(this.contato == null){
            this.contato = new Contato();
        }
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public DataModel getListContatos() {
        listContatos = new ListDataModel(ContatoDao.getInstace().findAll());
        return listContatos;
    }
    
    public void prepararAdicionarContato(ActionEvent actionEvent){
        contato = new Contato();
    }
    
    public void prepararAlterarContato(ActionEvent actionEvent){
        contato = (Contato)(listContatos.getRowData());
    }
    
    public void adicionar(ActionEvent actionEvent){
        ContatoDao.getInstace().create(contato);
    }
    
   public void alterar(ActionEvent actionEvent){
       ContatoDao.getInstace().edit(contato);
   } 
    
   public String excluir(){
       Contato contato = (Contato)(listContatos.getRowData());
       ContatoDao.getInstace().remove(contato);
       return "index";
   }
}
