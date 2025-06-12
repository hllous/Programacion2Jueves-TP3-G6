package tests;

import interfaces.IPersona;
import models.Persona;

import java.util.stream.StreamSupport;

public class TestPersona {
    public static void main(String[] args) {

        System.out.println("--- TestPersona ---");
        System.out.println();
        System.out.println("1) Creo una persona y testeo metodos");

        IPersona p = new Persona(45682031, "Nicolas");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Dni: " + p.getDni());

        System.out.println();
        System.out.println("2) Cambio nombre y dni en la misma persona, e imprimo todo junto");
        p.setDni(12053107);
        p.setNombre("Facundo");
        System.out.println(p.toString());

        System.out.println();
        System.out.println("--- FinTestPersona ---");
    }
}
