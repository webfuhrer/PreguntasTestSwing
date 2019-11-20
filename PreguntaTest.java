/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectotest;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class PreguntaTest {
    private String txt_pregunta;
    private ArrayList<String> posibles_respuestas;
    private int indice_correcto;

    public PreguntaTest(String txt_pregunta, ArrayList<String> posibles_respuestas, int indice_correcto) {
        this.txt_pregunta = txt_pregunta;
        this.posibles_respuestas = posibles_respuestas;
        this.indice_correcto = indice_correcto;
    }

    public String getTxt_pregunta() {
        return txt_pregunta;
    }

    public ArrayList<String> getPosibles_respuestas() {
        return posibles_respuestas;
    }

    public int getIndice_correcto() {
        return indice_correcto;
    }
    
}
