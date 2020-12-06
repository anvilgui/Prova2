import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

class Main {
  public static void main(String[] args) {
        
    Jogador jogador1 = new Jogador("Super Mario", 25, 243, 91);
        
    Inimigo inimigo1 = new Inimigo("Wario", 118, 41);
    Inimigo inimigo2 = new Inimigo("Waluigi", 162, 36);
        
    Luta luta = new Luta();
        
    System.out.println("Hora de salvar a princesa e então chegam os inimigos Waluigi e Wario.");
    System.out.println("Super Mario: Vou ganhar vidas com cogumelos e atacar Wario \n");
    luta.enfrentar(inimigo1, jogador1);
    System.out.println("Essa não, preciso atacar Waluigi, e salvar a princesa Peach \n");
    luta.enfrentar(inimigo2, jogador1);
    jogador1.resultadoPlayer();    
  }
}