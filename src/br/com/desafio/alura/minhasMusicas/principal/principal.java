package br.com.desafio.alura.minhasMusicas.principal;

import br.com.desafio.alura.minhasMusicas.modelo.MinhasPreferidas;
import br.com.desafio.alura.minhasMusicas.modelo.Musica;
import br.com.desafio.alura.minhasMusicas.modelo.PodCast;

public class principal {
    public static void main(String[] args) {
        Musica musica =  new Musica();
        musica.setTitulo("Time");
        musica.setCantor("Pink Floyd");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        PodCast podCast = new PodCast();
        podCast.setTitulo("Flow");
        podCast.setHost("Igor");

        for (int i = 0; i < 500 ; i++) {
            podCast.reproduz();
        }

        for (int i = 0; i < 250; i++) {
            podCast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podCast);
        preferidas.inclui(musica);
    }
}
