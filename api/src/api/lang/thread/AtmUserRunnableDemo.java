package api.lang.thread;

public class AtmUserRunnableDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable hong = new Atmuser(atm, "ȫ�浿");
		Runnable kim = new Atmuser(atm, "���");
		Runnable ssdf = new Atmuser(atm, "�Ŵ�");
		Runnable fas = new Atmuser(atm, "�R����");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(ssdf);
		thr3.start();
		Thread thr4 = new Thread(fas);
		
	}

}

class Atm{
	public synchronized void inchul(String name){
		System.out.println(name + "���� �����û��");
		for(int i = 0; i <= 10000000; i++){
			if(i == 10000){
			System.out.println(name + "�� ������...");
		}}
		System.out.println(name + "������ ����");
	}
}

class Atmuser implements Runnable{
	Atm atm;
	String name;
	public Atmuser(Atm atm, String name) {
		super(); //�θ��� ����� ������ ���� ���� �θ��� �����ڸ� �ڽ��� ������ ���ο� ��ġ��Ŵ, �������̵��� ���� �ʰ� �޼ҵ�� �� ������ ��������.
		this.atm = atm;
		this.name = name;
		
	}

	@Override
	public void run() {
		atm.inchul(name);
		
	}
	
	
}


