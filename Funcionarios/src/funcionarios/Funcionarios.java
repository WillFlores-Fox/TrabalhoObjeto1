package funcionarios;

public class Funcionarios {
    
    private String nome;
    private double salario;
    
    public Funcionarios(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setsalario(double salario){
        this.salario = salario;
    }
    
    public String getnome(){
        return this.nome;
    }
    public double getsalario(){
        return this.salario;
    }
    
    public void exibir(){
        System.out.println("nome: " + nome);
        System.out.println("salario: " + salario);
    }
}
