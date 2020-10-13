package EDC1;

public class Terre2 extends Thread{
	private int age,id;
	
	
	public Terre2(int id, int age) {
		this.age=age;
		this.id=id;
	}
	
	@Override
	public void run() {
    	Terre g = Terre.getInstence();
		g.creer(id,age);
		g.ajouter(id,age);
		g.afficher(id,age);
	}
}
			
