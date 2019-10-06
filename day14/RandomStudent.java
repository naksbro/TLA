package day14;

import java.util.Random;

public class RandomStudent {
	public static void main(String[] args) {
		String genOut = "";
		int c = 1;
		while(c <= 16) {
			System.out.println(getRStudent());
			genOut += getRStudent();
			if(genOut == getRStudent()) {
				continue;
			}
			c++;
		}	
	}
	
	public static String getRStudent() {
		String s1 = "Edil Aibashov";
		String s2 = "Mark Admana";
		String s3 = "Yulduz Akbirova";
		String s4 = "Ariunaa Dasj";
		String s5 = "Aizhamal Arzymatova";
		String s6 = "Selvin Asencio";
		String s7 = "Akylbek Cholurov";
		String s8 = "Frank Hernandez";
		String s9 = "Nurgazy Ibraimov";
		String s10 = "Evelyn Jorge-Vidaurre";
		String s11 = "Anna Luchenkova";
		String s12 = "Gulzhana Malikova";
		String s13 = "Rocio Rodriguez-Soto";
		String s14 = "Daniel Senzano";
		String s15 = "Job Senzano";
		String s16 = "Meerim Zhumasheva";
		
		Random r = new Random();
		String stu = "";
		int n = r.nextInt(16);
			switch(n) {
			case 1:
				stu = s1;
				break;
			case 2:
				stu = s2;
				break;	
			case 3:
				stu = s3;
				break;
			case 4:
				stu = s4;
				break;
			case 5:
				stu = s5;
				break;
			case 6:
				stu = s6;
				break;
			case 7:
				stu = s7;
				break;
			case 8:
				stu = s8;
				break;
			case 9:
				stu = s9;
				break;
			case 10:
				stu = s10;
				break;
			case 11:
				stu = s11;
				break;
			case 12:
				stu = s12;
				break;
			case 13:
				stu = s13;
				break;
			case 14:
				stu = s14;
				break;
			case 15:
				stu = s15;
				break;
			case 16:
				stu = s16;
				break;
			}
			return stu;
	}
		
}
	
	
	
