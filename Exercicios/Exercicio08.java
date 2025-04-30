package Exercicios;

import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    int[] vetorC = new int[vetorA.length + vetorB.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o " + (i + 1) + " valor do vetor A: ");
      vetorA[i] = sc.nextInt();
    }
    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Digite o " + (i + 1) + " valor do vetor B: ");
      vetorB[i] = sc.nextInt();
    }
    for (int i = 0; i < vetorC.length; i++) {
      if (i < vetorA.length) {
        vetorC[i] = vetorA[i];
      } else {
        vetorC[i] = vetorB[i - vetorA.length];
      }
    }
    System.out.println("Vetor C: ");
    for (int i = 0; i < vetorC.length; i++) {
      System.out.print(vetorC[i] + " ");
    }
    sc.close();
  }
  
}
