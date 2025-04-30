package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int numeroEscolhido = 0;

    System.out.println("Escolha um numero do vetor para ser removido: ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();
    numeroEscolhido = scanner.nextInt();
    
    int[] novoVetor = new int[vetor.length - 1];
    int j = 0;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] != numeroEscolhido) {
        novoVetor[j] = vetor[i];
        j++;
      }
    }
    System.out.println("Vetor sem o numero escolhido: ");
    for (int i = 0; i < novoVetor.length; i++) {
      System.out.print(novoVetor[i] + " ");
    }
    scanner.close();
    


  }
  
}
