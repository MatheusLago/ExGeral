package br.inatel.cdg.empresario;

public class Empresario {

    private long cnpj;
    private String nome;

public Empresario(String nome,long cnpj)
    {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
