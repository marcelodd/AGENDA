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
        ContatoDao dao = new ContatoDao();
        for(int i = 0 ; i < 10;i++){
            Contato contato = new Contato();
            contato.setNome("Contato "+i);
            contato.setEmail("email@"+i+".com");
            contato.setTelefone(""+i*10);
            contato.setCelular(""+i*20);
            ContatoDao.getInstace().create(contato);
        }
        
       /* contato.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
        contato.setEmail(JOptionPane.showInputDialog("Digite seu Email: "));
        contato.setTelefone(JOptionPane.showInputDialog("Digite seu Telefone: "));
        contato.setCelular(JOptionPane.showInputDialog("Digite seu Celular: "));*/
       
        
    }
}
