/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagit;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class libro implements Serializable{
    private String titulo;
    private String autor;
    private String codigo;
    private int copias;
    private fecha fechaPublicacion;
    private String editorial;

    public libro(String titulo, String autor, String codigo, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.copias = copias;
    }

    public libro(String titulo, String autor, String codigo, int copias, fecha fechaPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.copias = copias;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
