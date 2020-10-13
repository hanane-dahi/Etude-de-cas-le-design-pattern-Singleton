package EDC1;
import java.util.Scanner;  

public class Client {


	public static void main(String[] args) {
		int w=1;
		Scanner clnt = new Scanner(System.in);
		
		while(w==1){
			int id = clnt.nextInt();
		    int age = clnt.nextInt();		
			
			Terre b=Terre.getInstence();
			b.creer(id,age);
			
			Terre d=Terre.getInstence();
			d.ajouter(id,age);

			Terre a=Terre.getInstence();
			a.afficher(id,age);
	
		}
		    
		


	}

}
