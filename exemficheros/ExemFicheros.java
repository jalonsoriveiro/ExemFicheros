/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemficheros;

import com.jose.lectura.Lectura;
import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author jalonsoriveiro
 */
public class ExemFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lectura obx = new Lectura();
        File f = new File("Palabras.txt");
        obx.lerLineas(f);        
        File F2 = new File("/home/local/DANIELCASTELAO/jalonsoriveiro/Escritorio/Palabras2.txt");        
        File F3 = new File("/home/local/DANIELCASTELAO/jalonsoriveiro/Escritorio/Numeros.txt");        
        obx.lerLineas(F2);            
        System.out.println("segundo metodo");
        obx.lerPalabra(F2);
        System.out.println("Separando por comas");
        obx.lerPalabrasUsoDeLimitadores(F2);
        
        LinkedList<Integer> lista = obx.lerNumeros(F3);
        System.out.println("for");
        for (Integer v :lista){
    
        System.out.println("***"+v);
            System.out.println("objet");
             File F4 = new File("/home/local/DANIELCASTELAO/jalonsoriveiro/Escritorio/Xogadores.txt");       
            //obx.lerObxectos(F4);
        
            System.out.println("profe");
            obx.lerObxectosprofe(F4);
    }
        
        
    }
    
}
