package br.inatel.cdg;

import br.inatel.cdg.Bloco.Bloco;
import br.inatel.cdg.conversor.Conversor;
import br.inatel.cdg.jogador.Jogador;

public class Main {

    public static void main(String[] args) {

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();

        System.out.println("Quantidade de Blocos: " +Bloco.getNumBloco());

        Jogador jogador1 = new Jogador();
        jogador1.destruirbloco(bloco1);

        System.out.println("Blocos: "+Bloco.getNumBloco());
        System.out.println("Pontos do jogador: "+ jogador1.getPontos());





    }

}
