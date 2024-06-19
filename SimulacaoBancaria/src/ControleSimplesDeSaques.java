import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

             if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } 
            // Verifica se o saque ultrapassa o limite diário
            else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } 
            // Realiza o saque e atualiza o limite diário
            else {
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
