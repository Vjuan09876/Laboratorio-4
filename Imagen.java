public class Imagen extends Contenido {
    private String url;
    private String formato;

    public Imagen(int id, String titulo, String autor, String categoria, String url, String formato) {
        super(id, titulo, autor, categoria);
        this.url = url;
        this.formato = formato;
    }
    public void mostrarDetalle() {
        System.out.println("imagen");
        System.out.println("titulo" + titulo);
        System.out.println("url" + url);
        System.out.println("formato" + formato);
        System.out.println("categoria" + categoria);
        System.out.println("publicado" + publicado);
    }
}
