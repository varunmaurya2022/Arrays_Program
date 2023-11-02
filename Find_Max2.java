import java.util.Scanner;
public class Find_Max2{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array ");
		int rows=sc.nextInt();
		System.out.println("Enter The Size ");
		int size=sc.nextInt();
		
		int marks[][]=new int [rows][size];
		System.out.println("Enter The element in array ");
		for (int i=0; i<rows;i++){
			for (int j=0; j<size;j++){
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Array is ");
		for (int i=0; i<rows;i++){
			for (int j=0; j<size;j++){
				System.out.print(marks[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("");
		int N=marks.length;
		int M=marks[0].length;
		System.out.print("The biggest value is  "+Show_max(marks,N,M));
	}
	public static int Show_max(int arr[][], int N, int M){
		int max_value=arr[0][0];
		for (int i=0;i<N; i++){
			for (int j=0; j<M;j++){
				if (arr[i][j]>max_value){
					max_value=arr[i][j];
				}
			}
		}
		return max_value;
	}
}
	