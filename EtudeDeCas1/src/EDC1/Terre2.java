package EDC1;

public class Terre2 extends Thread{
	private int age,id,n;
	
	
	public Terre2(int id, int age) {
		this.age=age;
		this.id=id;
	}
	
	@Override
	public void run() {
    	Terre g = Terre.getInstence();
		g.creer2(id,age,n);
		g.ajouter2(id,age,n);
		g.afficher(id,age);
	}
	
	
}
	
	


	
	
	
	
	
	
	
	
	
		