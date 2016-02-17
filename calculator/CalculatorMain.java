class CalculatorMain{
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.add(10).minus(2).isEqaulTo());
		Calculator yourCalc = new Calculator();
		System.out.println(yourCalc.add(200).minus(12).isEqaulTo());
	}
}