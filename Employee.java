package Constructor;

public class Employee {
	int empId;
	String empName;
	String department;
	float salary;
	String Address;
	
	public Employee(){
		
		empId=1;
		empName="Emp01";
		department="Devlopment";
		salary=35000;
		Address= "Prayagraj";
		
	}
	
	public Employee(int empId, String empname, String department, float salary, String Address) {
		
		this.empId= empId;
		this.empName=empname;
		this.department=department;
		this.salary=salary;
		this.Address=Address;
		
	}
	 public void display(){
		 System.out.println("Id: "+empId);
			System.out.println("Name: "+empName);
			System.out.println("Department: "+department);
			System.out.println("Salary: "+salary);
			System.out.println("Address: "+Address);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Employee e1 = new Employee(101,"Gaurav", "Dev",35000, "Praygaraj");
		Employee e2 = new Employee(102, "Aayushi", "Dev", 63000, "Delhi");
		
		e.display();
		
		e1.display();
		e2.display();
		

	}

}
