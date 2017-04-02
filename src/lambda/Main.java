package lambda;

public class Main {

	public void add(AddNumber number){
		System.out.println(number.addNumbers());
	}
	
	
	public static void main(String[] args) {
		
		Main mainn=new Main();
		mainn.add(()-> 7*4);
	}
}
