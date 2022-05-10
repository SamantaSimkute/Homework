package inheritance;

public class Doctor extends Worker {

	public Doctor(String fullName, int age, double salary) {
		super(fullName, age, salary);

	}

	@Override
	public void toWork() {
		System.out.println("2 days working, 2 days off as a doctor");
	}

	@Override
	public void rateDuringTheHolidays() {
		System.out.println("Rate during the holidays is 4x bigger");
	}

	@Override
	public String toString() {
		return "Doctor [toString()=" + super.toString() + "]";
	}

}
