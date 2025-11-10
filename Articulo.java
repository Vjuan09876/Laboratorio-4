public class Articulo extends Contenido {
    private String texto;

    public Articulo(int id, String titulo, String autor, String categoria, String texto) {
        super(id, titulo, autor, categoria);
        this.texto = texto;
    }

    public void mostrarDetalle() {
        System.out.println("articulo");
        System.out.println("titulo" + titulo);
        System.out.println("autor: " + autor);
        System.out.println("categoria" + categoria);
        System.out.println("publicado" + publicado);
        System.out.println("texto" + texto);
    }
}
