//Super class yani ana class denir
public class Calisan {
	private String name;
	private int salary;
	private String department;
	public Calisan(String name, int salary, String department) {
		 
		this.setName(name);
		this.setSalary(salary);
		this.setDepartment(department);
	}

	public void calis() {
		System.out.println("Calisan Calisiyor..");
	}
	
	public void bilgileriGoster(){
		System.out.println("Isim:" + name);
		System.out.println("Maas:" + salary);
		System.out.println("Department:" + department);
	}
	public void departmentDegistir(String yeni_department){
		
		System.out.println("department degistiriliyor");
		this.setDepartment(yeni_department);
		System.out.println("Yeni department: " + yeni_department);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
