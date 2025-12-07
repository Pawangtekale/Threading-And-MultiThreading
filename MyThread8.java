package Threading;

public class MyThread8 extends Thread{
	Object o1;
	Object o2;
	
	public MyThread8() {
		// TODO Auto-generated constructor stub
	}
	public MyThread8(Object o1,Object o2){
		super();
		this.o1=o1;
		this.o2=o2;
	}
	public void run() {
		synchronized (o2) {
			System.out.println(Thread.currentThread().getName()+"Lock Second Object");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (o1) {
				System.out.println(Thread.currentThread().getName()+"Locked First Object");
			}
			
		}
	}

}
