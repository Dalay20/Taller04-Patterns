/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;


public class WordReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new WordReport();
    }
}