package minhasmusicas.principal;

import minhasmusicas.modelos.MinhasPreferidas;
import minhasmusicas.modelos.Musica;
import minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Be Yourself");
        minhaMusica.setArtista("Audioslave");

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(meuPodcast);
        preferidas.incluir(minhaMusica);
    }
}
