package cases;
import java.util.Scanner;


public class Cases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("""
                           calculos de area disponiveis:
                           [0] = triangulo
                           [1] = retangulo
                           [2] = cubo
                           [3] = circulo""");
        System.out.print("escolha o calculo: ");
        int choice = scan.nextInt();
        
        System.out.println("");
        switch(choice){
            case 0 -> Calculos.areaTriangulo();
            case 1 -> Calculos.areaRetangulo();
            case 2 -> Calculos.areaCubo();
            case 3 -> Calculos.areaCirculo();
                
            default -> System.out.println("escolha invalida ):");
        }
        
        System.out.println("\n Obrigado por usar o programa (; ");
    }
}
