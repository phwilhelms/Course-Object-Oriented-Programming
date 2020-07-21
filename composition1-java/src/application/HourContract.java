import java.util.Date;

public class HourContract {

	private Date date;
	private Double ValuePerHour;
	private Integer hours;

	//Contructors
	public HourContract() {
	}

	public HourContract(Date date, Double ValuePerHour, Integer hours) {
		this.date = date;
		this.ValuePerHour = ValuePerHour;
		this.hours = hours;
	}

	//Getters and Seters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return ValuePerHour;
	}
	
	public void setValuePerHour(Double ValuePerHour) {
		this.ValuePerHour = ValuePerHour;
	}

	public Integer getHours() {
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}

}
