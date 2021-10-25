package EMask.Controler;

import java.time.LocalTime;
import java.util.ArrayList;
import EMask.Model.MLembretes;

public class CLembretes {

    ArrayList<MLembretes> lembretes = new ArrayList<>();
    int idLembrete = 1;

    public ArrayList<MLembretes> getLembretes() {
        return lembretes;
    }

    public int addIdLembretes() {
        return this.idLembrete++;
    }

    private int addIdMask() {
        return 0;
    }

    private int addIdCliente() {
        return 0;
    }

    public void addCLembretes(MLembretes m) {
        this.lembretes.add(m);
    }

    public CLembretes() {
    }

    public void mokLembretes() {
        MLembretes l1 = new MLembretes();
        l1.setIdCliente(this.addIdCliente());
        l1.setIdMask(this.addIdMask());
        l1.setIdLembrete(this.addIdLembretes());
        l1.setTipoLembrete("Horário de Exercícios");
        l1.setHExposInicial(LocalTime.of(8, 00));
        l1.setHExposFinal(LocalTime.of(20, 00));
        l1.setHExercInicial(LocalTime.of(8, 00));
        l1.setHExercFinal(LocalTime.of(12, 00));

        MLembretes l2 = new MLembretes();
        l2.setIdCliente(1);
        l2.setIdMask(2);
        l2.setIdLembrete(this.addIdLembretes());
        l2.setTipoLembrete("Horário de Exposição");
        l2.setHExposInicial(LocalTime.of(9, 00));
        l2.setHExposFinal(LocalTime.of(22, 30));
        l2.setHExercInicial(null);
        l2.setHExercFinal(null);

    }

    public LocalTime getHExposInicial(int idLembrete) {
        LocalTime exposInicial = LocalTime.of(0, 00); //validar numero diferente de 0 no main
        for (MLembretes listLembretes : lembretes) {
            if (listLembretes.getIdLembrete() == idLembrete) {
                exposInicial = listLembretes.getHExposInicial();
                break;
            }
        }
        return exposInicial;
    }

    public LocalTime getHExposFinal(int idLembrete) {
        LocalTime exposFinal = LocalTime.of(0, 00); //validar numero diferente de 0 no main
        for (MLembretes listLembretes : lembretes) {
            if (listLembretes.getIdLembrete() == idLembrete) {
                exposFinal = listLembretes.getHExposFinal();
                break;
            }
        }
        return exposFinal;
    }
    public LocalTime getHExercInicial(int idLembrete) {
        LocalTime exercInicial = LocalTime.of(0, 00); //validar numero diferente de 0 no main
        for (MLembretes listLembretes : lembretes) {
            if (listLembretes.getIdLembrete() == idLembrete) {
                exercInicial = listLembretes.getHExercInicial();
                break;
            }
        }
        return exercInicial;
    }
    public LocalTime getHExercFinal(int idLembrete) {
        LocalTime exercFinal = LocalTime.of(0, 00); //validar numero diferente de 0 no main
        for (MLembretes listLembretes : lembretes) {
            if (listLembretes.getIdLembrete() == idLembrete) {
                exercFinal = listLembretes.getHExercFinal();
                break;
            }
        }
        return exercFinal;

    }
    

}
