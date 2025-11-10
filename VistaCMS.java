import java.util.List;
import java.util.Scanner;

public class VistaCMS {
    private ContenidoController contenidoController;
    private UsuarioController usuarioController;
    private Scanner scanner;

    public VistaCMS(ContenidoController cCtrl, UsuarioController uCtrl) {
        this.contenidoController = cCtrl;
        this.usuarioController = uCtrl;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("cms");
            System.out.println("1. agregar articulo");
            System.out.println("2. agregar video");
            System.out.println("3. agregar imagen");
            System.out.println("4. publicar contenido");
            System.out.println("5. mostrar todos");
            System.out.println("6. filtrar por categoria");
            System.out.println("7. reporte");
            System.out.println("0. salir");
            System.out.print("opcion");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    agregarArticulo();
                case 2:
                    agregarVideo();
                case 3:
                    agregarImagen();
                case 4:
                    publicar();
                case 5:
                    contenidoController.mostrarTodos();
                case 6:
                    filtrarCategoria();
                case 7:
                    System.out.println(contenidoController.generarReporte());
                case 0:
                    System.out.println("saliendo");
                default:
                    System.out.println("no valido");
            }
        }
    }

    private void agregarArticulo() {
        System.out.print("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("titulo");
        String titulo = scanner.nextLine();
        System.out.print("autor");
        String autor = scanner.nextLine();
        System.out.print("categoria");
        String cat = scanner.nextLine();
        System.out.print("texto");
        String texto = scanner.nextLine();

        Articulo a = new Articulo(id, titulo, autor, cat, texto);
        contenidoController.agregarContenido(a);
    }

    private void agregarVideo() {
        System.out.print("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("titulo");
        String titulo = scanner.nextLine();
        System.out.print("autor");
        String autor = scanner.nextLine();
        System.out.print("categoria");
        String cat = scanner.nextLine();
        System.out.print("url");
        String url = scanner.nextLine();
        System.out.print("duracion");
        int dur = Integer.parseInt(scanner.nextLine());

        Video v = new Video(id, titulo, autor, cat, url, dur);
        contenidoController.agregarContenido(v);
    }

    private void agregarImagen() {
        System.out.print("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("autor: ");
        String autor = scanner.nextLine();
        System.out.print("categoria");
        String cat = scanner.nextLine();
        System.out.print("url");
        String url = scanner.nextLine();
        System.out.print("formato");
        String formato = scanner.nextLine();

        Imagen img = new Imagen(id, titulo, autor, cat, url, formato);
        contenidoController.agregarContenido(img);
    }

    private void publicar() {
        System.out.print("id del contenido a publicar");
        int id = Integer.parseInt(scanner.nextLine());
        contenidoController.publicarContenido(id);
    }

    private void filtrarCategoria() {
        System.out.print("categoria a buscar");
        String cat = scanner.nextLine();
        List<Contenido> lista = contenidoController.filtrarPorCategoria(cat);
        for (Contenido c : lista) {
            c.mostrarDetalle();
        }
    }
}
