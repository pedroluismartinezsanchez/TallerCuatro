/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;

import java.util.ArrayList;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private ArrayList<Consulta> consultas = new ArrayList<>();
    private Historial historial;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.historial = new  Historial();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    
    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    } 
    
    public void mostrarInfo() {
        System.out.println(" 📋 Mascota: " + nombre + "|  Especie: " + especie + "| Edad: " + edad );
    } 
    
      public void mostrarHistorial() {
        System.out.println("📋 Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
        System.out.println("Historial de consultas:");
        /*if (consultas.isEmpty()) {
            System.out.println("Sin consultas registradas.");
        } else {
            for (Consulta c : consultas) {
                c.mostrarConsulta();
                System.out.println("--------------------------");
            }
        }*/
        historial.mostrarConsultas(); // ✅ nuevo método
    }
    
      /*public void mostrarHistorial() {
        System.out.println("📋 HISTORIAL CLINICO de " + nombre);
        if (consultas.isEmpty()) {
            System.out.println("No hay consultas registradas.");
        } else {
            for (Consulta c : consultas) {
                c.mostrarDetalleConsulta();
            }
        }
    }*/
}
