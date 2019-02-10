package entities;

	public class Employee {

		public String name;
		public double grossSalary;
		public double tax;
		public double percentage;

		public double netSalary(){
			return (grossSalary - tax)+increaseSalary();
		}

		public double increaseSalary(){
			return (grossSalary/100)*percentage;
		}

		public String toString(){
			return name
				+", $ "
				+String.format("%.2f", netSalary());
		}
	}
