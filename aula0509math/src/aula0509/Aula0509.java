
package aula0509;


import java.util.Scanner;




public class Aula0509 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o Valor do Raio");
        double raio = Double.parseDouble(sc.nextLine());
        Esfera esf = new Esfera();
        esf.setRaio(raio);
        System.out.println("Area é: "+esf.calcularArea());
        
    }
    
}
