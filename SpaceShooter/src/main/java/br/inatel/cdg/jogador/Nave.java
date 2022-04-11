package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {

        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;

    }

    public void atirar(Asteroide ast)
    {
        if(tipoTiro.equals("Explosivo"))
        {
            ast.destruir();
        }else{
            if(ast.getTipoAsteroide().equals("Grande"))
            {
                System.out.println("Nave do tiro normal não destroi asteroide grande");

            }else{

                ast.destruir();

            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }
}


