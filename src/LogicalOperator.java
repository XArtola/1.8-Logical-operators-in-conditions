/**
 * 
 */
import java.util.Scanner;
/**
 * @author ik013043z1
 *
 */
public class LogicalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Type three positive numbers to order them fromm big to small:");
		
		int N1 = Sc.nextInt();
		int N2 = Sc.nextInt();
		int N3 = Sc.nextInt();
		
		boolean Flag = false;
		
		if(((N1 == N2) && (N1 == N3) && (N2 == N3)) || (N1<0 || N2<0 || N3<0)) {
			
			System.out.println("Do not print the same or negative numbers!!");
			
			 Flag = true;
		}
		
		
		if (!Flag) {
		if(N1>N2 && N1>N3){
			
			if (N2>N3) {
				
				System.out.println(N1+ ">" + N2+ ">" + N3);
				
						}
			else {
				
				System.out.println(N1+ ">" + N3+ ">" + N2);
				
			}
			
		
						}
		
		if(N2>N1 && N2>N3) {
			
			if(N1>N3) {
				
				System.out.println(N2+ ">" + N1+ ">" + N3);
				
						}
			else {
				
				System.out.println(N2+ ">" + N3+ ">" + N1);
			}
		}
			
			
		if(N3>N1 && N3>N2) {
				
				if(N1>N2) {
					
					System.out.println(N3+ ">" + N1+ ">" + N2);
					
							}
				else {
					
					System.out.println(N3+ ">" + N2+ ">" + N1);
				}
		}
			
			
			
		
		
		
	
		}
	}

	}


