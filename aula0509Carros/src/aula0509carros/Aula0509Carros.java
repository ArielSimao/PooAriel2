
package aula0509carros;


public class Aula0509Carros {

   
    public static void main(String[] args) {
        
        int idCarro = 1;
        String modelo = "Uno";
        String marca = "Fiat";
        int ano = 1999;
        
        
        
        Carro carro = new Carro(idCarro, marca, modelo, ano);
        System.out.println(carro.toString()); 
       
        System.out.println("-----"); 
        Carro carro2 = new Carro();
        
        carro2.setMarca("Fiat");
        carro2.setModelo("Palio");
        System.out.println(carro2.toString());
        
        
        Cliente cli = new Cliente();
        System.out.println("");
        
        
        System.out.println(cli.toString());
        System.out.println("");
        
   
    }
    
}
