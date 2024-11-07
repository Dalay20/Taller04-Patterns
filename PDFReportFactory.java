/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author Usuario
 */
public class PDFReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new PDFReport();
    }
}
