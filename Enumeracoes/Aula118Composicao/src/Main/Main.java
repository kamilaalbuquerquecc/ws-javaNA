package Main;

import java.util.Scanner;

import entities.Worker;
import entities.enums.WorkerLevel;



/** Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).
 * @author Kamila(estudos)
 */
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		WorkerLevel level;
		Worker worker;
		
		System.out.print("Enter department's name:");
		String departament = ler.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name:");
		String name = ler.nextLine();
		System.out.print("Level:");
		level = WorkerLevel.valueOf(ler.next());//pegar string
		System.out.print("Base salary:");
		Double baseSalary = ler.nextDouble();
		//Quantos contratos para este trabalhador?
		System.out.print("How many contracts to this worker?");
		int n = ler.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter contract #"+ i + " data:");
			System.out.print("Date (DD/MM/YYYY):");
			Date date = 
			System.out.print("Value per hour:");
			System.out.print("Duration (hours):");
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		
		System.out.print("Name:");
		System.out.print("Department:");
		System.out.print("Income for ");//renda

	}

}
