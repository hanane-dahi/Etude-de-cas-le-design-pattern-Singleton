package EDC1;

public class Terre {

	private int c;
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
	
	
	
	
	//cr�er
	
	public void creer(int id,int age) {
		System.out.println("creation du client "+ id);
		for(int i=1;i<=3;i++) {
			++c;
			System.out.println(".."+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("le client  "+id+" a �t� cr�e");
	
	}
	
	
	
	//Ajouter

	public void ajouter(int id,int age) {
		System.out.println("ajouter le client "+ id);
		for(int i=1;i<=3;i++) {
			++c;
			System.out.println(".."+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("le client  "+id+" a �t� ajout�");
	
		

	}
	
	
	
	//Afficher

	public void afficher(int id,int age) {
		System.out.println("id du client :  "+ id +"  et son age :"+ age);
	}
	
	
	//cr�er

		public void creer2(int id,int age,int n) {
			System.out.println("....creation du client "+ id);
			for(int i=1;i<=3;i++) {
				++c;
				System.out.println(".."+c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("le client  "+id+" a �t� cr�e");
		
		}
		
		
		
		//Ajouter

		public void ajouter2(int id,int age,int n) {
			System.out.println("....ajouter le client "+ id);
			for(int i=1;i<=3;i++) {
				++c;
				System.out.println(".."+c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("le client  "+id+" a �t� ajout�");
		
			

		}
	
	
	
}
