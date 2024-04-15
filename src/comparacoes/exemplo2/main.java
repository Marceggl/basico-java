package comparacoes.exemplo2;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        usuario usuario = new usuario();

        System.out.println("Informe o ID do usuário: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Informe a senha:" );
        String pwd = input.nextLine();

        if(usuario.getId() != id || !usuario.getPwd().equalsIgnoreCase(pwd)){
            System.out.println("Usuário ou senha inválidos");
        }else{
            System.out.println("Acesso permitido");
        }

    }
}