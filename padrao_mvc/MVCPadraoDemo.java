import controller.EstudanteController;
import model.Estudante;
import view.EstudanteView;

public class MVCPadraoDemo {
    public static void main(String[] args) {
        Estudante model = buscarEstudante();

        EstudanteView view = new EstudanteView();

        EstudanteController controller = new EstudanteController(model, view);

        controller.atualizaView();

        controller.setEstudanteNome("José");

        controller.atualizaView();
    }

    private static Estudante buscarEstudante(){
        Estudante estudante = new Estudante();
        estudante.setNome("Pedro");
        estudante.setNota(9);
        return estudante;
    }

}