package Threading;

public class DeadLockImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1=new Object();
		Object o2=new Object();
		
		MyThread7 t1=new MyThread7(o1,o2);
		MyThread8 t2=new MyThread8(o1,o2);
		t1.start();
		t2.start();

	}

}
