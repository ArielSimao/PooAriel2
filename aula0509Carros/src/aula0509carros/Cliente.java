
package aula0509carros;


public class Cliente {
   
    private int idCliente;
    private String nome;
    private String cidade;
    private String estado;
    private double limite;

    //Construtor 1
    public Cliente(){
        this.cidade = "Mogi Mirim";
        this.estado = "SP";
    }
    
   //Construtor 2
    public Cliente(double limite){
        this();
        this.limite = limite;
    }
    
    
    
    
    //Metodos Get e Set
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder textao = new StringBuilder();
        textao.append("ID Cliente:").append(idCliente).append("\n");
        textao.append("Nome:").append(nome).append("\n");
        textao.append("Cidade:").append(cidade).append("\n");
        textao.append("Estado:").append(estado).append("\n");
        textao.append("Limite:").append(limite).append("\n");
        return textao.toString();
    }
    
}
