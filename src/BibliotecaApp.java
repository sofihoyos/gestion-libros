public class BibliotecaApp {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        // Crear libros
        Libro libro1 = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro3 = new Libro(3, "1984", "George Orwell", 1949);

        libroDAO.crearLibro(libro1);
        libroDAO.crearLibro(libro2);
        libroDAO.crearLibro(libro3);

        // Leer un libro
        System.out.println("\nLeyendo libro con ID 2:");
        Libro libroLeido = libroDAO.leerLibro(2);
        if (libroLeido != null) {
            System.out.println(libroLeido);
        }

        // Listar todos los libros
        System.out.println("\nLista de todos los libros:");
        for (Libro libro : libroDAO.listarLibros()) {
            System.out.println(libro);
        }

        // Actualizar un libro
        System.out.println("\nActualizando el libro con ID 1:");
        Libro libroActualizado = new Libro(1, "Cien años de soledad (Edición revisada)", "Gabriel García Márquez", 1970);
        libroDAO.actualizarLibro(libroActualizado);

        // Eliminar un libro
        System.out.println("\nEliminando el libro con ID 3:");
        libroDAO.eliminarLibro(3);

        // Listar todos los libros después de las modificaciones
        System.out.println("\nLista de todos los libros después de las modificaciones:");
        for (Libro libro : libroDAO.listarLibros()) {
            System.out.println(libro);
        }
    }
}