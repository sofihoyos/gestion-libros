import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    private List<Libro> libros;

    public LibroDAOImpl() {
        this.libros = new ArrayList<>();
    }

    @Override
    public void crearLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro creado: " + libro);
    }

    @Override
    public Libro leerLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        System.out.println("Libro no encontrado con ID: " + id);
        return null;
    }

    @Override
    public List<Libro> listarLibros() {
        return libros;
    }

    @Override
    public void actualizarLibro(Libro libroActualizado) {
        for (Libro libro : libros) {
            if (libro.getId() == libroActualizado.getId()) {
                libro.setTitulo(libroActualizado.getTitulo());
                libro.setAutor(libroActualizado.getAutor());
                libro.setAnioPublicacion(libroActualizado.getAnioPublicacion());
                System.out.println("Libro actualizado: " + libro);
                return;
            }
        }
        System.out.println("Libro no encontrado con ID: " + libroActualizado.getId());
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
        System.out.println("Libro eliminado con ID: " + id);
    }
}