package br.com.jsf.agenda.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcelo
 */
public class JPAUtil {

    private static final EntityManagerFactory emf;
    private static EntityManager managerEM;
    private static EntityTransaction managerET;

    static {
        emf = Persistence.createEntityManagerFactory("AGENDA_PU");
    }

    public static EntityManager getEntityManager() {
        if (managerEM == null) {
            managerEM = emf.createEntityManager();
        }
        return managerEM;
    }

    public static EntityTransaction getTransaction() {
        if (managerET == null) {
            managerET = getEntityManager().getTransaction();
        }
        return managerET;
    }

    public static void startTransaction() {
        getTransaction().begin();
    }

    public static void endTransaction(boolean commit) {
        if (commit) {
            getTransaction().commit();
        } else {
            getTransaction().rollback();
        }
    }

    /**
     * Clear the persistence context, causing all managed entities to become
     * detached.
     */
    public static void clear() {
        getEntityManager().clear();
    }

    /**
     * Close an application-managed EntityManager.
     */
    public static void close() {
        try {
            getEntityManager().close();
        } catch (Exception e) {
        }
    }

    /**
     * Create an instance of Query for executing a named query (in EJB QL or
     * native SQL).
     */
    public static Query createNamedQuery(String name) {
        return getEntityManager().createNamedQuery(name);
    }

    /**
     * Create an instance of Query for executing an EJB QL statement.
     */
    public static Query createQuery(String ejbqlString) {
        return getEntityManager().createQuery(ejbqlString);
    }
}
