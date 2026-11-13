import java.util.*;
import java.util.stream.*;

public class ReadyBake{
    public static void main(String[] args){
        Songs songs = new Songs();
        List<Song> songsList = songs.getSongs();

        List<Song> topFive = songsList.stream()
                                     .sorted((p1, p2) -> p2.getTimesPlayed()-p1.getTimesPlayed())
                                     .limit(5)
                                     .collect(Collectors.toList());

        List<String> genreTypes = songsList.stream()
                                            .map(p -> p.getGenre())
                                            .distinct()
                                            .collect(Collectors.toList());

        Boolean artistasCanciones = songsList.stream()
                                            .collect(Collectors.groupingBy(
                                                p -> p.getArtist(),
                                                Collectors.counting()
                                            ))
                                            .values()
                                            .stream()
                                            .anyMatch(count -> count > 1);

        System.out.println("Lista ordenada con las 5 más escuchadas:" + topFive);
        System.out.println("Lista de todos los generos escuchados:" + genreTypes);
        System.out.println("Hay artistas con más de una canción:"+ artistasCanciones);
    }
    
    
}