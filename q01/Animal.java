package Atividade_HerancaPolimorfismo.Exercicio1;

public class Animal {
    protected String nomeAnimal;

    public Animal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void fazerSom(){
        System.out.println("Som genérico de animal");
    }
}
