package org.example.clases;

public class Empleado {

    //ATRIBUTOS
    private Integer salario;
    private String nombre;

    //METODOS ESPECIALES
    //1. CONSTRUCTOR VACIO

    public Empleado() {
    }

    //2. CONSTRUCTOR LLENO

    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODOS ORDINARIOS
    //Los metodos ordinarios seran funciones que el desarrollador programa
    // para ejecutar la logica de negocio

    //calcular el salario mensual de un empleado
    public Double calcularSalario(Integer salarioBase, Integer deducciones){
        final Double  descuentoSalud=0.04;
        final Double descuentoPension= 0.04;
        Double descuentosSeguridadSocial = (salarioBase*descuentoPension*descuentoSalud);
        Double salario = salarioBase-deducciones-descuentosSeguridadSocial;
        return salario;
    }
}
