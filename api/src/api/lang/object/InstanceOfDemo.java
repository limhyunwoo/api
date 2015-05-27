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
		    	 * 소방차가 Car 타입인지 확인 후
		    	 * 맞다면 (FireCar)로 객체 캐스팅을 하라
		    	 * 
		    	 */
		    	
		        if (c instanceof FireCar) {
		        	FireCar f = (FireCar)c;
		        	f.driver();
		            f.stop();
		            f.shootWater();
		            
		            /*
		             * 엠뷸런스가 Car 타입인지 확인 후
		             * 맞다면 Ambulance 로 객체 캐스팅을 하라
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
		 
		    void driver() { System.out.println("운전중");
		    }
		 
		    void stop() {   System.out.println("스톱!!"); }
		}
		 
		 
		class FireCar extends Car {  //Car 클래스를 상속받은 소방차
		    void shootWater() { System.out.println("물뿌려 끄는중..");
		    }
		}
		 
		class Ambulance extends Car { //Car 클래스를 상속받은 엠뷸런스
		    void siren() {  System.out.println("사이렌 울리고 가는 중...");
		    }
	
		
	}


