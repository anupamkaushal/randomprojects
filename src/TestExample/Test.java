package TestExample;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);*/
		
		
				Subclass s1 = new Subclass();
				s1.foo();
				
				Super s = new Subclass();
				s.foo();
			}
		}
		 
		class Super {
			public void foo() {
				System.out.println("Super");
			}
		}
		 
		class Subclass extends Super {
			public void foo() {
				System.out.println("Subclass");
			}
		

	}


