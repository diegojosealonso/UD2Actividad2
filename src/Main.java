import Articulos.*;
import Usuarios.Administrador;
import Usuarios.Cliente;
import Usuarios.Usuario;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Todo sobre el amor", 1999, 14.25, "bell hooks", 256, Libro.Genero.HISTORIA);
        Libro l2 = new Libro("La política cultural de las emociones", 2004, 20.0, "Sarah Ahmed", 368, Libro.Genero.HISTORIA);
        Pelicula p1 = new Pelicula("¿Dónde está la casa de mi amigo?", 1987, 21.5, "Abbas Kiarostami", 83);
        Pelicula p2 = new Pelicula("Tōkyō monogatari", 1953, 11.9, "Yasujiro Ozu", 136);
        AlbumMusica a1 = new AlbumMusica("Imaginal Disk", 2024, 15.53, "Magdalena Bay", 15, false );
        AlbumMusica a2 = new AlbumMusica("Ya no hay verano", 2020, 3.5, "Depresión sonora", 1, true);
        VideoJuego v1 = new VideoJuego("The Legend of Zelda: Majora's Mask", 2000, 62.59, "Takaya Imamura", "Nintendo 64", 3);
        VideoJuego v2 = new VideoJuego("The Legend of Zelda: Ocarina of Time", 1998, 60.0, "Takaya Imamura", "Nintendo 64", 3);
        Cliente nerea = new Cliente("Nerea", "1234", 1, 2001, l1, 1);
        Cliente manuel = new Cliente("Manuel", "0000", 2, 2005, v2, 2);
        Administrador terry = new Administrador("Terry", "terry1234", 3, 2006, Administrador.rol.VENDEDOR);
        terry.asignarArticulo(nerea, l1);}
}