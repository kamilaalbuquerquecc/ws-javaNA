package Aula96;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Empregado empregado;
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.println("Quantos empregados: ");
		int n;
		n=ler.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("#"+ (i+1));
			System.out.println("ID: ");
			int id=ler.nextInt();
			System.out.println("Nome: ");
			ler.nextLine(); //limpar buffer
			String nome= ler.nextLine();
			System.out.println("Salario: ");
			double sal = ler.nextDouble();
			empregado = new Empregado(id,nome, sal);
			list.add(empregado);
		}
		System.out.println("Aumentar salario de empregado:");
		int idAux = ler.nextInt();
		
		int pos = posicao(list, idAux);
		if (pos==-1) {
			System.out.println("Não esxiste");
		}
		else {
			System.out.println("Porcentagem:");
			double porc = ler.nextDouble();
			list.get(pos).aumentoSalario(porc);
		}
		/*Empregado emp = list.stream().filter(x -> x.getId() == idAux).findFirst().orElse(null);
		if (emp==null) {
			System.out.println("Empregado inexistente");
		}
		else {
			System.out.println("Porcentagem:");
			double porc = ler.nextDouble();
			emp.aumentoSalario(porc);
		}*/
		
		//System.out.println(emp.getId() +", "+ emp.getNome() +", "+ emp.getSalario());
		
		for (Empregado x : list) {
			System.out.println(x.getId() +", "+ x.getNome() +", "+ x.getSalario());
		}
	}
	//funçao para procurar elemento na lista,
	//retorna a posiçao do elemento
	public static int posicao (List<Empregado> list , int id) {
		for (int i = 0 ; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1; //se usar integer retorn null
	}

}
