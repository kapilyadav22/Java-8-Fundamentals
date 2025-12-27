
public class wrapperclass {

	public static void main(String[] args) {
		int a = 123;
		boolean b = false;
		char c = 'c';
		long d = 123456748;
		short e = 12322;
		byte b1 = 23;
		float f = 3.12f;
		double db = 3.1111;
		
		Integer aa = Integer.valueOf(a);
		Boolean bbBoolean  = Boolean.valueOf(b);
		Character ccCharacter = Character.valueOf(c);
		Long ddLong = Long.valueOf(d);
		Short eeShort = Short.valueOf(e);
		
		Integer aInteger = a; //autoboxing
		int ai = aa; //unboxing
		
		
//		System.out.println(aa);
//		System.out.println(bbBoolean);
//		System.out.println(ccCharacter);
//		System.out.println(ddLong);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
		Generics<Integer,String> generics = new Generics<>(1,"Kapil");
		Generics<String,String> generics1 = new Generics<>("EMP205","Kapil");
		generics.print();
		generics1.print();
		generics.genericmethod(1);
		generics.genericmethod("100");
		generics.genericmethod(false);
	}

}
