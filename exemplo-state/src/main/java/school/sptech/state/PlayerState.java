package school.sptech.state;

import school.sptech.Player;

public abstract class PlayerState {
    private Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract void tocandoAgora();

    public abstract void tocar();

    public abstract void parar();

    public Player getPlayer() {
        return player;
    }
}
