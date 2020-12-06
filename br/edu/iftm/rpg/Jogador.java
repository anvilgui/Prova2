package br.edu.iftm.rpg;

public class Jogador {
   
    private String nome;
    private int nivel;
    private int vida;
    private int dano;

    public Jogador(String nome, int nivel, int vida, int dano){
      this.nome = nome;
      this.nivel = nivel;
      this.vida = vida;
      this.dano = dano;
    }
    
    public void atacar(Inimigo inimigo){
      System.out.println("O "+ nome +" atacou o "+ inimigo.getNome() +" e causou "+ dano +" de dano.\n");
      inimigo.perderVida(dano);
    }

    public void perderVida(int pontos){
      System.out.println("O "+ nome +" perdeu "+ pontos +" pontos de vida.\n");
      vida = vida - pontos;
      if(vida <= 0){
      System.out.format("O "+ nome +" morreu.\n");
        }
    }

    public void resultadoPlayer(){
      System.out.println("Classificação do jogador \n");
      System.out.format("1- Nome : "+ nome +"\n");
      System.out.format("2- Nível : "+ nivel + "\n");
      System.out.format("3- PV atual: "+ vida +"\n");
      System.out.format("4- Ataque: "+ dano +"\n");
    }
    
    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public int getNivel() {
      return nivel;
    }

    public void setNivel(int nivel) {
      this.nivel = nivel;
    }
    
    public int getDano() {
      return dano;
    }

    public void setDano(int dano) {
      this.dano = dano;
    }
}