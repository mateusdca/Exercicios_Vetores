package Exercicios;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[15];
    int numeroEscolhido;
    int cont = 0;

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * 10);
    }
    System.out.println("Digite um numero de 1 a 9 que pode estar no vetor: ");
    numeroEscolhido = scanner.nextInt();
    for (int i = 0; i < vetor.length; i++) {
      if (numeroEscolhido == vetor[i]) {
        cont++;
      }
    }
    System.out.println("Numero " + numeroEscolhido + " encontrado " + cont + " vezes no vetor: ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    scanner.close();

  }
  
}
