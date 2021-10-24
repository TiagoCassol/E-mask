package EMask.View;

import EMask.Controler.CCliente;
import EMask.Model.MCliente;
import java.util.Scanner;

public class ClientePrincipal {
    public static Scanner ler = new Scanner(System.in);
    public static CCliente logar = new CCliente();
    
    public static String leTexto() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
    public static void menu1(){
        System.out.println("------------------");
        System.out.println("|  Tela de Login |");
        System.out.println("------------------");
        System.out.println("1 - Logar na conta");
        System.out.println("2 - Cadastrar conta");
        System.out.println("3 - Entrar com email");
        System.out.println("0 - Sair");
    }
    
    public static void menu2(){
        System.out.println("-------------------");
        System.out.println("|  Tela Inicial  |");
        System.out.println("-------------------");
        System.out.println("1 - Endereço");
        System.out.println("2 - Configuração");
    }
    
    public static void login() {
        boolean system = false;

        do {
            System.out.println("-- Login --");
            System.out.println("");
            String senhaCliente;
            boolean testarNumeroSus = false;
            boolean testarSenha= false;
            boolean logC;
            do {
                logC = false;
                System.out.print("Usuario(N° SUS): ");
                String susCliente = leTexto();
                if (logar.verNumeroSus(susCliente)) {
                    MCliente c;
                    c= logar.getByDoc(susCliente); 
                    System.out.println(logar.getNomeCli(c.getIdCliente()));
                    boolean senha = false;
                    do{
                        System.out.print("coloque a senha");
                        senhaCliente = leTexto();
                        if(logar.verSenha(senhaCliente)){
                        c= logar.getByDoc(senhaCliente);
                            System.out.println("login realizado");
                        } else {
                           System.out.println("senha inválido");;
                    System.out.print("Deseja tentar novamente? 1-Sim | 0-Não");
                int i = ler.nextInt();
                logC = i == 1;
                        }
                    }while(senha);
                } else {
                    System.out.println("Numero sus inválido");;
                    System.out.print("Deseja tentar novamente? 1-Sim | 0-Não");
                int i = ler.nextInt();
                logC = i == 1;
                }
            } while (logC);
           
        }while (system);
        }

    
    public static void cadCliente(){
        boolean system = false;
        do{
            
        System.out.println("-------------------------");
        System.out.println("|  Cadastro de Usuario  |");
        System.out.println("-------------------------");
        String nomeCliente;
        String cpf;
        int idCliente;
        int idadeCliente;
        String enderecoCliente;
        String telCliente;
        String idiomaCliente;
        String emailCliente;
        String sexoCliente;
        String senhaCliente;
        String susCliente;
            System.out.println("Informe seu nome: ");
            nomeCliente = leTexto();
            boolean testaSusCliente = false;
            do{
                System.out.println("informe seu numero do cartão sus");
                susCliente= leTexto();
                if(susCliente.length() != 15){
                    testaSusCliente = true;
                    System.out.println("Numero Sus incorreto, tente novamente!");
                }else{
                    testaSusCliente= logar.verNumeroSus(susCliente);
                }
            }while(testaSusCliente);
            boolean testaCPF=false;
            do{
            System.out.println("Informe seu cpf");  
            cpf = leTexto();
                if (cpf.length() != 11) {
                    testaCPF = true;
                    System.out.println("CPF incorreto, tente novamente!");
                } else {
                    testaCPF = logar.verCPF(cpf);
                }
            }while(testaCPF);
            System.out.println("Informe sua idade: ");
            idadeCliente = ler.nextInt();
            System.out.print("Informe o endereço: ");
            enderecoCliente = leTexto();
            System.out.print("Informe o email: ");
            emailCliente = leTexto();
            System.out.println("Informe seu sexo: ");
            sexoCliente = leTexto();
            boolean testaSenha = false;
            do{
                System.out.println("Crie sua senha: ");
                senhaCliente = leTexto();
                if (senhaCliente.length() < 5){
                    testaSenha= true;
                    System.out.println("Senha muito fraca!");
                }else{
                    testaSenha = logar.verSenha(senhaCliente);
                }
            }while (testaSenha);
            
            boolean testaTel;
            do{
            testaTel = false;    
            System.out.println("Informe seu numero de telefone(com DDD)");
            telCliente = leTexto();
            if (telCliente.length() != 10 && telCliente.length() != 11) {
                    testaTel = true;
                    System.out.println("Telefone informado esta incorreto");
                }
            System.out.print("Informe seu idioma: ");
            idiomaCliente = leTexto();
            }while (testaTel);
            
            idCliente = logar.gerarId();
            MCliente c = new MCliente(idCliente,nomeCliente, cpf, idadeCliente, enderecoCliente, telCliente, idiomaCliente,emailCliente,sexoCliente,senhaCliente, susCliente);
            logar.add(c);
        } while(system);
    }    
    
    public static void loginEmail(){
        boolean system = false;

        do {
            System.out.println("-- Login com email --");
            System.out.println("");
            String senhaCliente;
            boolean logC;
            do {
                logC = false;
                System.out.print("Digite seu email: ");
                String emailCliente = leTexto();
                if (logar.verEmail(emailCliente)) {
                    MCliente c;
                    c= logar.selecionaEmail(emailCliente); 
                    System.out.println(logar.getNomeCli(c.getIdCliente()));
                    boolean senha = false;
                    do{
                        System.out.print("coloque a senha");
                        senhaCliente = leTexto();
                        if(logar.verSenha(senhaCliente)){
                        c= logar.getByDoc(senhaCliente);
                            System.out.println("login realizado");
                        } else {
                           System.out.println("senha inválido");;
                    System.out.print("Deseja tentar novamente? 1-Sim | 0-Não");
                int i = ler.nextInt();
                logC = i == 1;
                        }
                    }while(senha);
                } else {
                    System.out.println(" email inválido");
                    System.out.print("Deseja tentar novamente? 1-Sim | 0-Não");
                int i = ler.nextInt();
                logC = i == 1;
                }
            } while (logC);
           
        }while (system);
        }  
    
    public static void main(String[] args) {
        logar.mokCliente();
        int opM;
        String s = "s";
        do {
            menu1();
            int m = ler.nextInt();
            switch(m) {
                case 1:
                    login();
                    break;
                case 2:
                    cadCliente();
                    break;
                case 3:
                    loginEmail();
                    break;
                case 0:
                    s="n";
                    break;
                default:
                    System.out.println("opção invalida, tente novamente");
                    break;
            }
        }while (s.equalsIgnoreCase("s"));
        System.out.println("Aplicação encerrada pelo usuário!");
    }
    
}
