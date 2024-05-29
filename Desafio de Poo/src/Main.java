public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();
        meuIPhone.proximaMusica();
        meuIPhone.musicaAnterior();

        meuIPhone.fazerChamada("(xx)1234-5678");
        meuIPhone.atenderChamada();
        meuIPhone.encerrarChamada();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
