package operadoeslogicos;
import java.util.Scanner;

public class OperadoesLogicos {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        System.out.println("Quais dos trabalhos deseja ver?");
        System.out.println("""
                           [0] - logica de saldo
                           [1] - logica de energia
                           [2] - logica de cadastro
                           """);
        System.out.print("sua escolha: ");
        int choice = scan.nextInt();
        
        System.out.println("");
        switch(choice){
            case 0 -> OperadoesLogicos.logicaSaldo();
            case 1 -> OperadoesLogicos.logicaEnergia();
            case 2 -> OperadoesLogicos.logicaCadastro();
            default -> System.out.println("Escolha invalida");
        }
        
        System.out.println("\n Obrigado por usar o programa (; ");
    }
    
    public static void logicaSaldo(){
        System.out.print("digite seu saldo: ");
        int saldo = scan.nextInt();
        
        if (saldo<=5){
            System.out.println("saldo insuficiente");
        }
        else if (5 < saldo && saldo <=8){
            System.out.println("saldo bom");
        }
        else{
            System.out.println("saldo exelente");
        }
    }
    
    public static void logicaEnergia(){
        System.out.print("digite sua energia: ");
        int energia = scan.nextInt();
        
        if (energia <= 50){
            System.out.println("energia baixa");
        }
        else if (energia > 50 && energia <= 70){
            System.out.println("energia media");
        }
        else{
            System.out.println("energia alta");
        }
    }
    
    public static void logicaCadastro(){
        System.out.print("digite seu nome: ");
        String nome = scan.next();
        
        System.out.print("digite sua idade: ");
        int idade = scan.nextInt();
        
        System.out.print("digite seu sexo: ");
        String sexo = scan.next();
        
        String status = "jovem";
        if (idade>=18 && idade <70){
            status="adulto";
        }
        if (idade>70){
            status = "idoso";
        }
        
        System.out.println("\nseu nome e "+nome);
        System.out.println("seu sexo e "+sexo);
        System.out.println("como sua idade e "+idade+" entao voce e "+status);
        
    }
    
}
