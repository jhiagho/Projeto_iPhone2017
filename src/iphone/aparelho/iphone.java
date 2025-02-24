package iphone.aparelho;
import iphone.AparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusica.ReprodutorMusical;

public class iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero + "\n");
    }

    @Override
    public void atender() {
        System.out.println("Vou atender Ligação \n");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("iniciou o correio de Voz \n");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando url:" + url + "\n");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba \n");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando.... \n");
    }

    @Override
    public void tocar() {
        System.out.println("Musica Iniciada.. \n");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada \n");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada \n");
    }
}
