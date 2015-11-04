/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsf.agenda.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Marcelo
 */
@Entity(name="Contato")
public class Contato implements Serializable{
    @Id
    @GeneratedValue
    private Long ID;
    private String nome;
    private String email;
    private String telefone;
    private String celular;

    public Contato(Long ID, String nome, String email, String telefone, String celular) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public Contato(String nome, String email, String telefone, String celular) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }
    
    public Contato() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
}
