import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 2500.00;

        int opcao = 0;
        while (opcao != 4) {

            System.out.println("***********************\n" +
                    "Dados iniciais do cliente:\n" +
                    "\n" +
                    "Nome: Leonardo Arthur\n" +
                    "Tipo conta: Corrente\n" +
                    "Saldo inicial: R$ " + saldo + "\n" +
                    "***********************\n" +
                    "\n" +
                    "Operações\n" +
                    "\n" +
                    "1- Consultar saldos\n" +
                    "2- Receber valor\n" +
                    "3- Transferir valor\n" +
                    "4- Sair\n" +
                    "\n" +
                    "Digite a opção desejada:");

            Scanner ler = new Scanner(System.in);
            opcao = (int) ler.nextDouble();


            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito:");
                    double deposito = (double) ler.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.println("Digite o valor para transferir:");
                    double transferir = (double) ler.nextDouble();
                    saldo -= transferir;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Você digitou um número incorreto! Repita a operação.");
            }
        }

    }
}