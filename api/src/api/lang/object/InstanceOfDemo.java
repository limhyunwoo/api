package api.lang.object;

public class InstanceOfDemo {
	public static void main(String[] args) {
		
		        FireCar firecar = new FireCar();
		        Ambulance amblulance = new Ambulance();
		        InstanceOfDemo test = new InstanceOfDemo();
		        test.doWork(firecar);
		        test.doWork(amblulance);
		 
		    }

		    public void doWork(Car c) {
		    	/*
		    	 * �ҹ����� Car Ÿ������ Ȯ�� ��
		    	 * �´ٸ� (FireCar)�� ��ü ĳ������ �϶�
		    	 * 
		    	 */
		    	
		        if (c instanceof FireCar) {
		        	FireCar f = (FireCar)c;
		        	f.driver();
		            f.stop();
		            f.shootWater();
		            
		            /*
		             * ���深���� Car Ÿ������ Ȯ�� ��
		             * �´ٸ� Ambulance �� ��ü ĳ������ �϶�
		             */
		             
		        } else if (c instanceof Ambulance) {
		            Ambulance a = (Ambulance)c;
		            a.siren();
		            a.driver();
		            a.stop();
		        }
		    }
		}
		 
		 
		 
		class Car {
		    String color;
		    int door;
		 
		    void driver() { System.out.println("������");
		    }
		 
		    void stop() {   System.out.println("����!!"); }
		}
		 
		 
		class FireCar extends Car {  //Car Ŭ������ ��ӹ��� �ҹ���
		    void shootWater() { System.out.println("���ѷ� ������..");
		    }
		}
		 
		class Ambulance extends Car { //Car Ŭ������ ��ӹ��� ���深��
		    void siren() {  System.out.println("���̷� �︮�� ���� ��...");
		    }
	
		
	}


