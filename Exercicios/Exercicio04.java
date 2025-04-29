package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[8];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt();
    }
    System.out.print("Vetor na ordem inversa: ");
    for (int i = numeros.length - 1; i >= 0; i--) {
      
      System.out.print(numeros[i]);
      if (i != 0) {
        System.out.print(", ");
      }
      
    }
    sc.close();
  }
  
}
