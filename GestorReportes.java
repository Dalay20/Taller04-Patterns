/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

public class GestorReportes {
    private static GestorReportes instancia;

    private GestorReportes() {}

    public static GestorReportes getInstancia() {
        if (instancia == null) {
            instancia = new GestorReportes();
        }
        return instancia;
    }

    public Report generarReporte(String tipo) {
        ReportFactory factory;
        switch (tipo) {
            case "PDF":
                factory = new PDFReportFactory();
                break;
            case "Excel":
                factory = new ExcelReportFactory();
                break;
            case "Word":
                factory = new WordReportFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo de reporte no soportado");
        }
        Report reporte = factory.createReport();
        reporte.createReport();
        return reporte;
    }

    public void enviarReporte(Report reporte, Notification canal) {
        
    }
}

