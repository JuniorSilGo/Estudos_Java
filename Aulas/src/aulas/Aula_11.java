package aulas;

import java.util.Scanner;

public class Aula_11{
    
    public static void main(String[] args){
        
        double base, altura, areaRetangulo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com o valor da base: ");
        base = entrada.nextDouble();
        
        System.out.println("Entre com o valor da altura: ");
        altura = entrada.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.println("A área do retângulo vale: "+areaRetangulo);
                
    }
}