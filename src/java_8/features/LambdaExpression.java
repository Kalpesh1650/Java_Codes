package java_8.features;

	interface Names {
		  public void sayName(String name,String familyName);
		 
		}
		 
	//without Lambda expressions
		/*public class LambdaExpression {
		 
		     public static void main(String[] args) {
		        Names nameInstance = new Names() {
		           @Override
		           public void sayName(String name) {
		               System.out.println("My Name is " + name);
		          }
		       };
		      myName(nameInstance, "Kalpesh");
		    }
		 
		    private static void myName(Names nameInstance, String name) {
		      nameInstance.sayName(name);
		   }
		}*/

		//with Lambda Expression
		public class LambdaExpression {
			 
		     public static void main(String[] args) {
		    	 //myName(arg1,arg2...argN --> do something, Value of n variable);
		       myName((n,n1) -> System.out.println("My name is " + n+n1), "Lambda Expressions","Second Argument");
		    }
		 
		     private static void myName(Names nameInstance, String name,String familyName) {
		      nameInstance.sayName(name,familyName);
		    }
		}

