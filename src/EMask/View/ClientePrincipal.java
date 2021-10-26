package EMask.View;

import EMask.Controler.CCliente;
import EMask.Controler.CLembretes;
import EMask.Controler.CMask;
import EMask.Model.MCliente;
import EMask.Model.MLembretes;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class ClientePrincipal {
    
    public static CLembretes cadLembretes = new CLembretes();
    public static CMask cadMask = new CMask();
    public static Scanner ler = new Scanner(System.in);
    public static CCliente logar = new CCliente();
    static Duration duracao1;
    static Duration duracao2;
    static Duration duracao3;
    
    public static String leTexto() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
        
    }
    
    public static void menu1() {
        System.out.println("------------------");
        System.out.println("|  Tela de Login |");
        System.out.println("------------------");
        System.out.println("1 - Logar na conta");
        System.out.println("2 - Cadastrar conta");
        System.out.println("3 - Entrar com email");
        System.out.println("0 - Sair");
    }
    
    public static void menu2() {
        System.out.println("-------------------");
        System.out.println("|  Escolha um Menu |");
        System.out.println("-------------------");
        System.out.println("1 - Tela Principal");
        System.out.println("2 - Endereço");
        System.out.println("3 - Configurações");
    }
    
    public static void login() {
        boolean system = false;       
        do {
            System.out.println("-- Login --");
            System.out.println("");
            String senhaCliente;
            boolean logC;
            do {
                logC = false;
                System.out.print("Usuario(N° SUS): ");
                String susCliente = leTexto();
                if (logar.verNumeroSus(susCliente)) {
                    MCliente c;                    
                    c = logar.getByDoc(susCliente);
                    System.out.println(logar.getNomeCli(c.getIdCliente()));
                    boolean senha = false;
                    do {
                        System.out.print("\nInsira a senha: ");
                        senhaCliente = leTexto();
                        if (logar.verSenha(senhaCliente)) {
                            c = logar.getByDoc(senhaCliente);
                            System.out.println("login realizado");
                            boolean esc = false;
                            do {
                                System.out.println("-------------------");
                                System.out.println("|  Escolha um Menu |");
                                System.out.println("-------------------");
                                System.out.println("1 - Tela Principal");
                                System.out.println("2 - Endereço");
                                System.out.println("3 - Configurações");
                                System.out.println("0 - Sair");
                                int escolha = ler.nextInt();
                                if (escolha == 1) {
                                    System.out.println("Tela Principal");
                                    System.out.println("duração de exposição antes do exercicio: " + duracao1);
                                    esc = false;
                                    
                                } else {
                                    if (escolha == 2) {
                                        System.out.println("Endereço");
                                    } else {
                                        if (escolha == 3) {
                                            System.out.println("Configurações");
                                            System.out.println("1 - trocar endereço principal");
                                            System.out.println("2 - trocar cadastro");
                                            System.out.println("3 - notificações");
                                            System.out.println("4 - data e hora");
                                            System.out.println("5 - idiomas e entrada");
                                            System.out.println("0 - Sair");
                                            int op = ler.nextInt();
                                            switch (op) {
                                                case 1:
                                                    System.out.println("Troca Endereço :");
                                                    break;
                                                case 2:
                                                    boolean altera = false;
                                                    do {
                                                        System.out.println("Trocar cadastro");
                                                        System.out.println("O que deseja alterar: ");
                                                        System.out.println("1 - Nome");
                                                        System.out.println("2 - Telefone");
                                                        System.out.println("3 - Email");
                                                        System.out.println("4 - Sexo");
                                                        System.out.println("5 - Senha");
                                                        System.out.println("6 - Numero sus");
                                                        System.out.println("0 - Sair");
                                                        int al = ler.nextInt();
                                                        switch (al) {
                                                            case 1:
                                                                System.out.println("Informe seu nome: ");
                                                                c.setNomeCliente(leTexto());
                                                                altera = false;
                                                                break;
                                                            case 2:
                                                                System.out.println("Informe seu numero de telefone(com DDD): ");
                                                                c.setTelCliente(leTexto());
                                                                altera = false;
                                                                break;
                                                            case 3:
                                                                System.out.println("Informe seu email");
                                                                c.setEmailCliente(leTexto());
                                                                altera = false;
                                                                break;
                                                            case 4:
                                                                System.out.println("Informe seu sexo:");
                                                                c.setSexoCliente(leTexto());
                                                                altera = false;
                                                                break;
                                                            case 5:
                                                                boolean senhaNova = false;
                                                               
                                                                    System.out.println("Informe sua senha atual:");
                                                                    senhaCliente = leTexto();
                                                                    if (logar.verSenha(senhaCliente)) {
                                                                        c = logar.getByDoc(senhaCliente);
                                                                        System.out.println("Insira sua nova senha: ");
                                                                        c.setSenhaCliente(leTexto());
                                                                    } else {
                                                                        System.out.println("senha inválida");;
                                                                    }
                                                               
                                                                altera = false;
                                                                break;
                                                            case 6:
                                                                System.out.println("Informe seu numero Sus: ");
                                                                c.setSusCliente(leTexto());
                                                                altera = false;
                                                                break;
                                                            case 0:
                                                                break;
                                                            default:
                                                                System.out.println("Opção inválida, tente novamente!");
                                                        }
                                                    } while (altera);
                                                    break;
                                                case 3:
                                                    System.out.println("Notificações");
                                                    break;
                                                case 4:
                                                    System.out.println("Data e Hora");
                                                    break;
                                                case 5:
                                                    System.out.println("Idiomas e Entrada");
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opção invalida, tente novamente");
                                                    break;                                             
                                            }
                                            
                                        } else {
                                            if (escolha == 0) {
                                                esc = true;
                                            } else {
                                                System.out.println("Opção imvalida");
                                            }
                                        }
                                    }
                                }
                            } while (!esc);
                        } else {
                            System.out.println("senha inválido");;
                            System.out.print("Deseja tentar novamente? 1-Sim | 0-Não: ");
                            int i = ler.nextInt();
                            logC = i == 1;
                        }
                    } while (senha);
                } else {
                    System.out.println("Numero sus inválido");;
                    System.out.print("Deseja tentar novamente? 1-Sim | 0-Não :");
                    int i = ler.nextInt();
                    logC = i == 1;
                }
            } while (logC);
            
        } while (system);
    }
    
    public static void cadCliente() {
        boolean system = false;
        do {
            
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
            do {
                System.out.println("informe seu numero do cartão sus: ");
                susCliente = leTexto();
                if (susCliente.length() != 15) {
                    testaSusCliente = true;
                    System.out.println("Numero Sus incorreto, tente novamente!");
                } else {
                    testaSusCliente = logar.verNumeroSus(susCliente);
                }
            } while (testaSusCliente);
            boolean testaCPF = false;
            do {
                System.out.println("Informe seu cpf :");
                cpf = leTexto();
                if (cpf.length() != 11) {
                    testaCPF = true;
                    System.out.println("CPF incorreto, tente novamente!: ");
                } else {
                    testaCPF = logar.verCPF(cpf);
                }
            } while (testaCPF);
            System.out.println("Informe sua idade: ");
            idadeCliente = ler.nextInt();
            System.out.print("Informe o endereço: ");
            enderecoCliente = leTexto();
            System.out.print("Informe o email: ");
            emailCliente = leTexto();
            System.out.println("Informe seu sexo: ");
            sexoCliente = leTexto();
            boolean testaSenha = false;
            do {
                System.out.println("Crie sua senha: ");
                senhaCliente = leTexto();
                if (senhaCliente.length() < 5) {
                    testaSenha = true;
                    System.out.println("Senha muito fraca!");
                } else {
                    testaSenha = logar.verSenha(senhaCliente);
                }
            } while (testaSenha);
            
            boolean testaTel;
            do {
                testaTel = false;
                System.out.println("Informe seu numero de telefone(com DDD): ");
                telCliente = leTexto();
                if (telCliente.length() != 10 && telCliente.length() != 11) {
                    testaTel = true;
                    System.out.println("Telefone informado esta incorreto");
                }
                System.out.print("Informe seu idioma: ");
                idiomaCliente = leTexto();
            } while (testaTel);
            
            idCliente = logar.gerarId();
            MCliente c = new MCliente(idCliente, nomeCliente, cpf, idadeCliente, enderecoCliente, telCliente, idiomaCliente, emailCliente, sexoCliente, senhaCliente, susCliente);
            logar.add(c);
        } while (system);
    }
    
    public static void loginEmail() {
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
                    c = logar.selecionaEmail(emailCliente);
                    System.out.println(logar.getNomeCli(c.getIdCliente()));
                    boolean senha = false;
                    do {
                        System.out.print("coloque a senha: ");
                        senhaCliente = leTexto();
                        if (logar.verSenha(senhaCliente)) {
                            c = logar.getByDoc(senhaCliente);
                            System.out.println("login realizado");
                            System.out.println("");
                        } else {
                            System.out.println("senha inválida");;
                            System.out.print("Deseja tentar novamente? 1-Sim | 0-Não: ");
                            int i = ler.nextInt();
                            logC = i == 1;
                        }
                    } while (senha);
                } else {
                    System.out.println(" email inválido");
                    System.out.print("Deseja tentar novamente? 1-Sim | 0-Não: ");
                    int i = ler.nextInt();
                    logC = i == 1;
                }
            } while (logC);
            
        } while (system);
    }
    
    public static void main(String[] args) {
        logar.mokCliente();
        int opM;
        String s = "s";
        do {
            menu1();
            int m = ler.nextInt();
            switch (m) {
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
                    s = "n";
                    break;
                default:
                    System.out.println("opção invalida, tente novamente");
                    break;
            }
        } while (s.equalsIgnoreCase("s"));
        System.out.println("Aplicação encerrada pelo usuário!");
    }
    
    public static void duracaoPreExerc(int idLembrete) {
        LocalTime inicio = cadLembretes.getHExposInicial(idLembrete);
        LocalTime fim = cadLembretes.getHExercInicial(idLembrete);
        Duration duracao1 = Duration.between(inicio, fim);
        int horas = (int) duracao1.toHours(); //Duração de exposição antes do exercício
    }
    
    public static void duracaoExerc(int idLembrete) {
        
        LocalTime inicio = cadLembretes.getHExercInicial(idLembrete);
        LocalTime fim = cadLembretes.getHExercFinal(idLembrete);
        Duration duracao2 = Duration.between(inicio, fim);
        int horas = (int) duracao2.toHours(); //Duração de exposição durante exercícios
    }
    
    public static void duracaoPosExerc(int idLembrete) {
        
        LocalTime inicio = cadLembretes.getHExercFinal(idLembrete);
        LocalTime fim = cadLembretes.getHExposFinal(idLembrete);
        Duration duracao3 = Duration.between(inicio, fim);
        int horas = (int) duracao3.toHours(); //Duração de exposição após exercícios
    }
    
    public static void duracaoMask(int idMask) {
        int tempoMask = cadMask.getHoraMask1(idMask);
    }
}
