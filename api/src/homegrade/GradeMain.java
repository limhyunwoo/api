package homegrade;


	import java. util. Scanner;

	public class GradeMain {
	            
	             public static void main( String[] args ) {
	                        
	                        
	                         GradeService ss= new GradeServiceImpl();
	                         Scanner scanner = new Scanner (System .in);
//	                         System. out.println ("1.���� �Է��ϱ� 2.��ü ���� ��� 3.�й����� �˻� 4.�̸����� �˻� 5.�������� �������� 6.�������� �������� 7.����" );
	                         String hak = null, name = null;
	                         int kor,eng ,math;
	                         int num = 0;
	                         while(true){if(num==7){break;}
	                         System. out.println ("1.���� �Է��ϱ� 2.��ü ���� ��� 3.�й����� �˻� 4.�̸����� �˻� 5.�������� �������� 6.�������� �������� 7.����" );
	                         num = scanner .nextInt ();
	                         
	                         switch (num) {
	                        
	                         case 1: 
	                                     System. out.println ("�й��� �Է��� �ּ���" );   hak = scanner.next() ;
	                                     System. out.println ("�̸��� �Է��� �ּ���." );   name = scanner.next() ;
	                                     System. out.println ("���������� �Է��� �ּ���." );   kor = scanner.nextInt() ;
	                                     System. out.println ("���������� �Է��� �ּ���." );   eng = scanner.nextInt() ;
	                                     System. out.println ("���������� �Է��� �ּ���." );   math = scanner.nextInt() ;
	                                    ss .Input (hak ,name ,kor ,eng ,math );
	                                    
	                                    break;
	                                     
	                                    
	                         case 2:     ss .print ();    break;
	                        
	                         case 3:  System.out.println("�˻��Ͻ� �й��� �Է��ϼ���."); hak = scanner .next(); ss.searchGradeHak(hak);   break;
	                        
	                         case 4:  System.out.println("�˻��Ͻ� �̸��� �Է��ϼ���."); name = scanner .next(); ss.SearchGradeByName(name);   break;
	                        
	                         case 5:  ss.descGradeTotal();   break;
	                        
	                         case 6:  ss.ascGradeTotal ();   break;
	                        
	                         case 7: System. out.println ("��ȸ�� �����մϴ�." ); break;
	                        
	                        

	                         default:
	                                     break;
	                         }
	                         
	                         }
	                        
	                        
	             }}  
	                        
//	  
	  
