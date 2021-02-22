package Main;

import java.util.Scanner;

import entities.Worker;
import entities.enums.WorkerLevel;



/** Ler os dados de um trabalhador com N contratos (N fornecido pelo usu�rio). Depois, solicitar
do usu�rio um m�s e mostrar qual foi o sal�rio do funcion�rio nesse m�s, conforme exemplo
(pr�xima p�gina).
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
		worker.setBaseSalary(ler.nextDouble());
		//Quantos contratos para este trabalhador?
		System.out.print("How many contracts to this worker?");
		
		
		System.out.print("Enter contract #1 data:");
		System.out.print("Date (DD/MM/YYYY):");
		System.out.print("Value per hour:");
		System.out.print("Duration (hours):");
		
		
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		
		System.out.print("Name:");
		System.out.print("Department:");
		System.out.print("Income for ");//renda

	}

}
