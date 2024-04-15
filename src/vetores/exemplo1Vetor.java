package vetores;

public class exemplo1Vetor {
    public static void main(String[] args) {
        // Criação de vetor com 5 indices
        int[] vetor1 = {10, 20, 30, 40, 50};

        //Mostrar o que há em cada indice do vetor
        for(int i=0; i < vetor1.length; i++){
            System.out.println("Valor no índice " + i + " é " + vetor1[i]);
        }
    }
}

