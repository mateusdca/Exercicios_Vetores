package Exercicios;

import java.util.Scanner;
public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[15];
    int maior = numeros[0];
    int posicao = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt();
      if (numeros[i] > maior) {
        maior = numeros[i];
        posicao = i;
      }
    }
    System.out.println("O maior número é o " + (posicao+1) + "º número: "+ maior );
    sc.close();
  }
  
}
