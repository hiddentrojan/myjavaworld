import java.util.Scanner;


class Ball{
	
	private String color = "red";//Default will be red
	private int weight = 10;// Default will be 10
	static int totalweight = 0;
	
	
	Scanner sc = new Scanner(System.in);
	
	//Default values
	public Ball() {
		
		totalweight = totalweight + weight;
		
	}
	
	//Color from user
	public Ball(String n) {
		
		System.out.print("\nEnter the name of the colour = ");
		color = sc.next();
		
		totalweight = totalweight + weight;
		
	}
	
	//Weight from user
	public Ball(int w) {
		
		System.out.print("\nEnter the amount of weight = ");
		weight = sc.nextInt();
		
		totalweight = totalweight + weight;
	}
	
	
	//Both from user
	public Ball(String c, int w) {
		
		System.out.print("\nEnter the name of the colour = ");
		color = sc.next();
		
		System.out.print("\nEnter the amount of weight = ");
		weight = sc.nextInt();
		
		totalweight = totalweight + weight;
		
	}
	
	//Display data for each ball
	public void displaydataball() {
	
		System.out.print("\nThe colour is = " + color);
		System.out.print("\nThe weight is = " + weight);
		
	}
	
	
	//Display total data
	public void displaydata(int n) {
		
		System.out.print("\nThe total number of balls = " + n);
		System.out.print("\nThe total weight is = " + (totalweight-10));
		
	}
	
	
	//Delete balls
	public void deleteball(int d, int n, Ball arr[]) {
		
		totalweight = totalweight - weight;
		
		
		if(d != n) {
			
			for(int i = d-1; i < n+1; i++ ) {
				
				arr[i] = arr[i+1];
				
			}
			
		}
			
		
			
		
	}
	
	
}




public class tp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int i = 0;
		
		String c = "";//Color
		int w = 0; //Weight
		Scanner sc = new Scanner(System.in);
		
		
		//Creating objects
		Ball[] b = new Ball[10]; // Individual balls
		Ball B = new Ball(); //Overall output
		
		/*for(i = 0; i < num; i++) {
			
			b[i] = new ball();
			
		}*/
		
		
		//Accepting user input for each ball
		int choice = 0;
		
		System.out.print("1. Enter default attributes for ball \n2. Enter color for ball \n3. Enter weight for ball \n4.Enter both weight and colour for ball \n5.Delete \n6. Display \n7.Exit");
		
		while(choice != 7) {
			
			System.out.print("\nEnter your choice = ");
			choice = sc.nextInt();
			
			switch(choice) {
			
				case 1:
						b[i] = new Ball();
						num++;
						i++;
						break;
						
				case 2:
						b[i] = new Ball(c);
						num++;
						i++;
						break;
					
				case 3:
						b[i] = new Ball(w);
						num++;
						i++;
						break;
					
				case 4:
						b[i] = new Ball(c, w);
						num++;
						i++;
						break;
						
				case 5:
						//Delete balls
						System.out.print("\n\nEnter the no. of ball you want to delete = ");
						int d = sc.nextInt();
						
						if(num == 0) {
							
							System.out.print("\n\n Bag empty");
							
						}else {
							b[d-1].deleteball(d, num, b);
							num--;
						}
						break;
						
						
				case 6:
					//Displaying the results
					for(i = 0; i < num; i++) {
							
						System.out.print("\nFor ball " + (i + 1));
						b[i].displaydataball();
							
					}
					B.displaydata(num);
					break;
			
			}
			
			
		}
				
		
		
		/*//Delete balls
		System.out.print("\n\nEnter the no. of ball you want to delete = ");
		int d = sc.nextInt();
			
		b[d-1].deleteball(d, num, b);
		num--;*/
		
		
		/*//Displaying the results
			for(i = 0; i < num; i++) {
					
				System.out.print("\nFor ball " + (i + 1));
				b[i].displaydataball();
					
		}
		B.displaydata(num);*/
		
		
		
	}
	
	
}

