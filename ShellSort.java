package Ordenacao;

public class ShellSort {

    public void shellsort(int [] vetor){
        int h = 1;
        int tamanho = vetor.length;

        while (h < tamanho) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int aux, j;
        while (h > 0){
            for (int i = h; i < tamanho; i++){
                aux = vetor[i];
                j = i;
                while (j>= h && vetor[j-h] > aux){
                    vetor[j] = vetor[j-h];
                    j = j - h;
                }
                vetor[j] = aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {1, 9, 4, 8, 0};
        ShellSort s = new ShellSort();
        s.shellsort(vetor);

        for (int n: vetor){
            System.out.println(n);
        }
    }

}
