package topic1;

public class Counter {

	 private static Counter counter = null;
	 private int transaction = 0;
	 
	 public Counter () {
		 
	 }
	 
	 public static Counter getInstance() {
		 if (counter == null) {
			 counter = new Counter();
		 }
		 return counter;
	 }
	 
	 public int getTransaction() {
		 this.transaction ++;
		 return this.transaction;
	 }
}
