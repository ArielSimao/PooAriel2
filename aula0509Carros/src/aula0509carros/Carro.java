
package aula0509carros;

import java.util.Random;

public class Carro {
 
    //Atributos
    private int idCarro;
    private String marca;
    private String modelo;
    private int ano;
    
    
    //Definir Metodos Getters and Setters
    
    //Getters
    public int getIdCarro(){
        return idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
   
    
    //Definir Construtor Personalizado
    public Carro( int idCarro, String marca, String modelo, int ano ){
    
        this.idCarro = idCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    
    //Segundo Construtor
    public Carro(){
        Random r = new Random();
        this.idCarro = r.nextInt(10000)+1;
        this.marca = "";
        this.modelo="";
        this.ano= 1981;      
    }
    
   
    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("Id do Carro: ").append(idCarro).append("\n");
        texto.append("Marca: ").append(marca).append("\n");
        texto.append("Modelo: ").append(modelo).append("\n");
        texto.append("Ano: ").append(ano).append("\n");
      
        return texto.toString();
    }
   
  
}
