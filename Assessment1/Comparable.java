import java.io.*;
import java.util.*;

class Employees implements Comparable<Employees>
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

	@Override
	public int compareTo(Employees e) {
		// TODO Auto-generated method stub
		return this.name.compareTo(e.name);
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

public class Employee {
	
	public static void main(String args[])
	{
		ArrayList<Employees> list = new ArrayList();
		list.add(new Employees(6866,"Jani",20000,21));
		list.add(new Employees(6867,"Raji",25000,20));
		list.add(new Employees(6868,"Ramana",30000,22));
		
		Collections.sort(list);
		System.out.print("After Sorting:");
		System.out.println("Default sorting by name\n");
		System.out.println("empId"+ " "+"Name"+ " "+"Salary"+" "+"Age"+"\n");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getId() + " " + list.get(i).getName()+ " "
					+ list.get(i).getSalary() + " " + list.get(i).getAge());
		}
		
	}

}
