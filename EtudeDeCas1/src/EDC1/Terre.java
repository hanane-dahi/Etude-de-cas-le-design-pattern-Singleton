package EDC1;

public class Terre {
	int age,id;
	private Terre(int id, int age) {
		this.id=id;
		this.age=age;
	}
	
	private static final Terre s;
	static {
		s=new Terre(0,0);
	}
	
	public static Terre getInstence() {
		return s;
	}
	//créer
	
	public void creer(int id,int age) {
		System.out.println("creation du client "+ id);
		for(int i=1;i<=5;i++) {
			System.out.println("....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("le client  "+id+" a été crée");
	
	}
	
	//Ajouter

	public void ajouter(int id,int age) {
		System.out.println("ajouter le client "+ id);
		for(int i=1;i<=5;i++) {
			System.out.println("....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("le client  "+id+" a été ajouté");
	
		

	}
	
	
	
	//Afficher

	public void afficher(int id,int age) {
		System.out.println("id du client :  "+ id +"  et son age :"+ age);
	}
	
}
	
