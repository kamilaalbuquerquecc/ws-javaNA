package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;


/*Ler os dados de um pedido com N itens (N fornecido pelo usu�rio). Depois, mostrar um
sum�rio do pedido conforme exemplo (pr�xima p�gina). Nota: o instante do pedido deve ser
o instante do sistema: new Date()
*/
public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Client client;
		
		System.out.print("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		//String dt =sdf.format(date);
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i =0; i<n; i++) {
			System.out.print("Product name: ");
			String nameProd = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quant = sc.nextInt();
		}
		System.out.println("ORDER SUMMARY:");
		

	}

}
