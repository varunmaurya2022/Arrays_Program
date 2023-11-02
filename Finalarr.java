public class Finalarr{
	public static void main(String... args){
		/*final*/ int x[]={10,20,30};
		System.out.println(x[0]);
		int y[]={30,40,50,12,15};
		x=y;
		System.out.println(x[3]);
	}
}