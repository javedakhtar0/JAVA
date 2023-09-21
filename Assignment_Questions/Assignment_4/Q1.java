import java.io.Console;
  public  class Q1{
		public static void main(String args[])
		{
			Console c=System.console();
			int num;
			//read integer num1
			num=Integer.parseInt(c.readLine("Enter the number:"));
			switch(num){
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
                case 6:
					System.out.println("Saturday");
					break;
                case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Enter thright number!");
			}

		}
	}
