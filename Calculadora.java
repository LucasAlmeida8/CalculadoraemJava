import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiroNumero, segundoNumero, resultado;
        char operacao;

        System.out.println("Digite o primeiro número:");
        primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        segundoNumero = scanner.nextDouble();

        System.out.println("Escolha a operação: +, -, * ou /");
        operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = primeiroNumero + segundoNumero;
                System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultado);
                break;
            case '-':
                resultado = primeiroNumero - segundoNumero;
                System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultado);
                break;
            case '*':
                resultado = primeiroNumero * segundoNumero;
                System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultado);
                break;
            case '/':
                resultado = primeiroNumero / segundoNumero;
                System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
