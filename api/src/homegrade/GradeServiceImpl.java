package homegrade;


import java.util.Arrays;
import java.util.Vector;

import org.omg.CORBA.portable.ValueOutputStream;

public class GradeServiceImpl implements GradeService{

     GradeVO vo = new GradeVO();
     Vector<String> vc = new Vector<String> ();
     int [] arr = new int [vc.size()/6];
     String [][] tear = new String[6][100];
    
     //
    
     Vector<GradeVO> no = new Vector<GradeVO>();
    
     @Override
     public void Input(String a, String b, int c, int d, int e) {
    
               vc.addElement(a);
               vc.addElement(b);
               vc.addElement(String.valueOf(c));
               vc.addElement(String.valueOf(d));
               vc.addElement(String.valueOf(e));
               vc.addElement(String.valueOf(c+d+e));
             
     }

    
//     @Override
//     public void Input(GradeVO vo) {
//    
//          no.addElement(vo);
//              
//          }
//         
//         
//         
//     }

     /*
     *성적표를 출력하는 메소드
     *vo.toString() 으로 처리 예상하고 있음.
     *
     */
    
    
    

     @Override
     public void print() {
         
    
         
          for(int i = 0; i <6 ; i++){   //행
               for(int j = 0; j < (int)(vc.size()/6); j++){ //열
            	   
               tear[j][i] =  vc.elementAt(((6*j)+i));
              
          }
          }
          for(int j = 0; j < (int)(vc.size()/6); j++ ){
        	  for(int i = 0; i < 6; i++){
               System.out.print(vc.elementAt((j*6)+i) + "\t");
              
          }
          System.out.println();
          }

         
         
         
//          vo.toString();
//          System.out.print("총점 = " + String.valueOf(vo.getTotal())+"]");
//          System.out.println();
         
 
     }

     /*
     * 학번으로 검색하는 기능을 가진 메소드겠구나!
     *
     */
    
    
    
     @Override
     public String searchGradeHak(String hak) {
         
          if(vc.contains(hak)){
               int idx = vc.indexOf(hak);
               System.out.println("[ 학번은 : " +vc.elementAt(vc.indexOf(hak)) + "\t" +
                         "이름은 : " +vc.elementAt(vc.indexOf(hak)+1) + "\t"
                         +"국어는 : " +vc.elementAt(vc.indexOf(hak)+2) + "\t"
                         +"영어는 : " +vc.elementAt(vc.indexOf(hak)+3) + "\t"
                         +"수학은 : " +vc.elementAt(vc.indexOf(hak)+4) + "\t"
                         +"총점은 : " +vc.elementAt(vc.indexOf(hak)+5) + " ]");
          }
          else{System.out.println("존재하지 않는 학번입니다.");}
    
        
          return null;
     }

    


     /*
     * 이름으로 성적을 검색해서 출력하는 메소드
     */
    
    
     @Override
     public Vector<String> SearchGradeByName(String name) {
          if(vc.contains(name)){
               int idx = vc.indexOf(name);
               System.out.println("[ 학번은 : " +vc.elementAt(vc.indexOf(name)-1) + "\t" +
                         "이름은 : " +vc.elementAt(vc.indexOf(name)) + "\t"
                         +"국어는 : " +vc.elementAt(vc.indexOf(name)+1) + "\t"
                         +"영어는 : " +vc.elementAt(vc.indexOf(name)+2) + "\t"
                         +"수학은 : " +vc.elementAt(vc.indexOf(name)+3) + "\t"
                         +"총점은 : " +vc.elementAt(vc.indexOf(name)+4) + " ]");
          }
          else{System.out.println("존재하지 않는 이름입니다.");}
         
          return null;
         
         
         
         
//          Vector<String> result = new Vector<String>();
//          if (vo.toString().contains(name)){
//               result.addElement(toString() + "총점 = " + String.valueOf(vo.getTotal())+"]");
//         
//              
//          }
//         
//    
//          return result;
     }

    
     /*
     종합점수 내림차순으로 정렬시키는 메소드
    
     */
    
    
     @Override
     public void descGradeTotal() {
     Vector<Integer> result = new Vector<Integer>();
          String []arr = new String [(vc.size()/6)];
          int []a = new int[arr.length];
          
         
          for(int i = 1; i < (vc.size()/6)+1;){
               arr[i-1] = vc.elementAt((6*i)-1);
          }
          for(int i = 0; i<arr.length; i++ ){
        	  a[i] = Integer.parseInt(arr[i]);
        	  
          }
          
       
          Arrays.sort(a);
          
          for(int i = 0; i  < 6; i ++){
        	  System.out.print(a[i] + "\t");
          }
          
          
          for(int i = 0; i < (vc.size()/6)+1;){
               
               if  (tear[5][i] ==""+a[i]){
                    System.out.println("[ 학번은 : " +tear[0][i] + "\t" +
                              "이름은 : " +tear[1][i] + "\t"
                              +"국어는 : " +tear[2][i] + "\t"
                              +"영어는 : " +tear[3][i] + "\t"
                              +"수학은 : " +tear[4][i] + "\t"
                              +"총점은 : " +tear[5][i] + " ]");
                   
                   
                   
               }
               else{System.out.println("등록되지 않은 학생입니다.");
          }
          }
         

         
          
         
          }

     /*
          종합점수 오름차순
     */
    
    
     @Override
     public void ascGradeTotal() {
          int []arr = new int[ (int)(vc.size()/6)];
          int []a = new int[arr.length];
         
          for(int i = 0; i < (int)(vc.size()/6)+1;){
               arr[i] = (int)vc.indexOf((6*i));
          }

               Arrays.sort(arr);
              
               for(int i = 0; i < arr.length; i++ ){
                    a[i] = arr[arr.length-i-1];
               }
               arr = a;
         
               for(int i = 0; i < (int)(vc.size()/6)+1;){
                   
                    if  (tear[5][i] == (""+a[i])){
                         System.out.println("[ 학번은 : " +tear[0][i] + "\t" +
                                   "이름은 : " +tear[1][i] + "\t"
                                   +"국어는 : " +tear[2][i] + "\t"
                                   +"영어는 : " +tear[3][i] + "\t"
                                   +"수학은 : " +tear[4][i] + "\t"
                                   +"총점은 : " +tear[5][i] + " ]");
                        
                        
                        
                    }
                    else{System.out.println("등록되지 않은 학생입니다.");
               }
               }

              
    
              
              
              
              
              
        
          }
         
}
