/*ROLLNUMBER:19R21A0433
Developing employee details Application*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;


class Employee {
	
	private int id;
	private String name;
	private long mobilenumber;;
	private String email;
	private String gender;
	private String address;
           private double salary;
           private String DOB;
           private String DOJ;;
	public int getId()
      {
        return id;
      }

    public String getName() 
     {
        return name;
     }

    public long getMobilenumber() 
    {
        return mobilenumber;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getGender() 
    {
        return gender;
    }

    public String getAddress()
    {
        return address;
    }

 public double getSalary() 
    {
        return salary;
    }

    public String getDob() 
    {
        return DOB;
    }

    public String getDoj()
    {
        return DOJ;
    }

       public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setMobilenumber(long mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setDob(String DOB)
    {
        this.DOB = DOB;
    }

    public void setDoj(String DOJ)
    {
        this.DOJ = DOJ;
    }
	public String toString() {
		return "Employee [id="+ id +", name=" + name + ",mobilenumber =" + mobilenumber + ", email=" + email
				+ ", gender=" + gender + ", address=" + address + ", salary=" + salary + ", DOB=" + DOB + ", DOJ=" + DOJ + " “+ "]";
	}
	public Employee(int id, String name, long mobilenumber, String email, String gender, String address, double salary, String DOB, String DOJ) {
        this.id = id;
        this.name = name;
        this.mobilenumber = mobilenumber;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.salary = salary;
        this.DOB = DOB;
        this.DOJ = DOJ;
	}
}
 class EmployeeDetails {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(101, "sriya", 779482276, "sriya@gmail.com", "female", "hyderabad", 28000.0, "27/08/2002", "23/8/2022");
	Employee emp2=new Employee(102, "reema", 778976999, "reema@gmail.com","female", "hyderabad", 48000.0, "24/08/1998", "23/6/2022");
	Employee emp3=new Employee(103, "dinnu", 779098999, "dinnu@gmail.com","male", "Delhi", 80000.0, "12/09/1997", "3/03/2021");
	Employee emp4=new Employee(104, "Aditi", 779087909, "Aditi@gmail.com", "female", "pune",  90000.0, "12/09/1996", "3/03/2020");
	Scanner sc=new Scanner(System.in);
	boolean flag=false;
	int id;
	 String name;
	 long mobilenumber;
	 String email;
 String gender;
	 String address;
            double salary;
            String DOB;
            String DOJ;
           String experience;
	public EmployeeDetails() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}
	public void viewallemployees() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	public void viewemployee(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Employee with this id is not present");
		}
	}
	public void updatemployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean flag=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
                          System.out.println("Enter mobilenumber: ");
                          mobilenumber=sc.nextLong();
				System.out.println("Enter email: ");
				email=sc.next();
				System.out.println("Enter gender: ");
				gender=sc.next();
				System.out.println("Enter address: ");
				address=sc.next();
				System.out.println("Enter new Salary");
salary=sc.nextDouble();
				System.out.println("Enter DOB: ");
				DOB=sc.next();
                                               System.out.println("Enter DOJ: ");
				DOJ=sc.next();
				emp.setName(name);
				emp.setMobilenumber(mobilenumber);
				emp.setEmail(email);
				emp.setGender(Gender);
				emp.setAddress(address);
                                                emp.setSalary(salary);
				emp.setDob(DOB);
				emp.setDoj(DOJ);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	public void deletemployee() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean flag=false;
	      Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	public void addemployee() {
		             System.out.println("Enter name: ");
				name=sc.next();
                          System.out.println("Enter mobilenumber: ");
    mobilenumber=sc.nextLong();
				System.out.println("Enter email: ");
				email=sc.next();
				System.out.println("Enter gender: ");
				gender=sc.next();
				System.out.println("Enter address: ");
				address=sc.next();
				System.out.println("Enter new Salary");
				salary=sc.nextDouble();
				System.out.println("Enter DOB: ");
				DOB=sc.next();
                                               System.out.println("Enter DOJ: ");
				DOJ=sc.next();
		Employee emp=new Employee(id, name, mobilenumber, email, gender, address, salary, DOB, DOJ, experience);
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee details added successfully");
	}
}
public class Main {
	EmployeeDetails ob=new EmployeeDetails();
	static boolean S = true;
	public static void choices() {
        System.out.println("Employee Management System  ");
        System.out.println("1. Add Employee details");
        System.out.println("2.View Employee details");
        System.out.println("3.Update Employee details");
        System.out.println("4. Delete Employee details");
        System.out.println("5.View All Employee details");
        System.out.println("6. Exit ");
    } 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetails ob=new EmployeeDetails();
		
		do {
			choices();
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee details");
				ob.addemployee();
				break;
			case 2:
				System.out.println("View Employee details");
	ob.viewemployee();
				break;
			case 3:
				System.out.println("Update Employee details");
				ob.updatemployee();
				break;
			case 4:
				System.out.println("Delete Employee details");
				ob.deletemployee();
				break;
			case 5:
				System.out.println("view All Employee details");
				ob.viewallemployees();
				break;
			case 6:
				System.out.println("Thank you!");
				System.exit(0);
				
			default:
				System.out.println("Please enter number between 1 to 6");
				break;
			}
		}while(S);
		
			}
	}




