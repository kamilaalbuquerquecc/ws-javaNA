package Aula95;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aula95{

	public static void main(String[] args) {
	
		//lista de numeros inteiros
		//basico..
		//List<Integer> list;
		// Não posso instanciar List<>(),  pois é interface
		//List<Integer> list = new List<>();
		///usa classe que implementa interface

		List<String> list = new ArrayList<>();

		list.add("Alex");
		list.add("Maria");
		list.add("Ana");
		list.add("Joao");
		list.add(2,"Marcos"); // adicionar em posiçao 2 sem prejudicar lista
		list.add("Kamila");
		list.add("Karina");
		System.out.println(list.size()+" elements");
		
		//FOR EACH
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------");
		
		list.remove("Maria");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'K'); //remove por predicado , funçao lambda
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		//encontrar posição de um elemento
		System.out.println("Nomes e posicoes");
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		System.out.println("Index of Paulo: " + list.indexOf("Paulo"));
	
		//deixar na lista soemnte quem começa com A
		System.out.println("Nomes com A");
		//stream() aceita operaçoes com expressoes lambda
		//filter() filtra de acordo com o predicado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println(result);
		
		//encontrar eleemento da lista 1* elemento com letra A , se n tiver, retorna null
		System.out.println("1* elemento com letra A");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
