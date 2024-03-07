/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagit;

/**
 *
 * @author carlos
 */
public class fecha {
    private int dia;
    private int mes;
    private int anio;

    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }
    public boolean estaEnRango(fecha fechaInicial, fecha fechaFinal, fecha fechaEvaluar) {
        return fechaEvaluar.compareTo(fechaInicial) >= 0 && fechaEvaluar.compareTo(fechaFinal) <= 0;
    }

    public int compareTo(fecha otraFecha) {
        if (this.anio != otraFecha.anio) {
            return Integer.compare(this.anio, otraFecha.anio);
        }
        if (this.mes != otraFecha.mes) {
            return Integer.compare(this.mes, otraFecha.mes);
        }
        return Integer.compare(this.dia, otraFecha.dia);
    }
    
    

    public int diferencia(fecha inicio, fecha fin){
        int diasInicio=inicio.dia+inicio.mes*30+inicio.anio*365;
        int diasFin=fin.dia+fin.mes*30+fin.anio*365;
        return diasFin-diasInicio;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
