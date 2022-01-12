/*
 * https://www.hackerearth.com/problem/algorithm/time-ago-4a75f1d1-796bce68/description/
 
 */



package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time_Difference {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String time = "23:05:38";
		
		int hh = (time.charAt(0) - '0')*10 + time.charAt(1) - '0';
		int mm = (time.charAt(3) - '0')*10 + time.charAt(4) - '0';
		int ss = (time.charAt(6) - '0')*10 + time.charAt(7) - '0';
		
		
	//	int seconds = hh* 3600 + mm*60 + ss;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0)
		{
			String input = br.readLine();
			int h = (input.charAt(0) - '0')*10 + input.charAt(1) - '0';
			int m = (input.charAt(3) - '0')*10 + input.charAt(4) - '0';
			int s = (input.charAt(6) - '0')*10 + input.charAt(7) - '0';
			
		
			int seconds_input = (hh-h)* 3600 + (mm-m)*60 + ss-s;
			
			int hh_out = seconds_input / 3600;
			int mm_out = seconds_input / 60;
			int ss_out = seconds_input ;
			
			if(hh_out> 0)
			{
				if(hh_out==1)
				{
					System.out.println(hh_out+" hour ago");
				}
				else
				{
					System.out.println(hh_out+" hours ago");
				}
			}
			
			else if(mm_out>0)
			{ 
				if(mm_out==1)
				{
					System.out.println(mm_out+" minute ago");
				}
				
				else
				{

					System.out.println(mm_out+" minutes ago");
				}
			}
			
			else if(ss_out>0)
			{
				if(ss_out==1)
				{
					System.out.println(ss_out+" second ago");
				}
				
				else
				{

					System.out.println(ss_out+" seconds ago");
				}	
			}
			
			else
			{
				System.out.println("now");
			}
					
		}
	}

}
