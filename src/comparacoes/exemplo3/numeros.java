package comparacoes.exemplo3;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int x = input.nextInt();
        input.nextLine(); //Limpar buffer

        System.out.println("Informe outro numero: ");
        int y = input.nextInt();
        input.nextLine(); //Limpar buffer

        if(x == y){
            System.out.println("Números são iguais");
        }else{
            System.out.println("Números são diferentes");
        }
    }
}
