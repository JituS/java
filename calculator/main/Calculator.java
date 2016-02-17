package main;
public class Calculator{
	int result;
	public Calculator(){
		this.result = 0;
	};

	public Calculator add(int number){
		this.result+=number;
		return this;
	};
	public Calculator mult(int number){
		this.result*=number;
		return this;

	};
	public Calculator minus(int number){
		this.result-=number;
		return this;
	};
	public int isEqaulTo(){
		return result;
	}
}