public class SayHii{
	public static void main(String[] args){
		System.out.println("Say Hii");
		//sayHii(sum());
		SayHii sayHii = new SayHii();
		sayHii.sayHii(sayHii.sum());
	}
	
	public void sayHii(int sum){
		System.out.println("Say hii" + sum);
	}
	
	public int sum(){
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			sum += i;
		}
		return sum;
	}
}