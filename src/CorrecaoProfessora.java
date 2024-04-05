import java.util.Scanner;

public class CorrecaoProfessora {
    public static void main(String[] args) {

        String nome = "Anakin Skywalker";
        String tipoDaConta = "Corrente";
        double saldoConta = 891;
        boolean continuar = true;
        int opcao = 0;

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoDaConta);
        System.out.println("Saldo disponível: " + saldoConta);
        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n\n");

        String menu = """
                ** Digite sua opção **
                
                1 - Consultar saldo.
                2 - Transferir valor.
                3 - Receber valor.
                4 - Sair.
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nO saldo atualizado é: " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("\nQual valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldoConta) {
                    System.out.println("\nNão há saldo para realizar a transferência.");
                } else {
                    saldoConta -= valor;
                    System.out.println("\nNovo saldo: " + saldoConta);
                }
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldoConta += valor;
                System.out.println("\nNovo saldo: " + saldoConta);
            } else if (opcao != 4) {
                System.out.println("\nOpção inválida.");
            }
        }
    }
}