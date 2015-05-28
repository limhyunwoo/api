package api.util.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
 * java.utilArrays. 의 메소드인
 * sort 는 정렬기능을 한다.
 * 
 */

public class SortDemo {
	Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getAscSort1(int [] arr){
		int temp = 0;
		for(int i =0; i <arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k: arr){
			vec.addElement(k);
			
		}
		return vec;
	}
	
	public Vector<Integer>getAscSort2(int[]arr){
		Arrays.sort(arr);
		for (int k : arr){
			vec.addElement(k);
		}
		return vec;
		
	}
	public static void main(String[] args) {
		SortDemo util = new SortDemo();
		SortDemo util2 = new SortDemo();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int[] arr = {8,5,9,4,1,0};
		list1 = util.getAscSort1(arr);
		list2 = util2.getAscSort2(arr);
		System.out.println("스왑알고리즘을 사용한 오름차순 정렬 : " + list1.toString());
		System.out.println("Arrays.sort() 사용한 오름차순 정렬 : " + list2.toString());
		
	}
	
	

}
