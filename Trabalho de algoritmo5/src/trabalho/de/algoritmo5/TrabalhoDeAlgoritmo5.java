/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt hange this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho.de.algoritmo5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TrabalhoDeAlgoritmo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nome = "Enzo";
        int idade = 18;
        double peso = 80;
        double altura = 1.83;
        String anime = "Dragon Ball";
        String filme = "Harry Potter";
        String Esporte = "Jil jitsu";
        
        System.out.println("Digite Seu Filme Favorito");
        filme=scanner.nextLine();
          if(filme.matches("Harry Potter")) {
              System.out.println("filme coreeto");
          } else {
          System.out.println("Filme incorreto");
          }
            System.out.println("Digite seu sobre nome");
          anime=scanner.nextLine();
          if(anime.matches("Dragon Ball")) {
              System.out.println("anime coreeto");
          } else {
          System.out.println("anime incorreto");
          }
            System.out.println("Digite seu sobre nome");
          Esporte=scanner.nextLine();
          if(Esporte.matches("jil jitsu")) {
              System.out.println("Esporte coreeto");
          } else {
          System.out.println("Esporte incorreto");
          }
          System.out.println("Digite sua altura");
          altura=scanner.nextDouble();
          if(altura == 1.83){
          System.out.println("altura correta");
          }else{
          System.out.println("altura incorreta");
          }
          
          System.out.println("Digite seu peso");
          peso=scanner.nextDouble();
          if(peso == 80){
          System.out.println("peso correto");
          }else {
          System.out.println("peso incorreto");
          }
           System.out.println("Digite sua idade");
        idade=scanner.nextInt();
        if(idade == 18) {
        System.out.println("idade correta");
        }else{
        System.out.println("idade correta");
        }
}
    
}
