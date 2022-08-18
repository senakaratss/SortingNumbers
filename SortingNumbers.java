import java.util.Scanner;
public class SortingNumbers {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1=kb.nextInt();
		System.out.println("Enter a number: ");
		int n2=kb.nextInt();
		System.out.println("Enter a number: ");
		int n3=kb.nextInt();
		if(n1<n2 && n1<n3) {
			if(n2<n3){
				System.out.println(n1+","+n2+","+n3);
			}
			else {
				System.out.println(n1+","+n3+","+n2);
			}
		}
		else if(n2<n1 && n2<n3) {
			if(n1<n3){
				System.out.println(n2+","+n1+","+n3);
			}
			else {
				System.out.println(n2+","+n3+","+n1);
			}
		}
		else {
			if(n1<n2){
				System.out.println(n3+","+n1+","+n2);
			}
			else {
				System.out.println(n3+","+n2+","+n1);
			}
		}
	}

}
