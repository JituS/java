class Hello {
	public static long factorial(long number){
		if(number == 1) return 1;
		return number * factorial(number - 1);
	}
	public static int[] fibonacci(int number){
		int[] myList = new int[number];
		myList[0] = 0;
		myList[1] = 1;
		int firstNumber = 0, secondNumber = 1, sum = 0;
		for(int i = 2; i < number; i++){
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			myList[i] = sum;
		}
		return myList;
	}

	public static void main(String[] args) {
		Person jitendra = new Person("jitendra", 21);
		Person sachdeva = new Person("sachdeva", 20);
		jitendra.print();
		sachdeva.print();
		System.out.println("fact(5) = "+factorial(5));
		System.out.println("fact(10) = "+factorial(10));
		int[] fibonacciOf10 = fibonacci(10);
		System.out.println("fibonacci of 10 is :-");
		for(int i = 0 ; i < fibonacciOf10.length; i++){
			System.out.println("\t\t\t"+fibonacciOf10[i]);
		}
	}
}