package api.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		ThreadExtends thr = new ThreadExtends();
		/*
		 * �����带 �� �𸣴� ��Ȳ����
		 * �Ʒ� ȣ�� �޼ҵ带 run �̶�� �ϱ� ����.
		 * �� ����
		 * �ݵ�� ȣ���� start() �� ���ؼ� �ؾ��Ѵ�
		 * �׷��� ���������� run �� ������
		 * �������� �ݹ� �޼ҵ带 ȣ���Ѵ�.
		 * 
		 */
		
		thr.start();
		
		
		
		
	}

}

class ThreadExtends extends Thread{
	//�����带 ��� ���� �� �ڵ�������
	//ctrl space + r
	@Override
	public void run() {
		for(int i = 0;i<5; i++){
			/*
			 * getname �� �� Ŭ������ �θ���
			 * thread �� ������ �ִ� �޼ҵ��̴�
			 * �θ��� �޼ҵ带 �������̵� ����
			 * �ٷ� ����Ϸ��� super �� ȣ���Ѵ�.
			 */
			
			System.out.println(super.getName());
		}
		super.run();
	}
	
}