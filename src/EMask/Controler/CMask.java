package EMask.Controler;

import EMask.Model.MMask;
import java.time.LocalTime;
import java.util.ArrayList;

public class CMask {
    ArrayList<MMask> mascara = new ArrayList<>();
    int idMask = 1;

    public ArrayList<MMask> getAll(){
        return mascara;
    }

    public int addIdMask () {
        return this.idMask++;
    }

    public void addCMask (MMask m){
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
        int tempoUso = 0;
        for(MMask listMask: mascara){
            if (listMask.getIdMask()==idMask) {
                tempoUso = listMask.getHoraMask1();
                break;
            }
        }
        return tempoUso;
    }

}
