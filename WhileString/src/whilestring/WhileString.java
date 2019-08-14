
package whilestring;

import java.util.Scanner;


public class WhileString {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int soma = 0; 
        int maiorValor =0; 
        int entrada = 0;
        int menorValor = 0;
        int i = 0;
        String aux = "";
        
        while (true) /*(i < 15)*/ {
            System.out.println ("Informe o valor do produto");
            
            aux = leia.next();
            
            if (aux.equals("sair")){
                System.out.println("Operação finalizada.");
                break; 
            }  
            
            entrada = Integer.parseInt(aux);
            
            if (entrada > maiorValor | i == 0){
            maiorValor = entrada;
            }
            
            if (entrada < menorValor | i == 0) {
                menorValor = entrada;
            } 
            soma += entrada;
            i++;
        }
        System.out.println ("O menor valor é: "+menorValor);
        System.out.println ("O maior valor é: "+maiorValor);
        System.out.println("A média é: "+(soma/i));
    }
    
}
