/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 013946
 */
public class ServidorTCP {
     public static void main(String[] args) {
     try {
       ServerSocket socketServidor = new ServerSocket(12345);
       while (true) {
         Jogo j = new Jogo();
         String mensagem;
         ObjectInputStream ois;
         ObjectOutputStream oos;
         Socket cliente = socketServidor.accept();
         System.out.println("1");
         ois = new ObjectInputStream(
                 cliente.getInputStream());
         System.out.println("2");
         mensagem = (String) ois.readObject();
         System.out.println("3");
         //System.out.println(mensagem);
         oos = new ObjectOutputStream(
                 cliente.getOutputStream());
         oos.flush();
         oos.writeObject(String.format("Recebido: %s",
                 mensagem));
         oos.close();
        ois.close();
               }
             } catch (IOException | ClassNotFoundException e ) {
               System.out.println(String.format("Erro: %s",
                       e.getLocalizedMessage()));
             }
           }
         

}
