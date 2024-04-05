import java.util.Scanner;

public class MeuProjeto {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        String nome = "Anakin Skywalker";
        String tipoDaConta = "Corrente";
        double saldoConta = 300;
        boolean continuar = true;

            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.println("Dados iniciais do cliente: ");
            System.out.println("\nNome: " + nome);
            System.out.println("Tipo de conta: " + tipoDaConta);
            System.out.println("Saldo disponível: " + saldoConta);
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n\n");

        while (continuar) {
            System.out.println("\n\nOperações\n");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Tranferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite uma das opções acima: ");
            int opcao = conta.nextInt();

            if (opcao == 1) {
                System.out.println("\nO saldo em sua conta é: " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("\nDigite um valor a receber: ");
                double receber = conta.nextDouble();
                System.out.printf("\nSaldo atualizado: %.2f", saldoConta += receber);
            } else if (opcao == 3) {
                System.out.println("\nDigite um valor a transferir: ");
                double transferir = conta.nextDouble();
                if (transferir > saldoConta) {
                    System.out.println("\nSaldo insuficiente para realizar a transferência.");
                } else {
                    saldoConta -= transferir;
                    System.out.printf("\nSaldo atualizado: %.2f", saldoConta);
                }
            } else if (opcao == 4) {
                System.out.println("Até a próxima!");
                continuar = false;
            }
        }
    }
}