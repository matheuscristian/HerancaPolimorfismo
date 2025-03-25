package Atividade_HerancaPolimorfismo.Exercicio1;

public class Cachorro extends Animal {
    public Cachorro(String nomeAnimal) {
        super(nomeAnimal);
    }
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
