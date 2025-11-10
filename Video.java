public class Video extends Contenido {
    private String url;
    private int duracionSeg;

    public Video(int id, String titulo, String autor, String categoria, String url, int duracionSeg) {
        super(id, titulo, autor, categoria);
        this.url = url;
        this.duracionSeg = duracionSeg;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("video");
        System.out.println("titulo" + titulo);
        System.out.println("url" + url);
        System.out.println("duracion" + duracionSeg + "seg");
        System.out.println("categoria" + categoria);
        System.out.println("publicado: " + publicado);
    }
}
