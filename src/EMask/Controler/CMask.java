package EMask.Controler;

import EMask.Model.MMask;
import java.time.LocalTime;
import java.util.ArrayList;

public class CMask {
    ArrayList<CMask> mascara = new ArrayList<>();
    int idMask = 1;

    public ArrayList<CMask> getAll(){
        return mascara;
    }

    public int addIdMask () {
        return this.idMask++;
    }

    public void addCMask (CMask m){
        this.mascara.add(m);
    }

    public CMask() {
    }
    
    public void mokMascara(){
        MMask m1 = new MMask();
        m1.setIdMask(this.addIdMask());
        m1.setTipoMask("Máscara N-95");
        m1.setHoraMask1(168);
        m1.setHoraMask2(LocalTime.MAX);
        
        MMask m2 = new MMask();
        m2.setIdMask(this.addIdMask());
        m2.setTipoMask("Máscara cirurgica");
        m2.setHoraMask1(4);//não tenho certeza
        m2.setHoraMask2(LocalTime.MAX);
        
        MMask m3 = new MMask();
        m3.setIdMask(this.addIdMask());
        m3.setTipoMask("Máscara de tecido");
        m3.setHoraMask1(2);
        m3.setHoraMask2(LocalTime.MAX);
    }
    
    
    
     public int getHoraMask1(int idMask){
        int tempoUso = (getHoraMask1(idMask));
        for(CMask listMask: mascara){
            if (listMask.getIdMask()==idMask) {
                tempoUso = listMask.getHoraMask1(tempoUso);
                break;
            }
        }
        return tempoUso;
    }

    private int getIdMask() {
        return 0;
    }
   /* public String getNomePes(int idPessoa){
        String nome = null;
        for(Pessoa listPes: pessoas){
            if (listPes.getIdPessoa()==idPessoa) {
                nome = listPes.getNomePessoa();
                break;
            }
        }
        return nome;


 public int pesqIdPes(String cpf) {
        int idPessoa = 0;
        for (Pessoa listPes : pessoas) {
            if (listPes.getCpf().equals(cpf)) {
                idPessoa = listPes.getIdPessoa();
                break;
            }
        }
        return idPessoa;
    }



*/
//(getMaskbyid)

// return getHoraMask1*/
}
