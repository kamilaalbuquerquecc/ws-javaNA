package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;



/** Ler os dados de um trabalhador com N contratos (N fornecido pelo usu�rio). Depois, solicitar
do usu�rio um m�s e mostrar qual foi o sal�rio do funcion�rio nesse m�s, conforme exemplo
(pr�xima p�gina).
 * @author Kamila(estudos)
 */
public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		//converte para inteiro os digitos que pegar
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); //recorta a string  e peha os dois primeiros digitos MM
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}
/*public class Main {

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
*/