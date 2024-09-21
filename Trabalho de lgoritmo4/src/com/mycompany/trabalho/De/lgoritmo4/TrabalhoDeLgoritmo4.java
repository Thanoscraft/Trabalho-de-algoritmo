
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho.De.lgoritmo4;

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TrabalhoDeLgoritmo4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String gênero = "m";
        String sobrenome = "Alves";
        int idade = 22;
        double Salário = 1999.88;
        double altura = 1.79;
        double peso = 70;
        System.out.println("Digite sua idade");
        idade=scanner.nextInt();
        if(idade >= 21) {
        System.out.println("Pessoa maior de 21 ");
        }else{
        System.out.println("menor de 21 anos");
        }
        System.out.println("Digite seu salário");
        Salário=scanner.nextDouble();
          if (Salário >= 5*1200){
              System.out.println("Maior do que 5 salários minimos");
        }else{
          System.out.println("Menor do que 5 salários Minimos");
          }
          System.out.println("Digite sua altura");
          altura=scanner.nextDouble();
          if(altura >= 1.75){
          System.out.println("Maior do que 1.75");
          }else{
          System.out.println("Menor do que 1.75");
          }
          System.out.println("Digite seu peso");
          peso=scanner.nextDouble();
          if(peso >= 70){
          System.out.println("Maior do que 70");
          }else {
          System.out.println("Maior do que 70");
          }
          System.out.println("Digite seu sobre nome");
          sobrenome=scanner.nextLine();
          if(!sobrenome.matches("Alves")) {
              System.out.println("sobrenome coreeto");
          } else {
          System.out.println("sobrenome incorreto");
          }
          System.out.println("Digite seu Gênero");
          gênero=scanner.nextLine();
          if(gênero.matches("f")) {
          System.out.println("Correto");
          }else{
          System.out.println("incorreto");
          }
          
    }
}
