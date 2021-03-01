package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsoursedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.ENGLISH);
		
		/*Employee e = new Employee("Kamila", 10, 5.0);
		Employee oe = new OutsoursedEmployee("Sabrina", 10, 5.0);
		System.out.println(e.payment());
		System.out.println(oe.payment());*/
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		Integer n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #"+ i +" data:");
			System.out.print("Outsourced (y/n)? ");
			char yn = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHours = sc.nextDouble();
			
			if(yn=='y') {
				System.out.print("Additional charge:");
				Double additionalCharge = sc.nextDouble();
				
				Employee outsoursedEmployee;
				
				outsoursedEmployee = new OutsoursedEmployee(name, hours, valuePerHours,additionalCharge);
				list.add(outsoursedEmployee);
				
			} else {
				//outro modo que não precisa gerar uma variavel pra empregado
				list.add(new Employee(name, hours, valuePerHours));
			}
			
		}
		System.out.println("\nPAYMENTS:");
		for(Employee e: list) {
			System.out.println(e.getName() + " - "+ "$ "+e.payment());
		
		}
		

	}

}
