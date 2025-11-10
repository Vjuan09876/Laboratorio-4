import java.util.ArrayList;
import java.util.List;

public class ContenidoController implements IReportable {
    private List<Contenido> contenidos;

    public ContenidoController() {
        this.contenidos = new ArrayList<>();
    }

    public void agregarContenido(Contenido c) {
        contenidos.add(c);
        System.out.println("contenido agregado" + c.getId());
    }

    public void eliminarContenido(int id) {
        Contenido encontrado = null;
        for (Contenido c : contenidos) {
            if (c.getId() == id) {
                encontrado = c;
            }
        }
        if (encontrado != null) {
            contenidos.remove(encontrado);
            System.out.println("contenido eliminado" + id);
        } else {
            System.out.println("no se encontro contenido con id" + id);
        }
    }

    public void publicarContenido(int id) {
        for (Contenido c : contenidos) {
            if (c.getId() == id) {
                c.publicar();
                return;
            }
        }
        System.out.println("no se encontro contenido con id" + id);
    }

    public List<Contenido> filtrarPorCategoria(String categoria) {
        List<Contenido> resultado = new ArrayList<>();
        for (Contenido c : contenidos) {
            if (c.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public List<Contenido> filtrarPorTipo(String tipo) {
        List<Contenido> resultado = new ArrayList<>();
        for (Contenido c : contenidos) {
            if (tipo.equalsIgnoreCase("articulo") && c instanceof Articulo) {
                resultado.add(c);
            } else if (tipo.equalsIgnoreCase("video") && c instanceof Video) {
                resultado.add(c);
            } else if (tipo.equalsIgnoreCase("imagen") && c instanceof Imagen) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public String generarReporte() {
        int total = contenidos.size();
        int publicados = 0;
        for (Contenido c : contenidos) {
            if (c.isPublicado()) {
                publicados++;
            }
        }
        return "\ntotal" + total + "\npublicados" + publicados;
    }

    public void mostrarTodos() {
        for (Contenido c : contenidos) {
            c.mostrarDetalle(); 
            System.out.println("");
        }
    }
}
