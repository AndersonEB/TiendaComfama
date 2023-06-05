package org.example;

public class Cliente {

    //ATRIBUTOS: (VARIABLES QUE ALMACENAN DATOS DE LA CLASE)
    private String nombre; // si se declara un tipo de dato con inicial, es un DATO EN ENVOLTURA
    private int edad; // si se declara un tipo de dato en minuscula, es un DATO PRIMITIVO
    private String telefono;
    private String direccion;
    private Integer comprasAlMes;

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

    //3. METODOS DE ENCAPSULADO (getters & setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //validar que el nombre tenga minimo cuatro letras
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>120 || edad<0){
            System.out.println("Un usuario no puede tener esa edad");
        }else {
            this.edad = edad;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) { // validar que el telefono tenga diez digitos
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getComprasAlMes() {
        return comprasAlMes;
    }

    public void setComprasAlMes(Integer comprasAlMes) { // validar que no existan comras negativas
        if (comprasAlMes<0){
            System.out.println("No se admiten compras negativas ");
        }else {
            this.comprasAlMes = comprasAlMes;
        }
    }


    //METODOS ORDINARIOS: ()

}

