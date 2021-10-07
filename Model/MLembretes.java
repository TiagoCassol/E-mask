package EMask.Model;

import java.time.*;

public class MLembretes {

        
    private int idCliente;
    private int idMask;
    private int idLembrete;
    private String tipoLembrete;
    private boolean exercLembrete;
    private LocalTime hExposInicial;
    private LocalTime hExposFinal;
    private LocalTime hExercInicial; 
    private LocalTime hExercFinal;
    

    public MLembretes() {
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMask() {
        return this.idMask;
    }

    public void setIdMask(int idMask) {
        this.idMask = idMask;
    }

    public int getIdLembrete() {
        return this.idLembrete;
    }

    public void setIdLembrete(int idLembrete) {
        this.idLembrete = idLembrete;
    }

    public String getTipoLembrete() {
        return this.tipoLembrete;
    }

    public void setTipoLembrete(String tipoLembrete) {
        this.tipoLembrete = tipoLembrete;
    }

    public boolean isExercLembrete() {
        return this.exercLembrete;
    }

    public boolean getExercLembrete() {
        return this.exercLembrete;
    }

    public void setExercLembrete(boolean exercLembrete) {
        this.exercLembrete = exercLembrete;
    }

    public LocalTime getHExposInicial() {
        return this.hExposInicial;
    }

    public void setHExposInicial(LocalTime hExposInicial) {
        this.hExposInicial = hExposInicial;
    }

    public LocalTime getHExposFinal() {
        return this.hExposFinal;
    }

    public void setHExposFinal(LocalTime hExposFinal) {
        this.hExposFinal = hExposFinal;
    }

    public LocalTime getHExercInicial() {
        return this.hExercInicial;
    }

    public void setHExercInicial(LocalTime hExercInicial) {
        this.hExercInicial = hExercInicial;
    }

    public LocalTime getHExercFinal() {
        return this.hExercFinal;
    }

    public void setHExercFinal(LocalTime hExercFinal) {
        this.hExercFinal = hExercFinal;
    }

    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", idMask='" + getIdMask() + "'" +
            ", idLembrete='" + getIdLembrete() + "'" +
            ", tipoLembrete='" + getTipoLembrete() + "'" +
            ", exercLembrete='" + isExercLembrete() + "'" +
            ", hExposInicial='" + getHExposInicial() + "'" +
            ", hExposFinal='" + getHExposFinal() + "'" +
            ", hExercInicial='" + getHExercInicial() + "'" +
            ", hExercFinal='" + getHExercFinal() + "'" +
            "}";
    }

    }

  
    




























// if (dataAtual >= dataInicio && dataAtual <= dataFinal) {
// for (int i = 0; i <= 1; i++) {
// System.out.println("Lembrete");
// }
// }
