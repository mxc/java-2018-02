package za.co.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {
		int [] a = { 10,12,16,1,77,3,84,2,5 };
		int [] b = new int [10];
		for(int i = 0; i<b.length;i++) {
			b[i]=i;
		}
		String arr[]= {"hello","test"};
		LocalDate dates[] = {
				LocalDate.of(2018,Month.JANUARY,18),
				LocalDate.of(2018,Month.FEBRUARY,23)
		};
		
		LocalDate dates2[] = new LocalDate[10];
		dates2[4] = LocalDate.of(2018,Month.JANUARY,18);
		dates2[0] = LocalDate.of(2014,Month.FEBRUARY,18);
	
		System.out.println(dates[0]);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int aa [][]= {
				{10,12,13,14},
				{20,22,23,24}
		};
		int aaa [][][] = {
				{
					{1,2,3,4},
					{1,2,3,4}
				},{
					{1,2,5,6,7},
					{4,5,6,7,8,9,10}
				}
		};
		
		String stra[][] = {
				{"8:00 - breakfast","9:00 - Beach"},
				{"8:00 = run","9:00 - polo"}
		};
		
		System.out.println(stra[1][1]);
		
	}
	

}
