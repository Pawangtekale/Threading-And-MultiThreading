package Threading;

public class JoinExample extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Executing");
	}

}
