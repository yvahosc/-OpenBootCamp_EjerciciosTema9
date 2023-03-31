package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(26);
        cliente.setNombre("Yeisson");
        cliente.setTelefono("555-123-4567");
        cliente.setCredito(10000000);
        System.out.println(cliente.toString());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Augusto");
        trabajador.setTelefono("000-123-4567");
        trabajador.setSalario(3000000);
        System.out.println(trabajador.toString());
    }
}
