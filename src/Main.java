import iphone.aparelho.iphone;

public class Main {
    public static void main(String[] args) {

        iphone celular = new iphone();

        celular.ligar("12345678");
        celular.atender();
        celular.IniciarCorreioVoz();

        celular.exibirPagina("www.google.com");
        celular.AtualizarPagina();
        celular.adicionarNovaAba();

        celular.tocar();
        celular.SelecionarMusica("pagode");
        celular.pausar();

    }
}