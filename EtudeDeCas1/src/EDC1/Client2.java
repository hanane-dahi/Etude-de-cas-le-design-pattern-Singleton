package EDC1;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		int w=1;
		Scanner clnt = new Scanner(System.in);
		System.out.println("Vous pouvez toujours saisir id et l'age du client ");
		while(w==1){
			int id = clnt.nextInt();
		    int age = clnt.nextInt();		
				
			Terre2 b=new Terre2(id,age); 
        	b.start();
		}
}
}
