package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
  Meeting Rooms: https://www.lintcode.com/problem/meeting-rooms/description
  Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), 
  determine if a person could attend all meetings.
  
 1. Input: intervals = [(0,30),(5,10),(15,20)]
   Output: false
  
 2. Input: intervals = [(5,8),(9,15)]
    Output: true
 
 */

  class intervals{
	int start;
	int end;
	
	intervals(int start,int end)
	{
		this.start = start;
		this.end = end;
	}
	
}
 
public class OverlappingIntervals {
	
	static boolean findOverlapping(List<intervals> list)
	{
		// Sort the list with start values, if start of next element is less than end of previous element then break;
		
		int endValue = Integer.MIN_VALUE;
		Collections.sort(list, (a,b) -> a.start- b.start);
		
		for(intervals e : list)
		{
			if(e.start < endValue)
			{
				return false;
			}
			
			endValue = e.end;
		}	
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<intervals> list = new ArrayList<>();
    Scanner kb = new Scanner(System.in);
    
	for (int i = 0; i < 3; i++)
	{
		int start = kb.nextInt();
		int end = kb.nextInt();
		
		intervals temp = new intervals(start,end);
		list.add(temp);
	}
	
	for(intervals e : list)
	{
		System.out.println(e.start +" "+ e.end);
	}
	
    System.out.println(findOverlapping(list));

  }
}
