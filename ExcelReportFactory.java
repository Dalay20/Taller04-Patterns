package com.mycompany.taller04;

public class ExcelReportFactory extends ReportFactory {
    @Override
    public Report createReport() { return new ExcelReport();}
}
