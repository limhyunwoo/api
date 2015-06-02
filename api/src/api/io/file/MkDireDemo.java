package api.io.file;

import java.io.File;

public class MkDireDemo {
	public static void main(String[] args) {
		

	
	File f =null;
	boolean bool = false;
	
	try{
		f = new File("C:/Texts");
		
		bool = f.mkdir();
		
		System.out.println("Directory created? " + bool);
	}catch(Exception e){
		e.printStackTrace();
		
	}
	
	
	
}
}