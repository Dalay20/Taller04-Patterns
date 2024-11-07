/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

public abstract class ReportDecorator extends ReporteBase {
    protected ReporteBase reporte;

    public ReportDecorator(ReporteBase reporte) {
        this.reporte = reporte;
    }

    @Override
    public abstract String generar();
}
