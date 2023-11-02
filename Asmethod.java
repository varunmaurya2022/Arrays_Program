public class Asmethod{
	public static void main(String... args){
		int [] marks={10,20,30,40,50};
		display(marks);
	}
	public static void display(int [] arr){
		for (int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}