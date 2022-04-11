package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Asteroide asteroide1 = new Asteroide("Asteroide1","Pequeno");
        Asteroide asteroide2 = new Asteroide("Asteroide2","Grande");

        Nave nave1 = new Nave("Nave1",100.0,"Normal");
        Nave nave2 = new Nave("Nave2",200.0,"Explosivo");

        nave1.atirar(asteroide1); // Destroi o asteroide
        nave1.atirar(asteroide2); // Não é possivel destruir

        nave2.atirar(asteroide1); // Destroi o asteroide
        nave2.atirar(asteroide2); // Destroi o asteroide

    }


}
