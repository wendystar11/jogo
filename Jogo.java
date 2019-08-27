/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author 013946
 */
public class Jogo {
    private Jogador j1;
    private Jogador j2;
    private int soma;
    
    
    public String jogar(){
        j1.setNumero(12);
        j2.setNumero(16);
        soma = j1.getNumero() + j2.getNumero();
        
        if(soma%2 == 0){
            return "par";
        }else{
            return "Ímpar";
        }
        
        
        
        
    }
}
