package org.example;

public class Cliente {

    //ATRIBUTOS: (VARIABLES QUE ALMACENAN DATOS DE LA CLASE)
    private String nombre; // si se declara un tipo de dato con inicial, es un DATO EN ENVOLTURA
    public int edad; // si se declara un tipo de dato en minuscula, es un DATO PRIMITIVO
    public String telefono;
    public String direccion;
    public Integer comprasAlMes;

    //METODOS ESPECIALES: ()
    // 1. contructor vacio

    public Cliente() {
    }

    //2. constructor LLENO


    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }


    //METODOS ORDINARIOS: ()

}

