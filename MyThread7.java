package Threading;

public class MyThread7 extends Thread{
	Object o1;
	Object o2;
	
	public MyThread7() {
		// TODO Auto-generated constructor stub
	}
	public MyThread7(Object o1,Object o2){
		super();
		this.o1=o1;
		this.o2=o2;
	}
	public void run() {
		synchronized (o1) {
			System.out.println(Thread.currentThread().getName()+"Lock First Object");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (o2) {
				System.out.println(Thread.currentThread().getName()+"Locked Second Object");
			}
			
		}
	}

}
