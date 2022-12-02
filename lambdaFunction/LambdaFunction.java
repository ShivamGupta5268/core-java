package lambdaFunction;

@FunctionalInterface	// this represents when interface has single abstract method.
public interface LambdaFunction {

	public void calc(int a, int b);	


	public static void main(String[] args) {
		
		LambdaFunction add = (a,b) -> {
			System.out.println(a+b);
		};
		add.calc(5, 10);
		
		LambdaFunction sub = (a,b) -> {
			System.out.println(a-b);
		};
		sub.calc(20, 10);
		
		LambdaFunction multi = (a,b) -> {
			System.out.println(a*b);
		};
		multi.calc(5, 6);
	}
	
}
