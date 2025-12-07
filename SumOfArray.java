package Threading;

public class SumOfArray extends Thread {
	int []ar;
	int sum=0;
	public SumOfArray(int []ar) {
		this.ar=ar;
	}
	public void run() {
		System.out.println("Summing Started");
		synchronized (this) {
			for(int i=0;i<ar.length;i++) {
				sum+=ar[i];
			}
			this.notify();	
		}
		System.out.println("Summing ended");
	}

}
