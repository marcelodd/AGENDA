/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsf.agenda.dao;

import br.com.jsf.agenda.model.Contato;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public interface InterfaceContatos {
    public Contato getContato(Long id);
    public void salvar(Contato contato);
    public void remover(Contato contato);
    public void atualizar(Contato contato);
    public List<Contato> list();
}
