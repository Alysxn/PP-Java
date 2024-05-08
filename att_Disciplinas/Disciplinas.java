package att_Disciplinas;

import java.util.Scanner;

public class Disciplinas{ // Criando Classe
  String disciplinas;
  Scanner scanner = new Scanner(System.in);
  public void inserirDiscplina(){//Método para inserir uma disciplina 
    
   System.out.println("Digite o nome da disciplina: ");
    String novaDiscplina = scanner.nextLine(); // input do usuário
    disciplinas = novaDiscplina; // atribuir input a váriavel disciplinas
  }

  public void mostrarDiscplinas(){ //método para mostrar disciplinas
    System.out.println("\n" + disciplinas); // printar disciplinas
  }
}