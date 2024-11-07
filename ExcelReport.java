package com.mycompany.taller04;

public class ExcelReport implements Report {
    private String contenido;

    @Override
    public void createReport() {
        contenido = "Contenido del reporte en Excel";
    }

}
