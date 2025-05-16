import java.util.Scanner;

public class DesafioSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        String tipoDaConta = "Corrente";
        System.out.println("Para realizar o cadastro, digite o seu nome:");
        String nome = scanner.next();
        System.out.println("Para finalizar o seu cadastro, digite o seu saldo atual");
        double saldo = scanner.nextDouble();
        String mensagem = """
                Cadastro finalizado com sucesso!
                
                *************************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo da conta: %s
                Saldo inicial: R$ %.2f
                *************************************
                """.formatted(nome, tipoDaConta, saldo);
        System.out.println(mensagem);
        String ops = """
                Operações:
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:                
                """;
        int op = 0;
        while (op != 4) {
            System.out.println(ops);
            op = scanner.nextInt();
            if (op == 1) {
                System.out.println("Seu saldo atual é de: R$ " + saldo);
            } else if (op == 2) {
                System.out.println("Insira o valor a ser recebido:");
                valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atual agora é de: R$ " + saldo);
            } else if (op == 3) {
                System.out.println("Insira o valor a ser transferido:");
                valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Sem saldo o suficiente para realizar a operação!");
                } else {
                    saldo -= valor;
                    System.out.println("Seu saldo atual agora é de: R$ " + saldo);
                }
            } else if (op == 4) {
                System.out.println("Fechando sistema...");
            } else {
                System.out.println("Operação inválida!");
            }
        }
    }
}
