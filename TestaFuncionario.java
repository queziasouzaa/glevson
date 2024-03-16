import java.util.Date;

class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataDeEntrada;
    String rg;

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataDeEntrada);
        System.out.println("RG: " + this.rg);
    }
}

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Hugo";
        f1.departamento = "TI";
        f1.salario = 1000.0;
        f1.dataDeEntrada = "01/01/2020";
        f1.rg = "123456789";

        f1.recebeAumento(500.0);

        System.out.println("Salário atual: " + f1.salario);
        System.out.println("Ganho anual: " + f1.calculaGanhoAnual());

        System.out.println("\nMostrando detalhes do funcionário:");
        f1.mostra();

        // Construindo dois funcionários e comparando-os com ==
        Funcionario f2 = new Funcionario();
        f2.nome = "Danilo";
        f2.departamento = "RH";
        f2.salario = 1500.0;
        f2.dataDeEntrada = "01/01/2019";
        f2.rg = "987654321";

        System.out.println("\nComparando dois funcionários com ==:");
        if (f1 == f2) {
            System.out.println("Funcionários iguais");
        } else {
            System.out.println("Funcionários diferentes");
        }

        // Criando duas referências para o mesmo funcionário e comparando-os com ==
        Funcionario f3 = f1;
        System.out.println("\nComparando duas referências para o mesmo funcionário com ==:");
        if (f1 == f3) {
            System.out.println("Referências para o mesmo funcionário");
        } else {
            System.out.println("Referências para funcionários diferentes");
        }
    }
}
