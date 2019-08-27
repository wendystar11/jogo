/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
/**
 *
 * @author 013946
 */
public class Cliente1 {
    public static void main(String[] args) {
     try {
       String mensagem = "teste";
       ObjectOutputStream oos;
       ObjectInputStream ois;
       Socket cliente = new Socket("127.0.0.1", 12345);
       oos = new ObjectOutputStream(
               cliente.getOutputStream());
       oos.flush();
       //cÓDIGO ADICIONADO
       
       oos.writeInt(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero")));
       
       
       //FIM DO CÓDIGO ADICIONADO
       //oos.writeObject("FAM");
       ois = new ObjectInputStream(cliente.getInputStream());
       mensagem = (String) ois.readObject();
       //codigo adicionado - JOptionPane.showInputDialog(null, "Informe um numero");
       ois.close();
       oos.close();
       System.exit(0);
     } catch (IOException | ClassNotFoundException e) {
       System.out.println(String.format("Erro: %s",
               e.getLocalizedMessage()));
     }//fim do catch
   } 
}
