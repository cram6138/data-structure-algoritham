package test;

import java.util.Scanner;

public class MazeProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();sc.nextLine();
		int m = sc.nextInt();sc.nextLine();
		int x, y;
		int goldcount = 0;
		int[][] maze;
		if (m >= 1 && m<=100 && n>=1 && n<=100) {
			maze = new int[n][m];
			// read maze elements
			for (int i=0; i<n; i++) {
				String input = sc.nextLine();
				String[] nums = input.split(" ");
				for (int j=0; j<m; j++) {
					maze[i][j] = Integer.parseInt(nums[j]);
					if (maze[i][j] == 2) {
						goldcount++;
					}
				}
				System.out.println("loop " +(i+1));
			}
			x = sc.nextInt();
			y = sc.nextInt();
			//print(maze, n, m);
			
			
		}
	}
}
