/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagit;

/**
 *
 * @author carlos
 */
public class prestamo {
    private String codigoLibro;
    private int carnetEstudiante;
    private fecha fechaPrestamo;
    private fecha fechaDevolucion;
    private int pago;
    private boolean finalizado=false;

    public prestamo(String codigoLibro, int carnetEstudiante, fecha fechaPrestamo) {
        this.codigoLibro = codigoLibro;
        this.carnetEstudiante = carnetEstudiante;
        this.fechaPrestamo = fechaPrestamo;
    }
    
}
