package com.asche.hibernate.tests;

import com.asche.hibernate.modelo.Empleado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestEmpleados {
    private static EntityManager manager;
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("Persistencia");
        manager = entityManagerFactory.createEntityManager();
        List<Empleado> empleados;
        empleados = (List<Empleado>) manager.createQuery("SELECT e FROM Empleado e").getResultList();
        System.out.println("En la BDD hay " + empleados.size() + " empleados.");


    }
}
