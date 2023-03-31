package com.company;

public class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Información del cliente: \n" + "Nombre: " +
                super.getNombre() + "\nEdad: " + super.getEdad() +
                "\nTeléfono: " + super.getTelefono() + "\nCrédito: $"
                + this.getCredito();
    }
}
