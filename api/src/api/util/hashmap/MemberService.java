package api.util.hashmap;

public interface MemberService {
	/*
	 * 
	 
	ȸ������ ����� �ϴ� �޼ҵ�
	
	*/
	
	
	public void join(String id, String password, String name, int age, String addr);
	
	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ�
	 */
	
	public void login(String id, String password);
	

	

}
