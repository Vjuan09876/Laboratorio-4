public class Main {
    public static void main(String[] args) {
        ContenidoController cCtrl = new ContenidoController();
        UsuarioController uCtrl = new UsuarioController();

        uCtrl.agregarUsuario(new Administrador("Admin1", "admin@ega.com"));
        uCtrl.agregarUsuario(new Editor("Editor1", "editor@ega.com"));

        VistaCMS vista = new VistaCMS(cCtrl, uCtrl);
        vista.mostrarMenu();
    }
}
