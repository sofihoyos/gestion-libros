import java.util.List;

public interface LibroDAO {
    void crearLibro(Libro libro);
    Libro leerLibro(int id);
    List<Libro> listarLibros();
    void actualizarLibro(Libro libro);
    void eliminarLibro(int id);
}