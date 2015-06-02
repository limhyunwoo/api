package api.lang.thread;

public class AtmUserRunnableDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable hong = new Atmuser(atm, "홍길동");
		Runnable kim = new Atmuser(atm, "김닝");
		Runnable ssdf = new Atmuser(atm, "씽닝");
		Runnable fas = new Atmuser(atm, "풰에스");
		
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
		System.out.println(name + "님이 인출요청함");
		for(int i = 0; i <= 10000000; i++){
			if(i == 10000){
			System.out.println(name + "님 인출중...");
		}}
		System.out.println(name + "인출해 나감");
	}
}

class Atmuser implements Runnable{
	Atm atm;
	String name;
	public Atmuser(Atm atm, String name) {
		super(); //부모의 기능을 가져다 쓰기 위해 부모의 생성자를 자식의 생성자 내부에 위치시킴, 오버라이딩은 되지 않고 메소드들 다 가져다 쓸수있음.
		this.atm = atm;
		this.name = name;
		
	}

	@Override
	public void run() {
		atm.inchul(name);
		
	}
	
	
}


