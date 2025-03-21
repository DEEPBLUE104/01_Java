package home.at.work.Inheritance.model.dto2;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String information() {
		return super.information() + String.format(" / 급여 : %d / 부서 : %s", salary, dept);
	}
	
	
}
