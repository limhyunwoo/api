package homegrade;


	import java. util. Scanner;

	public class GradeMain {
	            
	             public static void main( String[] args ) {
	                        
	                        
	                         GradeService ss= new GradeServiceImpl();
	                         Scanner scanner = new Scanner (System .in);
//	                         System. out.println ("1.성적 입력하기 2.전체 성적 출력 3.학번으로 검색 4.이름으로 검색 5.종합점수 내림차순 6.종합점수 오름차순 7.종료" );
	                         String hak = null, name = null;
	                         int kor,eng ,math;
	                         int num = 0;
	                         while(true){if(num==7){break;}
	                         System. out.println ("1.성적 입력하기 2.전체 성적 출력 3.학번으로 검색 4.이름으로 검색 5.종합점수 내림차순 6.종합점수 오름차순 7.종료" );
	                         num = scanner .nextInt ();
	                         
	                         switch (num) {
	                        
	                         case 1: 
	                                     System. out.println ("학번을 입력해 주세요" );   hak = scanner.next() ;
	                                     System. out.println ("이름을 입력해 주세요." );   name = scanner.next() ;
	                                     System. out.println ("국어점수를 입력해 주세요." );   kor = scanner.nextInt() ;
	                                     System. out.println ("영어점수를 입력해 주세요." );   eng = scanner.nextInt() ;
	                                     System. out.println ("수학점수를 입력해 주세요." );   math = scanner.nextInt() ;
	                                    ss .Input (hak ,name ,kor ,eng ,math );
	                                    
	                                    break;
	                                     
	                                    
	                         case 2:     ss .print ();    break;
	                        
	                         case 3:  System.out.println("검색하실 학번을 입력하세요."); hak = scanner .next(); ss.searchGradeHak(hak);   break;
	                        
	                         case 4:  System.out.println("검색하실 이름을 입력하세요."); name = scanner .next(); ss.SearchGradeByName(name);   break;
	                        
	                         case 5:  ss.descGradeTotal();   break;
	                        
	                         case 6:  ss.ascGradeTotal ();   break;
	                        
	                         case 7: System. out.println ("조회를 종료합니다." ); break;
	                        
	                        

	                         default:
	                                     break;
	                         }
	                         
	                         }
	                        
	                        
	             }}  
	                        
//	  
	  
