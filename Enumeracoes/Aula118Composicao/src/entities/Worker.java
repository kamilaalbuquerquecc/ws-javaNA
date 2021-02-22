package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	
	//composi��es de objetos
	private Departament departament;
	private List<HourContract> contracts=new ArrayList<>();
	
	private Worker() {
		
	}

	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}


	public void addContract (HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(Integer year, Integer month) {
		double sum = baseSalary; //salario base do mes
		Calendar cal = Calendar.getInstance();
		//buscar valoes dos contratos do m�s pra acrescentar ao salario.
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year=cal.get(Calendar.YEAR);
			int c_month=cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				sum+= c.totalValue();
			}
		}
		return sum ;
		 
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Departament getDepartament() {
		return departament;
	}


	public void setDepartament(Departament departament) {
		this.departament = departament;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}
	//setContracts nao pode existir pois nao posso mudar a lista
}
