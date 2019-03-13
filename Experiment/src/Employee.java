/** Program to implement aggregation **/
class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class Employee {
	int id;
	String name;
	Address address; // Entity reference

	Employee(int id, String name, Address address) { // parameterized constructor
		this.id = id; // Refers class instance id
		this.name = name;
		this.address = address;
	}

	void display() { // To display employee details
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india"); // Object creation for the Address class
		Address address2 = new Address("gno", "UP", "india");

		Employee e = new Employee(111, "varun", address1); // Object creation for Employee class
		Employee e2 = new Employee(112, "arun", address2);

		e.display();
		e2.display();

	}
}
