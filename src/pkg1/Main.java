package pkg1;

import java.util.Scanner;

public class Main {


	public String solution(String s) {
		String answer = "NO";
		
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(s).reverse().toString();
		
		if(s.equals(tmp)) answer = "YES";
		 
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		System.out.println(T.solution(str));
	}

}
