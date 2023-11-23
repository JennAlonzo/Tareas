/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filabs;

/**
 *
 * @author jenni
 */

import java.util.Scanner;
import java.io.*;


public class Filabs {

    public static void main(String[] args) {
        
        try{
         WebMaker generador = new WebMaker();
        PrintWriter escritor = new PrintWriter("index.html");
        Scanner lector = new Scanner(new FileReader("form.txt"));
        
        escritor.println(generador.imprimirEncabezado());
        
        escritor.println(generador.imprimirTexto("Un quokka"));
        escritor.println(generador.insertarImagen("Q.jpg"));
        
        while(lector.hasNext()){
            escritor.println(lector.nextLine());
        }
        
        escritor.println(generador.imprimirCierre());
        
        lector.close();
        escritor.close();
        }catch(FileNotFoundException e){
        }
        
        
        /*
        DataOutputStream escritor = new DataOutputStream(new FileOutputStream("hola.bin"));
        
        escritor.writeInt(33465);
        escritor.writeChar('a');
        escritor.writeChar('z');
        escritor.writeShort(10);
        
        escritor.close();
        
        DataInputStream lector = new DataInputStream(new FileInputStream("hola.bin"));
        System.out.println(lector.readInt());
        System.out.println(lector.readChar());
        System.out.println(lector.readChar());
        System.out.println(lector.readShort());
        
        lector.close();

        */
        
        /*
        ObjectInputStream lector = new ObjectInputStream(new FileInputStream("web.obj"));
        PrintWriter escritor = new PrintWriter("main.html");
        
        WebMaker pagina = (WebMaker)(lector.readObject());
        escritor.print(pagina.printPage());
        
        lector.close();
        escritor.close();
        */
        
    }
}
