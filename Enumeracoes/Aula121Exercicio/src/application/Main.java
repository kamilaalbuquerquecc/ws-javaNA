package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()
*/
public class Main {

	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
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
		sc.nextLine();
		
		client = new Client(name, email, date);
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i =0; i<n; i++) {
			System.out.print("Product name: ");
			String nameProd = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			
			Product product = new Product(nameProd, price);
			
			System.out.print("Quantity: ");
			int quant = sc.nextInt();
			
			OrderItem item = new OrderItem(quant,price,product);
			
			order.addItem(item);
		}
		
		System.out.println(order);
		
		

	}

}/*
kamila
kamila@eu
09/01/1998
PROCESSING
2
TV
1000
1
mouse
40
2
*/