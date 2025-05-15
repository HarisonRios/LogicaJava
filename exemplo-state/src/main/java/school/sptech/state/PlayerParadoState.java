package school.sptech.state;

import school.sptech.Player;

public class PlayerParadoState extends PlayerState {

    public PlayerParadoState(Player player) {
        super(player);
    }

    @Override
    public void tocandoAgora() {
        System.out.println("Player Parado");
    }

    @Override
    public void tocar() {
        getPlayer().setPlayerState(new PlayerTocandoState(this.getPlayer()));
    }

    @Override
    public void parar() {
        System.out.println("Parando Musica");
    }
}
