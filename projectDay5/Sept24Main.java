package projectDay5;

public class Sept24Main {
	public void printInOrder(String a, String b, String c) {
		int n1 = Character.toUpperCase(a.charAt(0));
		int n2 = Character.toUpperCase(b.charAt(0));
		int n3 = Character.toUpperCase(c.charAt(0));
		
		if(n1 < n2 && n1 < n3 && n2 < n3) {
			System.out.println(a+b+c);
		}
		else if(n1 < n2 && n1 < n3 && n3 < n2) {
			System.out.println(a+c+b);
		}
		else if(n2 < n1 && n2 < n3 && n1 < n3) {
			System.out.println(b+a+c);
		}
		else if(n2 < n1 && n2 < n3 && n3 < n1) {
			System.out.println(b+c+a);
		}
		else if(n3 < n1 && n3 < n2 && n1 < n2) {
			System.out.println(c+a+b);
		}
		else {
			System.out.println(c+b+a);
		}
	}
	public void numsInOrder(int n1, int n2, int n3) {
		if(n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println(n1+" "+n2+" "+n3);
		}
		else if(n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println(n1+" "+n3+" "+n2);
		}
		else if(n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println(n2+" "+n1+" "+n3);
		}
		else if(n2 > n1 && n2 > n3 && n3 > n1) {
			System.out.println(n2+" "+n3+" "+n1);
		}
		else if(n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println(n3+" "+n1+" "+n2);
		}
		else {
			System.out.println(n3+" "+n2+" "+n1);
	}
}
	public void numsInOne (int n1, int n2, int n3) {
		if(n1 > n2 && n1 > n3) {
			if(n2 > n3) {
				System.out.println(n1+" "+n2+" "+n3);
			}else {
				System.out.println(n1+" "+n3+" "+n2);
			}
		}
		else if(n2 > n1 && n2 > n3) {
			if (n1 > n3) {
				System.out.println(n2+" "+n1+" "+n3);
			}else {
				System.out.println(n2+" "+n3+" "+n1);
			}
		}
		else  { // n3>n1 && n3>n2
			if(n1 > n2) {
				System.out.println(n3+" "+n1+" "+n2);
			}else {
				System.out.println(n3+" "+n2+" "+n1);
			}
		}
	}
	public void nestedPrint(String a, String b, String c) {
		int n1 = Character.toUpperCase(a.charAt(0));
		int n2 = Character.toUpperCase(b.charAt(0));
		int n3 = Character.toUpperCase(c.charAt(0));
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(a);
			if(n2>n3) {
				System.out.println(b);
				System.out.println(c);
			}
		}
	}
	public String calculator(int a, int b, String m) {
		double d = a;
		double e = b;
		if(m.equals("+")) {
			double c = d+e;
			return a+" + "+b+" = "+c;
		}
		else if (m.equals("-")) {
			double c = d-e;
			return a+" - "+b+" = "+""+c;
		}
		else if (m.equals("*")) {
			double c = d*e;
			return a+" * "+b+" = "+c;
		}
		else {
			double c = d/e;
			return a+" / "+b+" = "+c;
		}
}
	public String switchCalc(int a, int b, String m) {
		double c = a;
		double d = b;
		String op;
		
		switch(m) {
		case "+":
			double e = c+d;
			op = a+" + "+b+" = "+c;
			break;
		case "-":
			e = c-d;
			op = a+" - "+b+" = "+""+e;
			break;
		case "*":
			e = c*d;
			op = a+" * "+b+" = "+c;
			break;
		case "/":
			e = c/d;
			op = a+" / "+b+" = "+c;
			break;
		default:
			return "Quick Maffs";
		}
		return op;
		
	}
	public String makeAllUpperCase(String str) {
		return str.toUpperCase();
	}
	public String makeFirstAndLastSmall(String str) {
		str = str.toUpperCase();
		
		String w1 = str.substring(0,str.indexOf(" "));
		int space = str.indexOf(" ");
		str = str.substring(space+1);
		
		String w2 = str.substring(0,str.indexOf(" "));
		space = str.indexOf(" ");
		str = str.substring(space+1);
		
		String w3 = str.substring(0,str.indexOf(" "));
		space = str.indexOf(" ");
		String w4 = str.substring(space+1);
		
		if (w1.length() < 3 && w2.length() < 3 && w3.length() < 3 && w4.length() < 3) {
			
			if(w1.length() >= 1) {
				return w1.substring(0,1).toLowerCase()+w1.substring(1,w1.length()-1)+w1.substring(w1.length()-1).toLowerCase()+
						" "+w2+" "+w3+" "+w4;
			}else if(w2.length() >= 3) {
				return w1+
						" "+w2.substring(0,1).toLowerCase()+w2.substring(1,w2.length()-1)+w2.substring(w2.length()-1).toLowerCase()+
						" "+w3+
						" "+w4;
			}else if(w3.length() >= 3) {
				return w1+
						" "+w2+
						" "+w3.substring(0,1).toLowerCase()+w3.substring(1,w3.length()-1)+w3.substring(w3.length()-1).toLowerCase()+
						" "+w4;
			}else if(w4.length() < 3) {
				return w1+
						" "+w2+
						" "+w3+
						" "+w4.substring(0,1).toLowerCase()+w4.substring(1,w4.length()-1)+w4.substring(w4.length()-1).toLowerCase();
			}else {
				return w1+" "+w2+" "+w3+" "+w4;
			}
			}
		else {
			return w1.substring(0,1).toLowerCase()+w1.substring(1,w1.length()-1)+w1.substring(w1.length()-1).toLowerCase()+
					" "+w2.substring(0,1).toLowerCase()+w2.substring(1,w2.length()-1)+w2.substring(w2.length()-1).toLowerCase()+
					" "+w3.substring(0,1).toLowerCase()+w3.substring(1,w3.length()-1)+w3.substring(w3.length()-1).toLowerCase()+
					" "+w4.substring(0,1).toLowerCase()+w4.substring(1,w4.length()-1)+w4.substring(w4.length()-1).toLowerCase();
		}

	}
		
}

