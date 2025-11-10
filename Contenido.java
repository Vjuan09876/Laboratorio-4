public abstract class Contenido {
    protected int id;
    protected String titulo;
    protected String autor;
    protected String categoria;
    protected boolean publicado;

    public Contenido(int id, String titulo, String autor, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.publicado = false;
    }

    public void editar(String nuevoTitulo, String nuevaCategoria) {
        this.titulo = nuevoTitulo;
        this.categoria = nuevaCategoria;
    }

    public void publicar() {
        this.publicado = true;
        System.out.println("contenido""titulo "\" publicado");
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isPublicado() {
        return publicado;
    }

    public abstract void mostrarDetalle();
}
