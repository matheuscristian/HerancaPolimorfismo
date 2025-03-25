package q03.Empresa;

public class Fucionario {
    private String nome;
    private Double salarioBase;

    public Fucionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double calcularSalario() {
        return this.salarioBase;
    }
}
