package att_Filmes;
public class Filmes{
        String titulo;
        String genero;
        String idioma;
        String sinopse;
        String plataformaDisponivel;
        int anoDeLancamento;
        int faixaEtaria;


        public void inserirTitulo(String tituloFilme){
            titulo = tituloFilme;
        }
        public void inserirGenero(String generoFilme){
            genero = generoFilme;
        }
        public void inserirIdioma(String idiomaFilme){
            idioma = idiomaFilme;
        }
        public void inserirSinopse(String sinopseFilme){
            sinopse = sinopseFilme;
        }
        public void inserirPlataformaDisponivel(String plataformaDisponivelFilme){
            plataformaDisponivel = plataformaDisponivelFilme;
        }

        public void inserirAnoDeLancamento(int anoDeLancamentoFilme){
            anoDeLancamento = anoDeLancamentoFilme;
        }
        public void inserirfaixaEtaria(int faixaEtariaFilme){
            faixaEtaria = faixaEtariaFilme;
        }



        public void imprimeDados(){
            System.out.println("Muito obrigado! Segue as informações completas do seu filme favorito: \n");
            System.out.println("Titulo: " + titulo);
            System.out.println("Genero: " + genero);
            System.out.println("Idioma orinal: " + idioma);
            System.out.println("Sinopse: " + sinopse);
            System.out.println("Plataforma disponivel: " + plataformaDisponivel);
            System.out.println("Ano de lancamento: " + anoDeLancamento);
            System.out.println("faixaEtaria: " + faixaEtaria);
        }
}


