package br.inatel.cdg.inimigo;

import br.inatel.cdg.jogador.Nave;

public class Asteroide {

    private String nome;
    private String tipoAsteroide;


    public Asteroide(String nome, String tipoAsteroide)
    {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;

    }
    public void destruir()
    {
        System.out.println("Asteroide"+this.nome + "destruido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    public Nave getNave() {
        return Nave;
    }

    public void setNave(Nave nave) {
        this.nome = nave;
    }
}
