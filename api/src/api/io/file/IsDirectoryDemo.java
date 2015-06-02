package api.io.file;

import java.io.File;

/*
 * java io.file 의 메소드인
 * isFile() 해당 파일이 있는지 여부를 확인, 없으면 false
 * isDirectory 해당 패스에 디렉토리(폴더) 가 존재하는지 없으면 false
 * 
 */

/*
 * 디렉토리 vs 폴더 : 같은 의미지만 약간 차이가 있음
 * 디렉토리(directory) : 텍스트 모드로 cmd  창에서 경로 구분시에 의미가 짙다.
 * 폴더(folder) : GUI  모드에서 파일을 넣어두는 곳의 의미가 강함. 폴더란 말은 win 3.5 이상에서 등장
 * 그 전엔 디렉토리란 말을 씀.
 */

public class IsDirectoryDemo {
	public static void main(String[] args) {
//		String directory = "c:\test.txt"; 폴더가 아님
		String directory = "c:"+File.separator+"Temp";
		//File.separator 디렉토리 구분자가 불확실할때 동적으로 구분자를 호출하는 클변
		//import 단축키  cntl shift o
		
		File file = new File(directory);
		//디렉토리인지 검사
		if(file.isDirectory()){
			System.out.println("검색티렉토리 : " + directory);
			System.out.println("디렉토리 내부파일 목록");
			String str [] = file.list();
			for(int i = 0 ; i < str.length; i ++){
				File file2 = new File(directory + file.separator + str[i]);
				if(file2.isDirectory()){
					System.out.println(str[i] + ": 디렉토리");
				}
				else{System.out.println(str[i] + ": 파일");
					
				}
			}
		}else{
			System.out.println("지정한" + directory + "는 디렉토리가 아님");
		}
		
		
	}

}
