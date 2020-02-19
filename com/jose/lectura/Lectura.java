/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jose.lectura;

import exemficheros.Xogador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author jalonsoriveiro
 */
public class Lectura {
    Scanner sc;
    public void lerLineas(File fich){
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){                
                System.out.println(sc.nextLine());
                }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro lerLiñas"+ex.toString());   
        }finally{
        sc.close();
        }
    
    
    }
public void lerPalabra(File fich){

        try {
            sc= new Scanner(fich);
            while(sc.hasNext()){    
                System.out.println(sc.next());
            }
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro lectura palabra"+ex.toString());   
        } finally{
        sc.close();
        }

    
}
public void lerPalabrasUsoDeLimitadores(File fich){
    try {//Separando por coma.
                sc= new Scanner(fich).useDelimiter(",\\s*");
                while(sc.hasNext()){    
                    System.out.println(sc.next());
                }

            } catch (FileNotFoundException ex) {

                System.out.println("Erro lectura palabra"+ex.toString());   
             }finally{
                sc.close();
             }



    }
public LinkedList<Integer> lerNumeros(File fich){
     
    List <Integer> listaNumeros = new LinkedList();
        try {
            sc = new Scanner(fich);
            while(sc.hasNextInt()){
            
            Integer valor = sc.nextInt();
            if (valor%2!=0){
            listaNumeros.add(valor);
            }
            //listaNumeros.add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("fallo al abrir");
         }finally{
        sc.close();
        }
    
    return (LinkedList<Integer>) listaNumeros;


}
public void lerObxectos(File fich){

        try {
            sc = new Scanner(fich).useDelimiter(",\\s*");
            while(sc.hasNextLine()){
                
                //System.out.println(sc.next());
               // System.out.println(sc.nextLine().substring(0, 3)+""+sc.nextLine().substring(3, 4));
                
                int prueba = sc.nextInt();
                System.out.println("->"+prueba);
               //Xogador obx = new Xogador(sc.nextLine().substring(0, 3),sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("BOM!");
        }

}
}
