public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Usando as funcionalidades do Reprodutor Musical
        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();
        meuIPhone.proximaMusica();
        meuIPhone.musicaAnterior();

        // Usando as funcionalidades do Aparelho Telefônico
        meuIPhone.fazerChamada("(xx)1234-5678");
        meuIPhone.atenderChamada();
        meuIPhone.encerrarChamada();
        meuIPhone.iniciarCorreioVoz();

        // Usando as funcionalidades do Navegador de Internet
        meuIPhone.exibirPagina("www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
