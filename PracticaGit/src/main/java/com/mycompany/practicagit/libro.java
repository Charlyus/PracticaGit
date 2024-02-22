/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagit;

/**
 *
 * @author carlos
 */
public class libro {
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
    
}
