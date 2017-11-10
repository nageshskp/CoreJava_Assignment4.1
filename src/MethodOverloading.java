
public class MethodOverloading {

		    public int add(int a, int b) {
	        System.out.println("Two int add method called");
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        System.out.println("Three int add method called");
	        return a + b + c;
	    }

	    public double add(double a, double b) {
	        System.out.println("Two double add method called");
	        return a + b;
	    }

	    public static void main(String[] args) {
	        MethodOverloading mo = new MethodOverloading();
	        mo.add(1, 2);
	        mo.add(1, 2, 3);
	        mo.add(2d, 5d);
	    }
	}


