/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagit;

/**
 *
 * @author carlos
 */
public class estudiante {
    private int carnet;
    private fecha fechaNacimiento;
    private String nombre;
    private int carrera;

    public estudiante(int carnet, String nombre, int carrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
    }
    

    

    public estudiante(int carnet, fecha fechaNacimiento, String nombre, int carrera) {
        this.carnet = carnet;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    
}
