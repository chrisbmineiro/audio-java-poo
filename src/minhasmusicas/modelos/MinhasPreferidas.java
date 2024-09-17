package minhasmusicas.modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é um sucesso absoluto e amado por muita gente");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo esta curtindo");
        }
    }
}
