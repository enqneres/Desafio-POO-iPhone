public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    private ReprodutorMusical reprodutorMusical;

    @Override
    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarChamadaDeVoz() {
        aparelhoTelefonico.iniciarChamadaDeVoz();
    }

    @Override
    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }
}
