package com.jsl.examen.OptimizacionYDocumentacion;


/**
 * Perro con edad y nombre heredado de la super clase
 */
public class Perro extends Animal {
  
    /**
     * Edad del perro
     */
    private int age; 
    /**
     * Ladrido del perro
     */
    private final String LADRAR = "GUAUUUUUUUUUU";
    /**
     * Crea un perro con nombre y edad
     * @param name
     * @param age
     * @throws EdadErroneaException
     */
    public Perro(String name, int age) throws EdadErroneaException {
        super();
        setAge(age);
        this.name = name;
    }
    /**
     * Modifica la edad
     * @param age
     * @throws EdadErroneaException
     */
    public void setAge(int age) throws EdadErroneaException {
        if (age < 0)
            throw new EdadErroneaException("La edad no puede ser negativa");
        this.age = age;
    }
   /**
    * Devuelve la edad
    * @return
    */
    public int getAge() {
        return this.age;
    }
    /**
     * Devuelve el ladrido
     * @return
     */
    public String ladrar() {
        return LADRAR;
    }

}
