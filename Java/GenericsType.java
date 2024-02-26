package Examples;

class Demo<T> {
	  T obj;
	  Demo(T obj) { this.obj = obj; }
	  public T getObject() { return this.obj; }
	}

	
	class GenericsType {
	  public static void main(String[] args)
	  {
	   
	    Demo<Integer> obj1 = new Demo<Integer>(101);
	    System.out.println(obj1.getObject());

	    // instance of Float type
	    Demo<Float> obj2 = new Demo<Float>(15.55f);
	    System.out.println(obj2.getObject());

	    // instance of String type
	    Demo<String> obj3
	            = new Demo<String>("BeginnersBook");
	    System.out.println(obj3.getObject());

	    // instance of Character type
	    Demo<Character> obj4
	            = new Demo<Character>('A');
	    System.out.println(obj4.getObject());
	  }
	}

