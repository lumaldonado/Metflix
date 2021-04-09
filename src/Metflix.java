import java.util.*;
public class Metflix {

    public List<Serie> series = new ArrayList<>();
    public List<Pelicula> peliculas = new ArrayList<>();

    //metodos: buscar peli o serie
    //buscar genero
    //buscar director
    public void inicializarCatalogo(){

        Pelicula titanic;
        titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic. anoLanzamiento = 1997;
        titanic.duracion = 210; //3 hs y m 30 mins

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        titanic.actores.add(actor);
        this.peliculas.add(titanic); //aca agregue a titanic al catalogo

        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: El caballero de la Noche";
        batman.anoLanzamiento = 2008;
        batman.duracion = 152;

        actor = new Actor();
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);
        this.peliculas.add(batman);

        Serie howImet = new Serie();
        howImet.nombre = "How I Met Your Mother";
        howImet.anoLanzamiento = 2005;

        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";
        howImet.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";
        howImet.actores.add(actor);

        Temporada temporada = new Temporada();
        temporada.numero = 5;

        Episodio episodio = new Episodio();
        episodio.nombre = "The Last Cigarette";
        episodio.numero = 11;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;
        temporada.episodios.add(episodio);
        howImet.temporadas.add(temporada);








    }


}
