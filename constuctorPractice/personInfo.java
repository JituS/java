class Person {
	private Name name;
	private int age;
	Person(Name name, int age){
		this.name = name;
		this.age = age;
	}
	void print(){
		System.out.println(this.name.fullName() + " " + this.age);
	}
}

class Name {
	private String firstName;
	private String lastName;
	public static int count = 0;
	Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
	}
	public String fullName(){
		return this.firstName + " " + this.lastName;
	}
}

class personInfo {
	public static void main(String[] args) {
		Name name = new Name(args[0], args[1]);
		Person person = new Person(name, Integer.parseInt(args[2]));
		person.print();
	}
}