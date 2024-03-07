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

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCarnetEstudiante() {
        return carnetEstudiante;
    }

    public void setCarnetEstudiante(int carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public fecha getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(fecha fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public fecha getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(fecha fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
}
