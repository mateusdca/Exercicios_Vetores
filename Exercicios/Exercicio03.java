package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[20];
    int pares = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt();
      if (numeros[i] % 2 == 0) {
        pares++;
      }
    }
    System.out.println("A quantidade de números pares é: " + pares);
    sc.close();
  }
  
}
