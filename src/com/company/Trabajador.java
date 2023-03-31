package com.company;

public class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Información del trabajador: \n" + "Nombre: " +
                super.getNombre() + "\nEdad: " + super.getEdad() +
                "\nTeléfono: " + super.getTelefono() + "\nSalario: $"
                + this.getSalario();
    }
}
