package EMask.Model;

public class MCliente {

    private int idCliente; //PK
    private String nomeCliente;
    private String cpf;
    private int idadeCliente;
    private String enderecoCliente;
    private String telCliente;
    private String idiomaCliente;
    private String emailCliente;
    private String sexoCliente;
    private String senhaCliente;
    private String susCliente;



    public MCliente() {
    }


    public MCliente(int idCliente, String nomeCliente, String cpf, int idadeCliente, String enderecoCliente, String telCliente, String idiomaCliente, String emailCliente, String sexoCliente, String senhaCliente, String susCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.idadeCliente = idadeCliente;
        this.enderecoCliente = enderecoCliente;
        this.telCliente = telCliente;
        this.idiomaCliente = idiomaCliente;
        this.emailCliente = emailCliente;
        this.sexoCliente = sexoCliente;
        this.senhaCliente = senhaCliente;
        this.susCliente = susCliente;
    }


    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdadeCliente() {
        return this.idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getEnderecoCliente() {
        return this.enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelCliente() {
        return this.telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getIdiomaCliente() {
        return this.idiomaCliente;
    }

    public void setIdiomaCliente(String idiomaCliente) {
        this.idiomaCliente = idiomaCliente;
    }

    public String getEmailCliente() {
        return this.emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getSexoCliente() {
        return this.sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getSenhaCliente() {
        return this.senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    public String getSusCliente() {
        return this.susCliente;
    }

    public void setSusCliente(String susCliente) {
        this.susCliente = susCliente;
    }
   

    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", nomeCliente='" + getNomeCliente() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", idadeCliente='" + getIdadeCliente() + "'" +
            ", enderecoCliente='" + getEnderecoCliente() + "'" +
            ", telCliente='" + getTelCliente() + "'" +
            ", idiomaCliente='" + getIdiomaCliente() + "'" +
            ", emailCliente='" + getEmailCliente() + "'" +
            ", sexoCliente='" + getSexoCliente() + "'" +
            ", senhaCliente='" + getSenhaCliente() + "'" +
            ", susCliente='" + getSusCliente() + "'" +
            "}";
    }
    

   
}
