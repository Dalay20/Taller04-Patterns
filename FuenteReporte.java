/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

public class FuenteReporte extends ReportDecorator {
    private String fuente;

    public FuenteReporte(ReporteBase reporte, String fuente) {
        super(reporte);
        this.fuente = fuente;
    }

    @Override
    public String generar() {
        return reporte.generar() + " con fuente: " + fuente;
    }
}
