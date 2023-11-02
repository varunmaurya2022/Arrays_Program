public class Anonymous_arr{
	public static void main(String... args){
		Sum(new int[]{1,2,3,4,5});  //Anonymous Object
	}
	public static void Sum(int []a){
		int total=0;
		for (int i:a){
			total=total+i;
		}
		System.out.println("The Sum Is "+total);
	}
}