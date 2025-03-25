package q03.Empresa;

public class Desenvolvedor extends Fucionario {
    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return this.getSalarioBase() + (this.getSalarioBase() * 0.1);
    }
}
