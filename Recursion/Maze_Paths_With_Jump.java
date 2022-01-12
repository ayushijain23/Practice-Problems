package Recursion;

import java.util.ArrayList;

/*
 * Maze can jump upto all positions till boundaries of both walls
 * 
 * 
 */
public class Maze_Paths_With_Jump {

	private static ArrayList<String> findPath(int sr, int sc, int dr, int dc)
	{
		
		if( sr == dr && sc == dc)
		{
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		// for horizontal paths
		ArrayList<String> res = new ArrayList<>();
		for( int ms = 1 ; ms <= dc - sc ; ms++)
		{
			ArrayList<String> hpaths = findPath(sr, sc + ms, dr, dc);
			
			for( String path : hpaths )
			{
				res.add("h"+ ms + path);
			}
		}
		
		//vertical paths
		for( int ms = 1 ; ms <= dr - sr ; ms++)
		{
			ArrayList<String> vpaths = findPath(sr + ms, sc , dr, dc);
			
			for( String path : vpaths )
			{
				res.add("v"+ ms + path);
			}
		}
		
		//diagonal paths
		for( int ms = 1 ; ms <= dc - sc && ms<= dr-sr ; ms++)
		{
			ArrayList<String> dpaths = findPath(sr + ms, sc + ms, dr, dc);
			
			for( String path : dpaths )
			{
				res.add("d"+ ms + path);
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		int row = 3;
		int col = 3;
		
		ArrayList<String> Paths = findPath(1,1,row, col);
		System.out.println(Paths);
	}

}
