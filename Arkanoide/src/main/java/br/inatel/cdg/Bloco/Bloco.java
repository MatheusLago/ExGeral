package br.inatel.cdg.Bloco;

public class Bloco {

    private static int numBloco = 0;

public Bloco(){

    numBloco++;

}
public void destruir(){

    System.out.println("Bloco sendo destruido");
    numBloco--;

}
public static int getNumBloco(){

    return numBloco;

}


}
