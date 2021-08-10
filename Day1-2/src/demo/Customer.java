package demo;

public class Customer {

	private String name;
	private	int customerId;
	private	int age;
	private	String city;
	private	int pinCode;
	//default constructor
	public Customer()
		{}
	//parametrized constructor
	public Customer(String name, int cId, int age, String city, int pinCode)
	{
		this.name = name;
		this.customerId = cId;
		this.age = age;
		this.city = city;
		this.pinCode = pinCode;
	}
	//methods
	public void setName(String s)
	{
		this.name = s;
	}
	public String getName()
	{
		return this.name;
	}
	public void printDetails()
	{
		System.out.println("Customer Name = " + this.name);
		System.out.println("Customer Id = " + this.customerId);
		System.out.println("Age = " + this.age);
		System.out.println("City = " + this.city);
		System.out.println("PinCode= " + this.pinCode);
	}

}
