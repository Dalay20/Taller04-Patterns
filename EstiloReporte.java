package com.mycompany.taller04;

public class EstiloReporte extends ReportDecorator {
    private String estilo;

    public EstiloReporte(ReporteBase reporte, String estilo) {
        super(reporte);
        this.estilo = estilo;
    }

    @Override
    public String generar() {
        return reporte.generar() + " con estilo: " + estilo;
    }
}
