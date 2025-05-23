package cases;
import java.util.Scanner;

public class Calculos {
    static Scanner scan = new Scanner(System.in);
    
    public static void areaTriangulo(){
        System.out.println("calculo da area do triangulo:");
        
        System.out.print("Digite o valor da base: ");
        int base = scan.nextInt();
      
        System.out.print("Digite o valor da altura: ");
        int altura = scan.nextInt();
        
        System.out.println("\nA area do triangulo e "+ (base*altura)/2 );
    }
    
    public static void areaCubo(){
        System.out.println("calculo da area do cubo");
        
        System.out.print("digite o valor da face: ");
        int face = scan.nextInt();
        
        System.out.println("A area do cubo e " + face*6);
    }
    
    public static void areaCirculo(){
        System.out.println("calculo da area do circulo, usamos pi=3.14");
        
        System.out.println("Digite o valor do raio: ");
        int raio = scan.nextInt();
        
        System.out.println("A area do circulo e de "+ (raio*raio)*3.14);
    }
    
    public static void areaRetangulo(){
        System.out.println("calculo da area do retangulo");
        
        System.out.print("Digite o valor da base: ");
        int base = scan.nextInt();
      
        System.out.print("Digite o valor da altura: ");
        int altura = scan.nextInt();
        
        System.out.println("\nA area do triangulo e "+ (base*altura)/2 );
    }
}
