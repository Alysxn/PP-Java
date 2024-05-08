package att_Filmes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filmes novoFilme = new Filmes();
        String informacoesFilmes;

        System.out.println("Digite os dados do seu filme favorito!\n");

        System.out.println("Digite o título do filme: ");
        informacoesFilmes = scanner.nextLine();
        novoFilme.inserirTitulo(informacoesFilmes);

        System.out.println("Digite o gênero do filme: ");
        informacoesFilmes = scanner.nextLine();
        novoFilme.inserirGenero(informacoesFilmes);

        System.out.println("Digite o idioma original do filme: ");
        informacoesFilmes = scanner.nextLine();
        novoFilme.inserirIdioma(informacoesFilmes);

        System.out.println("Digite a sinopse do filme: ");
        informacoesFilmes = scanner.nextLine();
        novoFilme.inserirSinopse(informacoesFilmes);

        System.out.println("Digite a plataforma disponivel do filme: ");
        informacoesFilmes = scanner.nextLine();
        novoFilme.inserirPlataformaDisponivel(informacoesFilmes);

        System.out.println("Digite o ano de lançamento do filme: ");
        int anoLancamento = scanner.nextInt();
        novoFilme.inserirAnoDeLancamento(anoLancamento);

        System.out.println("Digite a faixa etária do filme: ");
        int faixaEtaria = scanner.nextInt();
        novoFilme.inserirfaixaEtaria(faixaEtaria);

        novoFilme.imprimeDados();

        scanner.close(); 
    }
}
