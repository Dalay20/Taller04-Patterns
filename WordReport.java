/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

public class WordReport implements Report {
    private String contenido;

    @Override
    public void createReport() {
        contenido = "Contenido del reporte en Word";
    }

    
}