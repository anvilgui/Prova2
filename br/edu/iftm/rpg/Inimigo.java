package br.edu.iftm.rpg;

public class Inimigo {
    
    private String nome;
    private int vida;
    private int dano;

    
    public Inimigo (String nome, int vida, int dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
    
    public void atacar(Jogador jogador){
        System.out.println("O "+ nome +" atacou o "+ jogador.getNome() +" e causou "+ dano +" de dano. \n");
        jogador.perderVida(dano);
    }
    public void perderVida(int pontos){
        System.out.println("O "+ nome +" perdeu "+ pontos +" pontos de vida.\n");
        vida = vida - pontos;
        if(vida <= 0){
            System.out.println("O "+ nome +" morreu.\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}