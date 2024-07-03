package Desafios.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero = 1021;
        String Agencia;
        String NomeCliente;
        Float Saldo = 238.48f;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por Favor, digite o numero da agencia: ");
        Agencia = scanner.nextLine();

        System.out.println("Por Favor, digite o seu nome completo: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +
         ", conta " + numero + ", e seu saldo " + Saldo + " já está disponível para saque.");

         scanner.close();
    }
    
}