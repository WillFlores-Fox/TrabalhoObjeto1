package pessoas;

public class Pessoas {
    protected int idade; 
    
    public Pessoas(int idade){
        this.idade = idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void exibirIdade() {
        System.out.println("Idade: " + idade);
    }

}

