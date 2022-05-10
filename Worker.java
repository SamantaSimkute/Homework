package inheritance;

public class Worker {

	private String fullName;
	private int age;
	private double salary;

	public Worker(String fullName, int age, double salary) {
		this.fullName = fullName;
		this.age = age;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void toWork() {
		System.out.println("Working...");
	}

	public void rateDuringTheHolidays() {
		System.out.println("The rate is 2x bigger");
	}

	@Override
	public String toString() {
		return "Worker [fullName=" + fullName + ", age=" + age + ", salary=" + salary + "]";
	}

}
