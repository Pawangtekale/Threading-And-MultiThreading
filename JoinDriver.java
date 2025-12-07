package Threading;

public class JoinDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Started");
		JoinExample t1=new JoinExample();
		t1.start();
		t1.join();
		JoinExample t2=new JoinExample();
		t2.start();
		t2.join();
		System.out.println(Thread.currentThread().getName()+" Ended");
	}

}
