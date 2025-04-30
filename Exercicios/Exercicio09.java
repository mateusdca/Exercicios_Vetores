package Exercicios;
public class Exercicio09 {
  public static void main(String[] args) {
    int[] vetorA = new int[6];
    int[] vetorB = new int[6];
    int iguais = 0;
    
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = (int) (Math.random() * 10);
    }
    for (int j = 0; j < vetorB.length; j++) {
      vetorB[j] = (int) (Math.random() * 10);
    }
    for (int i = 0; i < vetorA.length; i++) {
      for (int j = 0; j < vetorB.length; j++) {
        if (vetorA[i] == vetorB[j]) {
          iguais++;
        }
      }
    }
    int[] vetorC = new int[iguais];
    int k = 0;
    for (int i = 0; i < vetorA.length; i++) {
      for (int j = 0; j < vetorB.length; j++) {
        if (vetorA[i] == vetorB[j]) {
          vetorC[k] = vetorA[i];
          k++;
        }
      }
    }
    System.out.println("Vetor A: ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println();
    System.out.println("Vetor B: ");
    for (int i = 0; i < vetorB.length; i++) {
      System.out.print(vetorB[i] + " ");
    }
    System.out.println();
    System.out.println("Vetor C: ");
    for (int i = 0; i < vetorC.length; i++) {
      System.out.print(vetorC[i] + " ");
    }
    
  }
  
}
