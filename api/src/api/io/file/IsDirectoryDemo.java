package api.io.file;

import java.io.File;

/*
 * java io.file �� �޼ҵ���
 * isFile() �ش� ������ �ִ��� ���θ� Ȯ��, ������ false
 * isDirectory �ش� �н��� ���丮(����) �� �����ϴ��� ������ false
 * 
 */

/*
 * ���丮 vs ���� : ���� �ǹ����� �ణ ���̰� ����
 * ���丮(directory) : �ؽ�Ʈ ���� cmd  â���� ��� ���нÿ� �ǹ̰� £��.
 * ����(folder) : GUI  ��忡�� ������ �־�δ� ���� �ǹ̰� ����. ������ ���� win 3.5 �̻󿡼� ����
 * �� ���� ���丮�� ���� ��.
 */

public class IsDirectoryDemo {
	public static void main(String[] args) {
//		String directory = "c:\test.txt"; ������ �ƴ�
		String directory = "c:"+File.separator+"Temp";
		//File.separator ���丮 �����ڰ� ��Ȯ���Ҷ� �������� �����ڸ� ȣ���ϴ� Ŭ��
		//import ����Ű  cntl shift o
		
		File file = new File(directory);
		//���丮���� �˻�
		if(file.isDirectory()){
			System.out.println("�˻�Ƽ���丮 : " + directory);
			System.out.println("���丮 �������� ���");
			String str [] = file.list();
			for(int i = 0 ; i < str.length; i ++){
				File file2 = new File(directory + file.separator + str[i]);
				if(file2.isDirectory()){
					System.out.println(str[i] + ": ���丮");
				}
				else{System.out.println(str[i] + ": ����");
					
				}
			}
		}else{
			System.out.println("������" + directory + "�� ���丮�� �ƴ�");
		}
		
		
	}

}
