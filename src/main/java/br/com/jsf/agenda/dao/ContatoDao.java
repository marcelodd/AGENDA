/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsf.agenda.dao;

import br.com.jsf.agenda.model.Contato;

/**
 *
 * @author Marcelo
 */
public class ContatoDao extends GenericDAO<Contato>{

    public ContatoDao() {
        super(Contato.class);
    }
    
}
