import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        System.out.println("A soma de " + num1 + " com " + num2 + " é: " + soma);
        
        int sub = num1 - num2;
        System.out.println("A subtração de " + num1 + " com " + num2 + " é: " + sub);
        
        int mult = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " com " + num2 + " é: " + mult);
        
        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + div);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        
        scanner.close();
    }
}