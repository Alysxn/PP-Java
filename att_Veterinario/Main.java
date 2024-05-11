import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Animal();
        DonoAnimal pessoa01 = new DonoAnimal();
        Scanner scanner = new Scanner(System.in);
        String userInputString;
        int userInputIntNumber;

        System.out.println("<<<<<<<<<< Sistema Veterinária Bicho-Amigo / Marcar consultas e tratamentos >>>>>>>>>>\n");
        System.out.println("Marque sua consulta / tratamento.\n");
        System.out.println("Informe seu nome: ");

        userInputString = scanner.nextLine();
        pessoa01.setNome(userInputString);

        System.out.println("Informe seu endereço: ");
        userInputString = scanner.nextLine();
        pessoa01.setEndereco(userInputString);

        System.out.println("Informe seu telefone: ");
        userInputString = scanner.nextLine();
        pessoa01.setTelefone(userInputString);

        System.out.println("Dados registrados.\n");
        System.out.println("Por favor informe: Deseja inicar uma consulta ou um tratamento?");
        System.out.println("[0] Consulta | [1] Tratamento: ");
        userInputIntNumber = scanner.nextInt();

        if (userInputIntNumber == 0) {
            pessoa01.setConsulta(true);
        } else if (userInputIntNumber == 1) {
            pessoa01.setTratamento(true);
        }

        System.out.println("Segue a ficha do usuário:\n");
        pessoa01.imprimeFicha();

    }
}
