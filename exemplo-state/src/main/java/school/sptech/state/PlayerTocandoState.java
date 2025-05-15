package school.sptech.state;

import school.sptech.Player;

public class PlayerTocandoState extends PlayerState {

    public PlayerTocandoState(Player player) {
        super(player);
    }

    @Override
    public void tocandoAgora() {
         Integer musicaAtual = this.getPlayer().getMusicaAtual();
         System.out.println("Tocando Agora: ");
         System.out.println(this.getPlayer().getMusicas().get(musicaAtual));
    }

    @Override
    public void tocar() {
        System.out.println("Musica Tocando...");
    }

    @Override
    public void parar() {
        getPlayer().setPlayerState(new PlayerParadoState(this.getPlayer()));
    }
}
