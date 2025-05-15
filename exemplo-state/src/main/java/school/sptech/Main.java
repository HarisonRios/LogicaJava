package school.sptech;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("A", 1231, "a");
        Musica musica2 = new Musica("B", 1231, "b");
        Musica musica3 = new Musica("c", 1231, "c");
        Musica musica4 = new Musica("d", 1231, "d");

        Player player = new Player();
        player.adicionarMusica(musica);
        player.adicionarMusica(musica2);
        player.adicionarMusica(musica3);
        player.adicionarMusica(musica4);

        player.tocandoAgora();
        player.tocar();
        player.tocandoAgora();
        player.parar();
        player.tocandoAgora();
    }
}