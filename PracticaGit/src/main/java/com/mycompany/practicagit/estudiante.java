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

    public estudiante(int carnet, fecha fechaNacimiento, String nombre) {
        this.carnet = carnet;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public estudiante(int carnet, fecha fechaNacimiento, String nombre, int carrera) {
        this.carnet = carnet;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.carrera = carrera;
    }
    
    
}
