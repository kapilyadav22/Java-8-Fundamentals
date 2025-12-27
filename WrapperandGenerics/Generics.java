
public class Generics<I,S> {
	I id;
	S name;
	
	public Generics(I id, S name) {
		this.id = id;
		this.name = name;
	}
	void print() {
		System.out.println(id+" "+name);
	}
	
	<E> void genericmethod(E data) {
		System.out.println("You are inside generics method "+ data);
	}
}
