package vetores;

public class exemplo2Vetor {
    public static void main(String[] args) {
        //Criar um vetor bidimensional, basicamente uma matrix
        int[][] vetor2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        //Iterar sobre as linhas da Matrix
        for(int i=0; i < vetor2.length; i++){
            //Iterar sobre as colunas da Matrix
            for(int j=0; j < vetor2[i].length; j++){
                //Mostrar o que há em cada "Célula" da Matrix
                System.out.println("Varlores da linha " + i + " é: " + vetor2[i][j]);
            }
        }
    }
}
