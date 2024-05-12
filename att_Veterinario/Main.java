import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Animal();
        DonoAnimal pessoa01 = new DonoAnimal();
        Scanner scanner = new Scanner(System.in);
        Veterinario vet01 = new Veterinario();
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
        System.out.println("\n");
        pessoa01.pagamento();
        System.out.println("\n");

        System.out.println("Por favor, precisamos que cadastre as informações do seu PET.\n");

        System.out.println("Nome do PET: ");
        scanner.nextLine();
        userInputString = scanner.nextLine();
        animal01.setNome(userInputString);

        System.out.println("Sexo do PET (Macho/Fêmea): ");
        userInputString = scanner.nextLine();
        animal01.setSexo(userInputString);

        System.out.println("Idade do PET: ");
        userInputIntNumber = scanner.nextInt();
        animal01.setIdade(userInputIntNumber);

        System.out.println("Espécie do PET: ");
        scanner.nextLine();
        userInputString = scanner.nextLine();
        animal01.setEspecie(userInputString);

        System.out.println("\nFicha do PET registrada com sucesso:\n");

        // decisão de consulta ou tratamento pedida anteriormente
        if (userInputIntNumber == 0) {
            animal01.iniciaConsulta();
        } else if (userInputIntNumber == 1) {
            animal01.iniciaTratamento();
        }
        System.out.println("\n");

        animal01.imprimeFicha();

        System.out.println("<<<<<<<<<< Sistema Veterinária Bicho-Amigo / Cadastro do Veterinário >>>>>>>>>>");

        System.out.println("\n");

        System.out.println("Nome do Veterinário: ");
        userInputString = scanner.nextLine();
        vet01.setNome(userInputString);

        System.out.println("Telefone do Veterinário: ");
        userInputString = scanner.nextLine();
        vet01.setTelefone(userInputString);

        System.out.println("Endereço do Veterinário: ");
        userInputString = scanner.nextLine();
        vet01.setEndereco(userInputString);

        System.out.println("Número do Conselho Veterinário: ");
        userInputString = scanner.nextLine();
        vet01.setCodigoVeterinario(userInputString);

        System.out.println("\n");

        System.out.println("Deseja ser responsável por consultas ou tratamentos? [0] Consultas | [1] Tratamentos ");
        userInputIntNumber = scanner.nextInt();

        if (userInputIntNumber == 0) {
            vet01.setConsulta(true);
        } else if (userInputIntNumber == 1) {
            vet01.setTratamento(true);
        }
        System.out.println("Cadastro do veterinário realizado com sucesso:\n");

        vet01.imprimeFicha();
        scanner.close();
        System.out.println("\n");
    }
}
