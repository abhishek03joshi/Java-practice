package product;

public class productdao implements iDAO, iProduct{
	
	int id;
	String name;
	
	public void order() {
		System.out.println("order method implemented");
	}
	public void warranty() {
		System.out.println("warrranty method implemented");
	}
	public void rejectionPolicy() {
		System.out.println("rejectionPolicy method implemented");
	}
	public void replacement() {
		System.out.println("replacement method implemented");
	}

	public void insert() {
		System.out.println("insert method implemented");
	}
	public void update() {
		System.out.println("update method implemented");
	}
	public void delete() {
		System.out.println("delete method implemented");
	}
	public void all() {
		System.out.println("all method implemented");
	}
	public void search() {
		System.out.println("search method implemented");
	}
}
