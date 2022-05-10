package inheritance;

public class Programmer extends Worker {

	private String level;

	public Programmer(String fullName, int age, double salary, String level) {
		super(fullName, age, salary);
		this.level = level;
	}

	@Override
	public void toWork() {
		System.out.println("I am working on my own shedule as programmer");
	}

	@Override
	public void rateDuringTheHolidays() {
		super.rateDuringTheHolidays();
	}

	@Override
	public String toString() {
		return "Programmer [level=" + level + ", toString()=" + super.toString() + "]";
	}

	
	}

