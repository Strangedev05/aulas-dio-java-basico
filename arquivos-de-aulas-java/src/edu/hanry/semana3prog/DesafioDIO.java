package edu.hanry.semana3prog;

import java.util.Scanner;

public class DesafioDIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Digite o valor para depositar: ");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.println("Saldo atual: R$ " + saldo);
                } else {
                    System.out.println("Valor de depósito inválido.");
                }
                break;
            case 2:
                System.out.println("Digite o valor para sacar: ");
                double saque = scanner.nextDouble();
                if (saque > 0 && saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
                } else {
                    System.out.println("Valor de saque inválido.");
                }
                break;
            case 3: 
                System.out.println("Saldo atual: R$ " + saldo);
                break;
            case 0:
                System.out.println("Encerrar o programa.");
                scanner.close();
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}