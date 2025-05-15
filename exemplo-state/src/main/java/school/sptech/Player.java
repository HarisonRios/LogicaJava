package school.sptech;

import school.sptech.state.PlayerParadoState;
import school.sptech.state.PlayerState;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Musica> musicas;
    public Integer musicaAtual = 0;

    private PlayerState playerState;

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
    }

    public void tocandoAgora(){
       playerState.tocandoAgora();
    }

    public void tocar(){
        playerState.tocar();
    }

    public void parar(){
        playerState.parar();
    }

    public void proxima(){
        musicaAtual++;
    }

    public void anterior(){
        musicaAtual--;
    }



    public Player() {
        musicas = new ArrayList<>();
        musicaAtual = 0;
        playerState = new PlayerParadoState(this);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Integer getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Integer musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }
}
