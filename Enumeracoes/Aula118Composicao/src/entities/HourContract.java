package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHor;
	private Integer hours;
	
	public HourContract(){
		
	}
	
	public HourContract(Date date, Double valueHor, Integer hours) {
		super();
		this.date = date;
		this.valuePerHor = valueHor;
		this.hours = hours;
	}

	public Double totalValue() {
		return valuePerHor*hours;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHor() {
		return valuePerHor;
	}

	public void setValuePerHor(Double valuePerHor) {
		this.valuePerHor = valuePerHor;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	

}
