package inheritance;

import java.util.ArrayList;
import java.util.List;

public class WorkerMain {
	public static void main(String[] args) {

		System.out.println("The information about a doctor: ");
		Doctor doctor = new Doctor("Tomas", 25, 1500);
		doctor.toWork();
		System.out.println(doctor);
		doctor.rateDuringTheHolidays();

		System.out.println();
		System.out.println("The information about a programmer: ");
		Programmer programmer = new Programmer("Ponas Tadas", 40, 1850.50, "Junior");
		programmer.toWork();
		System.out.println(programmer);
		programmer.rateDuringTheHolidays();

		System.out.println();
		List<Worker> workers = new ArrayList<Worker>();
		workers.add(programmer);
		workers.add(doctor);

		for (Worker worker : workers) {
			System.out.println(worker);
			worker.toWork();
			System.out.println("salary is " + worker.getSalary());
		}

	}

}
