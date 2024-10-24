/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */
package src.exercicioscurso;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int idFuncionario, horasTrabalhadas;
        double valorHora, salario;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a ID do funcionário: ");
            idFuncionario = sc.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            horasTrabalhadas = sc.nextInt();

            System.out.print("Digite o valor que recebe por hora: ");
            valorHora = sc.nextDouble();

            salario = horasTrabalhadas * valorHora;

            System.out.println("NUMBER = " + idFuncionario);
            System.out.printf("SALARY = U$ %.2f", salario);

        }

    }

}