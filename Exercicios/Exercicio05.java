package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float[] numeros = new float[12];
    float media = 0;
    float soma = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt();
      soma += numeros[i];
    }
    media = soma / numeros.length;
    System.out.printf("A média dos números é:  %.2f\n", media);
    System.out.println("Números maiores que a média: ");
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > media) {
        System.out.print(numeros[i] + "  ");
      }
    } 
    sc.close();
  }
  
}
