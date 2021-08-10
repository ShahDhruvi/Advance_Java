package demo;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		System.out.println("Name using getname and setname methods:");
		c.setName("Dhruvi");
		System.out.println(c.getName());
		
		Customer c1 = new Customer("Abcd",1,21,"Ahmedabad",382481);
		System.out.println("Using printdetails method:");
		c1.printDetails();

	}

}
