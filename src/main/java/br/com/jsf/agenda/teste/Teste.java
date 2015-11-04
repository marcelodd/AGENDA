/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsf.agenda.teste;

import br.com.jsf.agenda.dao.ContatoDao;
import br.com.jsf.agenda.dao.GenericDAO;
import br.com.jsf.agenda.dao.JPAUtil;
import br.com.jsf.agenda.model.Contato;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Teste {
    public static void main(String[] args) {
        JPAUtil.init();
        Contato contato = new Contato();
        contato.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
        contato.setEmail(JOptionPane.showInputDialog("Digite seu Email: "));
        contato.setTelefone(JOptionPane.showInputDialog("Digite seu Telefone: "));
        contato.setCelular(JOptionPane.showInputDialog("Digite seu Celular: "));
       
        new ContatoDao().create(contato);
    }
}
