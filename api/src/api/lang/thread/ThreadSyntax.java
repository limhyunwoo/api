package api.lang.thread;

/*
 * program : 특정 기능을 목표로 이루어진 함수, 프로시져, 메소드 집합
 * Process : 구동중인 program
 * thread 의 집합으로 하나의 exe, com, dll 같은 프로그램을 뜻함
 * process 간 자원(memory = resource) 를 공유할 수 없다. 
 * 따라서 process 를 많이 발생시키면 자원이 바닥남.

 */

/*
 * Thread 반복적으로 동기하되어 실행되는 프로그램 루틴 ( 루틴 : 비슷한 말로 함수)
 * 메소드 단위의 처리 모듈 . Process 의 구성요소
 * Thread  는 많이 발생해도 자원을 공유함으로써, Process 에 비해
 * 시스템에 부담이 적음
 * 
 */

/*
 * Thread 를 구현하는 방법
 * 1. Thread 클래스를 상속하는 방법
 * 2. Runnable 인터페이스를 구현하는 방법
 * -객체지향적인 방법은 인터페이스를 구현하는 방법을 취하는 것이다.
 * 
 */

/*
 * 스레드 콜백 메소드
 * -start() : JVM 이 스케쥴 상 여유가 생겼을 때, 스레드 스케줄 상 run() 이 호출된다.
 * -run() : 스레스 상에서 처리하려고 하는 모든 비지니스 로직이 구현됨.
 * -sleep(long second) : 지정된 시간동안 스레드를 쉬게 하고, 그 시간이 지나면 다시
 * 	작동한다. 1000분의 1초
 * -wait() : 현재 스레드 무한대기. notify(), notifyAll() 메소드로 재실행시킴
 * -suspend() : 일시정지, 재실행은 resume();
 * -yield() : 스레드 실행권한을 다른 스레드에 넘김
 * -stop() : 스레드 실행을 종료
 */

/*
 * 단일 스레드
 * -하나의 자바 프로그램 실행 상태
 * -main() 이 대표적인 싱글 스레드
 * 멀티 스레드
 * -하나의 메소드가 실행하는 상태가 아닌
 * -여러 메소드가 지속적으로 자원을 공유한 상태에서 실행하는 것
 */

/*
 * 콜백 메소드
 * -메소드를 일정 실행순서로 미리 등록시켜놓고
 * -등록된 순서에 따라 자동적으로 호출하는 메소드
 * 
 */

/*
 * 교착상태(Dead lock)
 * - 두 스레드가 lock 을 건 상태에서
 * -서로 lock 이 풀리기를 기다리는 상황으로
 * -프로그래머는 변수와 while 을 if문을 사용해서 스레드를 제어해야 함.
 */






public class ThreadSyntax {

}







