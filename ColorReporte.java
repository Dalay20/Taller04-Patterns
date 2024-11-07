package com.mycompany.taller04;

public class ColorReporte extends ReportDecorator {
    private String color;

    public ColorReporte(ReporteBase reporte, String color) {
        super(reporte);
        this.color = color;
    }

    @Override
    public String generar() {
        return reporte.generar() + " con color: " + color;
    }
}
