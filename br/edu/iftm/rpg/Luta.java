package br.edu.iftm.rpg;

public class Luta {
    
    private Inimigo inimigo;
    private Jogador jogador;

    public void enfrentar(Inimigo inimigo, Jogador jogador){
      this.inimigo = inimigo;
      this.jogador = jogador;

        jogador.resultadoPlayer();
        System.out.println("\n");
        jogador.atacar(inimigo);
        inimigo.atacar(jogador);
        jogador.atacar(inimigo);
        System.out.println("\n");


    }
}