/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jose.lecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalonsoriveiro
 */
public class LecturaEscritura {
Scanner sc;
int valor=0;
 PrintWriter esc = null;
    FileWriter fich;
int numero=0;
public void lecturaEscritura(File fichero1,String fichero2){
    try {
        sc = new Scanner(fichero1);
        fich = new FileWriter(fichero2);
        esc = new PrintWriter(fich);
        while(sc.hasNextLine()){
            String cadea = sc.nextLine();       
            //System.out.println(cadea);                        
            
            valor = Integer.parseInt(cadea);
            if (valor%2==0){
                
               esc.println(valor);
            }
      
        }           
    } catch (FileNotFoundException ex) {
        Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
    sc.close();
    esc.close();
    }
    
    

};

    
}
