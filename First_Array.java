public class First_Array{
	public static void main(String... args){
		int[] marks=new int[3];
		marks[0]=90;
		marks[1]=65;
		marks[2]=87;
		System.out.println("Garvage value!");
		System.out.println(marks);
		System.out.println("Array values!");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println("By The Loop");
		for (int i=0; i<3; i++){
			System.out.println(marks[i]);
			
		}
	}
}