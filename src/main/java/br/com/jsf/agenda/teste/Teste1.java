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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Teste1 {
    public static void main(String[] args) {
        List<Contato> contatos = ContatoDao.getInstace().findAll();
        for(Contato c : contatos){
            System.err.println("Nome: "+c.getNome());
            System.err.println("Email: "+c.getEmail());
            System.err.println("Telefone: "+c.getTelefone());
            System.err.println("Celular: "+c.getCelular());
        }
        
       /* contato.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
        contato.setEmail(JOptionPane.showInputDialog("Digite seu Email: "));
        contato.setTelefone(JOptionPane.showInputDialog("Digite seu Telefone: "));
        contato.setCelular(JOptionPane.showInputDialog("Digite seu Celular: "));*/
       
        
    }
}
