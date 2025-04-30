package Exercicios;
import java.util.Scanner;
public class Exercicio10 {
  public static void main(String[] args) {
    int[] vetor = new int[10];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Digite o " + (i + 1) + " valor do vetor: ");
      vetor[i] = scanner.nextInt();
    }

 
    for (int i = 0; i < vetor.length - 1; i++) {
      for (int j = 0; j < vetor.length - 1 - i; j++) {
        if (vetor[j] > vetor[j + 1]) {
          int vetor2 = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = vetor2;
        }
      }
    }
    
    System.out.println("Vetor ordenado: ");
    for (int num : vetor) {
      System.out.print(num + " ");
    }
    scanner.close();
  }
  
}
