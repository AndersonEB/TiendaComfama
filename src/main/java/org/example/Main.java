package org.example;

import org.example.clases.Empleado;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CREAR UN OBJETO ESPECIAL PARA RECIBIR DATOS POR TECLADO
        Scanner entradaporTeclado = new Scanner(System.in);

        // CREAR UN OBJETO DE LA CLASE CLIENTE
        Cliente cliente = new Cliente();

        // PIDIENDO DATOS AL USUARIO

        System.out.println("Digita tu nombre: ");
        cliente.setNombre(entradaporTeclado.next());
        System.out.println(cliente.getNombre());

    }
}

