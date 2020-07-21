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

}
