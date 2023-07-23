package String;

public class literal {
	public static void main(String[]args) {
		String s1="java";
		String s2="java";
		String s3="selenium";
		String s4="java";
		String s5="selenium";
		 System.out.println(System.identityHashCode(s1));
		 
		 System.out.println(System.identityHashCode(s2));
		 System.out.println(System.identityHashCode(s3));
		 System.out.println(System.identityHashCode(s4));
		 System.out.println(System.identityHashCode(s5));
		 
		 
		 System.out.println("**************");
		 
		 
		 String a1=new String("java");
		 String a2=new String("java");
          String a3=new String("selenium");
		 String a4=new String("selenium");
		 String a5=new String("selenium");
		 String a6=new String("java");
		 System.out.println(System.identityHashCode(a1));
		 System.out.println(System.identityHashCode(a2));
		 System.out.println(System.identityHashCode(a3));
		 System.out.println(System.identityHashCode(a4));
		 System.out.println(System.identityHashCode(a5));
		 
		System.out.println("**************");
		 System.out.println(System.identityHashCode(s2));
		 System.out.println(System.identityHashCode(s3));
		 System.out.println(System.identityHashCode(s4));
		 System.out.println(System.identityHashCode(s5));
		 
		 System.out.println("********");
		 System.out.println(System.identityHashCode(s1.concat(s2)));
		 System.out.println(System.identityHashCode(s3.concat(s4)));
		 System.out.println("*************");
		 
		 StringBuilder r1=new StringBuilder("java");
		 StringBuilder r2=new StringBuilder("selenium");
		 System.out.println(System.identityHashCode(r1));
		 System.out.println(System.identityHashCode(r2));
		 
		 System.out.println(System.identityHashCode(r1.append(r2)));
		 
				 
		 
		 
		 

				
		 
		 
		 
		 

	}

}
