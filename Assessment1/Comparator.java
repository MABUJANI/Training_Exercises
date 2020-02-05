import java.io.*;
import java.util.*;

class Employees
{

	private int id;
	private String name;
	private int salary;
	private int age;
	public Employees(int id, String name, int salary, int age ) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
}
class IdCompare implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		// TODO Auto-generated method stub
		if(e1.getId() < e2.getId())
		{
			return -1;
		}
		else if(e1.getId() > e2.getId()){
			return 1;
		}
		else return 0;
	}
	
}

class SalaryCompare implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		// TODO Auto-generated method stub
		if(e1.getSalary() < e2.getSalary())
		{
			return -1;
		}
		else if(e1.getSalary() > e2.getSalary()){
			return 1;
		}
		return 0;
	}
	
	
}

class AgeCompare implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		// TODO Auto-generated method stub
		if(e1.getAge() < e2.getAge())
		{
			return -1;
		}
		else if(e1.getAge() > e2.getAge()){
			return 1;
		}
		return 0;
	}
	
	
}

public class Employee {
	
	public static void main(String args[])
	{
		ArrayList<Employees> list = new ArrayList();
		list.add(new Employees(6866,"Jani",20000,21));
		list.add(new Employees(6867,"Raji",25000,20));
		list.add(new Employees(6868,"Rama",30000,22));
		
		
		System.out.println("Sort by ID:\n");
		System.out.println("empId"+ " "+"Name"+ " "+"Salary"+" "+"Age"+"\n");
		IdCompare idCompare = new IdCompare();
		Collections.sort(list,idCompare);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getId() + " " + list.get(i).getName()+ " "
					+ list.get(i).getSalary() + " " + list.get(i).getAge());
		}
		
		
		System.out.println("\nSort by salary:\n");
		System.out.println("salary"+ " "+"Name"+ " "+"empid"+" "+"Age"+"\n");
		SalaryCompare salaryCompare = new SalaryCompare();
		Collections.sort(list,salaryCompare);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getSalary() + " " + list.get(i).getName()+ " "
					+ list.get(i).getId() + " " + list.get(i).getAge());
		}
		
		System.out.println("\nSort by Age:\n");
		System.out.println("age"+ " "+"Name"+ " "+"Salary"+" "+"empid"+"\n");
		AgeCompare ageCompare = new AgeCompare();
		Collections.sort(list,ageCompare);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAge() + " " + list.get(i).getName()+ " "
					+ list.get(i).getSalary() + " " + list.get(i).getId());
		}
		
	}

}
