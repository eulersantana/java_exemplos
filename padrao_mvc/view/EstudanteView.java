package view;

public class EstudanteView {
    public void printEstudante(String estudanteNome, Integer estudanteNota){
        System.out.println("Estudante:");
        System.out.println("Nome: " + estudanteNome);
        System.out.println("Notas: " + String.valueOf(estudanteNota));
    }
}
