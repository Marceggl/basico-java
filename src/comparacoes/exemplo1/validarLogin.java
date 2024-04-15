package comparacoes.exemplo1;// Válidação super simples de usuário e senha

import java.util.Scanner;

public class validarLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 1234;
        String pwd = "beterraba";

        System.out.println("Informe o ID do usuário: ");
        int id_input = input.nextInt();
        input.nextLine();

        System.out.println("Informe a senha do usuário");
        String pwd_input = input.nextLine();


        if(id_input != id || !pwd_input.equalsIgnoreCase(pwd)){
            System.out.println("O ID ou senha fornecido é inválido");
        }else{
            System.out.println("Acesso permitido");
        }

        input.close();

    }
}