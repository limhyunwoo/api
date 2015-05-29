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
     *����ǥ�� ����ϴ� �޼ҵ�
     *vo.toString() ���� ó�� �����ϰ� ����.
     *
     */
    
    
    

     @Override
     public void print() {
         
    
         
          for(int i = 0; i <6 ; i++){   //��
               for(int j = 0; j < (int)(vc.size()/6); j++){ //��
            	   
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
//          System.out.print("���� = " + String.valueOf(vo.getTotal())+"]");
//          System.out.println();
         
 
     }

     /*
     * �й����� �˻��ϴ� ����� ���� �޼ҵ�ڱ���!
     *
     */
    
    
    
     @Override
     public String searchGradeHak(String hak) {
         
          if(vc.contains(hak)){
               int idx = vc.indexOf(hak);
               System.out.println("[ �й��� : " +vc.elementAt(vc.indexOf(hak)) + "\t" +
                         "�̸��� : " +vc.elementAt(vc.indexOf(hak)+1) + "\t"
                         +"����� : " +vc.elementAt(vc.indexOf(hak)+2) + "\t"
                         +"����� : " +vc.elementAt(vc.indexOf(hak)+3) + "\t"
                         +"������ : " +vc.elementAt(vc.indexOf(hak)+4) + "\t"
                         +"������ : " +vc.elementAt(vc.indexOf(hak)+5) + " ]");
          }
          else{System.out.println("�������� �ʴ� �й��Դϴ�.");}
    
        
          return null;
     }

    


     /*
     * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
     */
    
    
     @Override
     public Vector<String> SearchGradeByName(String name) {
          if(vc.contains(name)){
               int idx = vc.indexOf(name);
               System.out.println("[ �й��� : " +vc.elementAt(vc.indexOf(name)-1) + "\t" +
                         "�̸��� : " +vc.elementAt(vc.indexOf(name)) + "\t"
                         +"����� : " +vc.elementAt(vc.indexOf(name)+1) + "\t"
                         +"����� : " +vc.elementAt(vc.indexOf(name)+2) + "\t"
                         +"������ : " +vc.elementAt(vc.indexOf(name)+3) + "\t"
                         +"������ : " +vc.elementAt(vc.indexOf(name)+4) + " ]");
          }
          else{System.out.println("�������� �ʴ� �̸��Դϴ�.");}
         
          return null;
         
         
         
         
//          Vector<String> result = new Vector<String>();
//          if (vo.toString().contains(name)){
//               result.addElement(toString() + "���� = " + String.valueOf(vo.getTotal())+"]");
//         
//              
//          }
//         
//    
//          return result;
     }

    
     /*
     �������� ������������ ���Ľ�Ű�� �޼ҵ�
    
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
                    System.out.println("[ �й��� : " +tear[0][i] + "\t" +
                              "�̸��� : " +tear[1][i] + "\t"
                              +"����� : " +tear[2][i] + "\t"
                              +"����� : " +tear[3][i] + "\t"
                              +"������ : " +tear[4][i] + "\t"
                              +"������ : " +tear[5][i] + " ]");
                   
                   
                   
               }
               else{System.out.println("��ϵ��� ���� �л��Դϴ�.");
          }
          }
         

         
          
         
          }

     /*
          �������� ��������
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
                         System.out.println("[ �й��� : " +tear[0][i] + "\t" +
                                   "�̸��� : " +tear[1][i] + "\t"
                                   +"����� : " +tear[2][i] + "\t"
                                   +"����� : " +tear[3][i] + "\t"
                                   +"������ : " +tear[4][i] + "\t"
                                   +"������ : " +tear[5][i] + " ]");
                        
                        
                        
                    }
                    else{System.out.println("��ϵ��� ���� �л��Դϴ�.");
               }
               }

              
    
              
              
              
              
              
        
          }
         
}
