/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectotest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class AccesoFichero {
    private static String ruta_fichero="C:\\preguntas\\preguntas.csv";
    private static String separador=",";
    public static ArrayList<PreguntaTest> obtenerPreguntas()
    {ArrayList<PreguntaTest> lista_preguntas=new ArrayList<>();
        FileReader fr;
        try {
            fr = new FileReader(ruta_fichero);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            
            while(linea!=null)
            {
                //Para cada línea necesito una lista de respuestas
                ArrayList<String> lista_respuestas=new ArrayList();
                String[] datos=linea.split(separador);
                String txt_pregunta=datos[0];
                lista_respuestas.add(datos[1]);
                lista_respuestas.add(datos[2]);
                lista_respuestas.add(datos[3]);
                lista_respuestas.add(datos[4]);
                String str_indice_correcto=datos[5];
                PreguntaTest p=new PreguntaTest(txt_pregunta,lista_respuestas,Integer.parseInt(str_indice_correcto));
                lista_preguntas.add(p);
                linea=br.readLine();
            }
                    //¡¡ojo al while!!
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return lista_preguntas;
                
    }
    
}
