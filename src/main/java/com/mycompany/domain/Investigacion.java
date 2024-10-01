/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author cesar
 */
@Named
@RequestScoped
public class Investigacion {
    private String titulo;
    private String descripcion;
    private String referencia;
    private String foto;
    

    public Investigacion() {
        this.titulo = "Investigacion";
        this.descripcion = "conjunto de actividades humanas destinadas a la "
                + "obtención de nuevos saberes y conocimientos, "
                + "y/o su aplicación a la resolución de problemas "
                + "concretos o interrogantes existenciales.";
        this.referencia = "Equipo editorial, Etecé. (2021, 14 junio). Investigación - Concepto, métodos, elementos y características. Concepto. https://concepto.de/investigacion/";
        this.foto = "resources/images/Investigacion.jpg";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
