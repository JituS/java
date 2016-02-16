class Person{
	String name;
	int age;
	Person(String personName, int personAge){
		this.name = personName;
		this.age = personAge;
	}
	public void print(){
		System.out.println(this.name + " " + this.age);
	}
}