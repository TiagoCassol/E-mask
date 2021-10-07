package EMask.Model;

import java.time.LocalTime;

public class MMask {

    private int idMask;
    private String tipoMask;
    private int horaMask1;
    private LocalTime horaMask2;


    public MMask() {
    }

    public int getIdMask() {
        return this.idMask;
    }

    public void setIdMask(int idMask) {
        this.idMask = idMask;
    }

    public String getTipoMask() {
        return this.tipoMask;
    }

    public void setTipoMask(String tipoMask) {
        this.tipoMask = tipoMask;
    }

    public int getHoraMask1() {
        return this.horaMask1;
    }

    public void setHoraMask1(int horaMask1) {
        this.horaMask1 = horaMask1;
    }

    public LocalTime getHoraMask2() {
        return this.horaMask2;
    }

    public void setHoraMask2(LocalTime horaMask2) {
        this.horaMask2 = horaMask2;
    }

    @Override
    public String toString() {
        return "{" +
            " idMask='" + getIdMask() + "'" +
            ", tipoMask='" + getTipoMask() + "'" +
            ", horaMask1='" + getHoraMask1() + "'" +
            ", horaMask2='" + getHoraMask2() + "'" +
            "}";
    }
    
}
