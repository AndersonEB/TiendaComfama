package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {

        //DENTRO DEL METODO MAIN ESCRIBO MI PROGRAMA Y CREO MIS OBJETOS
        //CREANDO UNA VARIABLE
        int edad = 5;
        System.out.println(edad);

        //CREANDO NUESTRO PRIMER OBJETO
        //LOS OBJETOS SON COPIAS DE UNA CLASE
        //LOS OBJETOS SON INSTANCIAS DE UNA CLASE
        //LOS OBJETOS SON VARIABLES QUE SE CREAN PARA PODER INICIALIZAR LOS ATRIBUTOS DE UNA CLASE
        Cliente objeto=new Cliente();
        //USO UN OBJETO PARA ACCEDER A LOS ATRIBUTOS Y LOS METODOS DE LA CLASE POR SEPARADO
        objeto.edad = 33;
        System.out.println(objeto.edad);
        objeto.nombre = "Juan J G";
        System.out.println(objeto.nombre);


        //CREANDO UN OBJETO UTILIZANDO UN CONSTRUCTOR LLENO
        Cliente objetoDos = new Cliente("Sara", 23,"3044241348", "Cll107#32", 10);
        System.out.println(objetoDos.nombre);
        System.out.println(objetoDos.edad);


        //CREANDO UN OBJETO DE LA CLASE EMPLEADO
        Empleado objetoTres = new Empleado();
        System.out.println(objetoTres.nombre);


    }
}

