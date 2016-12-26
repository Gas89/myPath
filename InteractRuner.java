import java.util.Scanner;

public class InteractRuner{
	public static void main(String[] arg){
	Scanner reader = new Scanner(System.in);
		try {
			Culculater calc = new Culculater();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg:" );
				String first = reader.next();
				System.out.println("Enter second arg:" );
				String second = reader.next();
				calc.add(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("result = " + calc.getResult());
				calc.clearResult();
				System.out.println("exit : yes/no");
				exit = reader.next();
			
			
			}
		}finally{
			reader.close();
		}
	}
}