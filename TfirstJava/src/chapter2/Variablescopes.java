package chapter2;

public class Variablescopes {
	
	int y = 20; 
	static int z = 30;
	
	double S = 20876.99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
			
			int x = 2025;
			 
			System.out.println(x);
			
			
			Variablescopes mysub = new Variablescopes();
			System.out.println(mysub.y);
			
			System.out.println(mysub.z);
			System.out.println(mysub.S);
			
		
			
			

	}

}
