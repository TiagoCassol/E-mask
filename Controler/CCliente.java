package EMask.Controler;

import java.util.ArrayList;

import EMask.Model.MCliente;

public class CCliente {
    
    ArrayList<CCliente> cliente = new ArrayList<>();
    int idCliente = 1;

    public ArrayList<CCliente> getCliente(){
        return cliente;
    }

    public int addIdCliente () {
        return this.idCliente++;
    }

    public void addCCliente (CCliente c){
        this.cliente.add(c);
    }

    public CCliente() {

    }
 /* private int idCliente; //PK
 private String nomeCliente;
 private String cpf;
 private int idadeCliente;
 private String enderecoCliente;
 private String telCliente;
 private String idiomaCliente;
 private String emailCliente;
 private String sexoCliente;
 private String senhaCliente;
 private String susCliente;*/
    public void mokCliente() {
        MCliente c1 = new MCliente();
        c1.setIdCliente(this.addIdCliente());
        c1.setNomeCliente("Samir");
        c1.setCpf("000.000.000-01");
        c1.setIdadeCliente(20);
        c1.setEnderecoCliente("Rua 1");
        c1.setTelCliente("999999999");
        c1.setIdiomaCliente("Português");
        c1.setEmailCliente("aaaaaaaaaaa@amail.com");
        c1.setSexoCliente("Masculino");
        c1.setSenhaCliente("111111");
        c1.setSusCliente("000000000000001");

        MCliente c2 = new MCliente();
        c2.setIdCliente(this.addIdCliente());
        c2.setNomeCliente("Said");
        c2.setCpf("000.000.000-02");
        c2.setIdadeCliente(25);
        c2.setEnderecoCliente("Rua 2");
        c2.setTelCliente("988888888");
        c2.setIdiomaCliente("Português");
        c2.setEmailCliente("bbbbbbbbbbbb@bmail.com");
        c2.setSexoCliente("Masculino");
        c2.setSenhaCliente("222222");
        c2.setSusCliente("000000000000002");

        MCliente c3 = new MCliente();
        c3.setIdCliente(this.addIdCliente());
        c3.setNomeCliente("Aisha");
        c3.setCpf("000.000.000-03");
        c3.setIdadeCliente(25);
        c3.setEnderecoCliente("Rua 3");
        c3.setTelCliente("977777777");
        c3.setIdiomaCliente("Inglês");
        c3.setEmailCliente("ccccccccccccc@cmail.com");
        c3.setSexoCliente("Feminino");
        c3.setSenhaCliente("333333");
        c3.setSusCliente("000000000000003");
     
    }
       
}
