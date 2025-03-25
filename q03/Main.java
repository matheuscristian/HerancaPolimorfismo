package q03;

import q03.Empresa.*;;

public class Main {
    public static void main(String[] args) {
        Fucionario fucionario = new Fucionario("José", 1500d);
        Gerente gerente = new Gerente("Amanda", 1750d, 240d);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Cristian", 1000000d);

        System.out.println(fucionario.calcularSalario());
        System.out.println(gerente.calcularSalario());
        System.out.println(desenvolvedor.calcularSalario());
    }
}
