
package revisaoexercicio1;


public class Funcionario {
    
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public String dataContratacao;
    public double salario;
    public String documento;
    public boolean ativo;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    public void atualizarSalario(double aumento){
        salario += aumento;
        System.out.println("Salario Atualizado");
    }
    
    
    public void demiteFuncionario(){
    
        ativo=false;
        
    }
    
    
    public void imprimir(){
        
        System.out.println("Dados do Funcionário");
        System.out.println("ID: "+ idFunc);
        System.out.println("Nome: " + nomeFunc);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data Contratacao: " + dataContratacao);
        System.out.println("Salario: " + salario);
        System.out.println("Documento: " + documento);
        
        if(ativo){
            System.out.println("Funcionário Ativo");
        }else{
            System.out.println("Funcionário Inativo");
        }
    }
    
    
}
