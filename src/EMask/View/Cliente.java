package EMask.View;

import java.util.Scanner;

public class Cliente {
    public static Scanner ler = new Scanner(System.in);
    
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
    
    
    public static void main(String[] args) {
        
        
    }
    
}
