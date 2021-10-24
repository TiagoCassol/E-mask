package EMask.Controler;

import java.util.ArrayList;
import EMask.Model.MCliente;
import EMask.View.ClientePrincipal;

public class CCliente implements InterfaceMask<MCliente>{
    
    ArrayList<MCliente> cliente = new ArrayList<>();
    int idCliente = 1;

    @Override
    public ArrayList<MCliente> getAll(){
        return cliente;
    }

    @Override
    public int gerarId () {
        return this.idCliente++;
    }

    @Override
    public void add (MCliente c){
        this.cliente.add(c);
    }

    public CCliente() {

    }

    public void mokCliente() {
        MCliente c1 = new MCliente();
        c1.setIdCliente(this.gerarId());
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
        c2.setIdCliente(this.gerarId());
        c2.setNomeCliente("Said");
        c2.setCpf("000.000.000-02");
        c2.setIdadeCliente(25);
        c2.setEnderecoCliente("Rua 2");
        c2.setTelCliente("988888888");
        c2.setIdiomaCliente("Português");
        c2.setEmailCliente("bbbbbbbbbbbb@bmail.com");
        c2.setSexoCliente("Masculino");
        c2.setSenhaCliente("222222");
        c2.setSusCliente("00000000000002");

        MCliente c3 = new MCliente();
        c3.setIdCliente(this.gerarId());
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
      public boolean verNumeroSus(String susCliente) {
    boolean verSusCliente = false;
    for (MCliente listCli : cliente) {
        if (listCli.getSusCliente().equals(susCliente)) {
            verSusCliente = true;
            break;
        }
    }
    return verSusCliente;
} 
      
      public boolean verEmail(String emailCliente) {
    boolean verEmail = false;
    for (MCliente listCli : cliente) {
        if (listCli.getSusCliente().equals(emailCliente)) {
            verEmail = true;
            break;
        }
    }
    return verEmail;
} 
      
      public boolean verSenha(String senhaCliente) {
    boolean verSenha = false;
    for (MCliente listCli : cliente) {
        if (listCli.getSenhaCliente().equals(senhaCliente)) {
            verSenha = true;
            break;
        }
    }
    return verSenha;
} 

    /**
     *
     * @param susCliente
     * @return
     */
    @Override
    public MCliente getByDoc(String susCliente) {
        MCliente c = new MCliente();
        for (MCliente listCli : cliente) {
            if (listCli.getSusCliente().equals(susCliente)) {
                c = listCli;
                break;
            }
        }
        return c;
    }

    public MCliente selecionaEmail(String emailCliente) {
        MCliente c = new MCliente();
        for (MCliente listCli : cliente) {
            if (listCli.getEmailCliente().equals(emailCliente)) {
                c = listCli;
                break;
            }
        }
        return c;
    }
    
    @Override
    public boolean deletar(MCliente o) {
        boolean remove = this.cliente.remove(o);
        return remove;
    }

    public String getNomeCli(int idCliente){
        String nome = null;
        for(MCliente listCli: cliente){
            if (listCli.getIdCliente()==idCliente) {
                nome = listCli.getNomeCliente();
                break;
            }
        }
        return nome;
    }
    public boolean verCPF(String cpf) {
    boolean verCPF = false;
    for (MCliente listCli : cliente) {
        if (listCli.getCpf().equals(cpf)) {
            verCPF = true;
            break;
        }
    }
    return verCPF;
}
}

      

