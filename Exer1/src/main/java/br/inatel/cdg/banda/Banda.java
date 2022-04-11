package br.inatel.cdg.banda;

import br.inatel.cdg.membro.Membro;
import br.inatel.cdg.musica.Musica;

public class Banda {

        private String nome;
        private String genero;
        private Musica[] musicas;
        private Membro[] membros;


        public Banda(String nome,String genero) {

            this.genero = genero;
            this.nome = nome;

            membros = new Membro[3];
            musicas = new Musica[3];

        }
     void addMusicaNova(Musica novaMusicas)
    {
        for(int i=0; i<musicas.length; i++)
        {
            if(musicas[i] == null) {
                musicas[i] = novaMusicas;
                break;
            }

        }
    }

void addMembroNovo(Membro novoMembros)
            {
                for(int i=0; i<membros.length; i++)
                {
                    if(membros[i] == null) {

                        membros[i] = novoMembros;

                        break;
                    }

                }
            }

   void mostrarInfo
}

