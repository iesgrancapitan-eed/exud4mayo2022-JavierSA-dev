package com.jsl.examen.OptimizacionYDocumentacion;

import examenOptimizacionYDocumentacion.EdadErroneaException;

public class Perro extends Animal {
    private int age;
    private final String LADRAR = "GUAUUUUUUUUUU";

    public Perro(String name, int age) throws EdadErroneaException {
        super();
        setAge(age);
        this.name = name;
    }

    public void setAge(int age) throws EdadErroneaException {
        if (age < 0)
            throw new EdadErroneaException("La edad no puede ser negativa");
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String ladrar() {
        return LADRAR;
    }

}
