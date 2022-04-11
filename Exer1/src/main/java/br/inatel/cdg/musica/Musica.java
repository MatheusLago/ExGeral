package br.inatel.cdg.musica;

public class Musica {

    private String nome;
    double duracao;

public Musica(double duracao,String nome)
{

      this.duracao = duracao;
      this.nome = nome;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
