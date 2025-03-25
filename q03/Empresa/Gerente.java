package q03.Empresa;

public class Gerente extends Fucionario {
    private Double bonus;

    public Gerente(String nome, Double salarioBase, Double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    @Override
    public Double calcularSalario() {
        return this.getSalarioBase() + this.getBonus();
    }
}
