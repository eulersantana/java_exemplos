package controller;

import model.Estudante;
import view.EstudanteView;

public class EstudanteController {
    private Estudante model;
    private EstudanteView view;

    public EstudanteController(Estudante model, EstudanteView view){
        this.model = model;
        this.view = view;
    }

    public String getEstudanteNome() {
        return model.getNome();
    }
    public void setEstudanteNome(String nome) {
        model.setNome(nome);
    }

    public Integer getEstudanteNota() {
        return model.getNota();
    }
    public void setEstudanteNota(Integer nota) {
        model.setNota(nota);s
    }

    public void atualizaView(){
        view.printEstudante(model.getNome(), model.getNota());
    }
}
