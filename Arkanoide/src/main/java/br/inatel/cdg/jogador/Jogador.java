package br.inatel.cdg.jogador;

import br.inatel.cdg.Bloco.Bloco;

public class Jogador {

    private int pontos;

    public void destruirbloco(Bloco bloco){

        bloco.destruir();
        pontos++;
    }

    public int getPontos() {
        return this.pontos;
    }
}
