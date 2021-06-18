class Wk4{
	
	public static void main(String[] args){
		
		double ans= multiplyNumbers();
		System.out.println("Result is : "+ans);		
	}

	public static double multiplyNumbers(double num1, double num2){
		double ans = num1*num2;
		return ans;	
	}

	public static double multiplyNumbers(double num1, double num2, double num3){
		double ans = num1*num2*num3;
		return ans;
	}

	public static double multiplyNumbers(double num1, int num2){
		double ans = num1*num2;
		return ans;
	}

	public static double multiplyNumbers(){
		return 9999.9999;
	}

	public static int multiplyIntNumbers(){
		return 10;
	}

//editing
}
