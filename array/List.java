class List {
	private int number;
	private int list[];
	List(int number){
		this.number = number;
		this.list = fibonacci(this.number, this.number + 1);
	};
	private int[] fibonacci(int number, int limit){
		if(number == 1) {
			int[] fibo = new int[limit];
			fibo[0] = 0;
			fibo[1] = 1;
			return fibo;
		}
		int[] a = fibonacci(number-1, limit);
		a[number] = a[number-1] + a[number-2];
		return a;
	};

	public void print(){
		System.out.println("fibonacci of "+this.number + " :");
		for(int i : this.list){
			System.out.println("\t"+i);
		}
	};
}

class Fibonacci {
	public static void main(String[] args) {
		List fibonacci_10 = new List(10);
		List fibonacci_5 = new List(5);
		List fibonacci_20 = new List(20);
		fibonacci_10.print();
		fibonacci_5.print();
		fibonacci_20.print();
	}
}
	
