package SofjaApp;


public class NumberSystems {
	
	public int count_Numbers(String a){
		
		int b = 0 ;			
		int dc = 0;
		
		while(b != a.length()){
			
			a.substring(b);
			
			if(a.charAt(b) == '.') { dc++; }
			
			b++;
		}
		return a.length()-dc;		
		}
	
	
	public String binary_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;	
		String a = "";
	
			while(x != 0){
			
	              m = x%2;
	              x = x/2;			 
	              a = String.valueOf(m+a);
	
	              c++;
			
	              if(c == 4){ 
	            	  
	            	  String p = ".";				
	              	         a = String.valueOf(p+a);
	                         c = c-4;	
	              }	
			}
	
			count_Numbers(a);
	           
	        if(a.charAt(0) == '.'){ return a.replaceFirst(".", ""); } 
	                                           
	        else                  { return a; }
	}


	public String ternary_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x%3;
			x = x/3;			
			a = String.valueOf(m+a);
			
			c++;
			if(c == 4){ 
				
				String p = ".";
				       a = String.valueOf(p+a);
				       c = c - 4;
			}
			
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
		
		}
	
	public String quaternary_to_decimal(long x){
		
		long m = 0;
		int c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x%4;
			x = x/4;
			a = String.valueOf(m+a);
			
			c++;
			
			if(c == 4){
				
				String p = ".";			
				       a = String.valueOf(p+a);
				       c = c - 4;
			}
		
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
	}
	
	public String quinary_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x%5;
			x = x/5;
			
			a = String.valueOf(m+a);
			c++;
			
			if(c == 4){
				
				String p = ".";
				
				a = String.valueOf(p+a);
				
				c = c - 4;
			}
		
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
	}
	
	
	public String senary_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x%6;
			x = x/6;
			
			a = String.valueOf(m+a);
			c++;
			
			if(c == 4){
				
				String p = ".";
				
				       a = String.valueOf(p+a);
				
				       c = c - 4;
			}
		
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
	}
	
	
	
	public String septenary_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x%7;
			x = x/7;
			
			a = String.valueOf(m+a);
			c++;
			
			if(c == 4){
				
				String p = ".";
				
				       a = String.valueOf(p+a);
				
				       c = c - 4;
			}
		
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
	}
	
	
	public String octal_to_decimal(long x){
		
		long m = 0;
		int c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x%8;
			x = x/8;
			
			a = String.valueOf(m+a);
			c++;
			
			if(c == 4){
				
				String p = ".";
				
				       a = String.valueOf(p+a);
				
				       c = c - 4;
			}
		
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
	}
	
	
	public String nonary_to_decimal(long x){
		
		long m = 0;
		int c = 0;
		String a = "";
		
		while(x !=0 ){
			
			m = x%9;
			x = x/9;
			
			a = String.valueOf(m+a);
			c++;
			
			if(c == 4){
				
				String p = ".";
				
				       a = String.valueOf(p+a);
				
				       c = c - 4;
			}
		
		}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.'){ return a.replaceFirst(".", "");}
		
		else 				  { return a; }
	}
	
	public String decimal_to_decimal(long x){
		
		long m = 0;
		
		String a = "";
		
		while(x != 0){
			
			m = x%10;
			x = x/10;
			
			a = String.valueOf(m+a);
			
		}
		
		count_Numbers(a);
		
		return a;
	}
	
	public String undecimal_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;
		String a = "";
		
		while(x != 0){
			
			m = x;
			
			if(m%11 == 10){
				
				a = String.valueOf("A"+a);				
				m = x%11;				
				x = x/11;
			}
			
			else {	m = x%11;		
					x = x/11;				
					a = String.valueOf(m+a);}
			
			c++;
			
			if(c == 4){
				
				String p = ".";				
				       a = String.valueOf(p+a);
				       c = c - 4;
			}
			
			}
		
		count_Numbers(a);
		
		if(a.charAt(0) == '.') { return a.replaceFirst(".", ""); }
		
		else                   { return a; }
	}
	
	
	public String duodecimal_to_decimal(long x){
		
		long   m = 0;
		int    c = 0;
		
		String a ="";
		
		while(x != 0){
			
			m = x;
			
			if(m%12 == 10){
				
				m = x%12;				
				x = x/12;				
				a = String.valueOf("A"+a);
				
			}
			
			else if(m%12 == 11){
				
				m = x%12;				
				x = x/12;				
				a = String.valueOf("B"+a);
				
			} 
			
			else {	m = x%12;
					x = x/12;
				
					a = String.valueOf(m+a);
					
				 }
			
			c++;
			if(c == 4){
				
				String p = ".";
				a = String.valueOf(p+a);
				
				c = c - 4;
				
			}
			
		}
		
		if(a.charAt(0) == '.'){
			
			return a.replaceFirst(".", "");
			
		}
		
		count_Numbers(a);
		
		return a;
		
	}
	
	
	
	public String tridecimal_to_decimal(long x){
		
		long m = 0;
		int c = 0;
		
		String a ="";
		
		while(x != 0){
			
			m = x;
			
			if(m%13 == 10){
				
				m = x%13;
				
				x = x/13;
				
				a = String.valueOf("A"+a);
				
			}
			
			else if(m%13 == 11){
				
				m = x%13;
				
				x = x/13;
				
				a = String.valueOf("B"+a);
				
			}
			
			else if(m%13 == 12){
				
				m = x%13;
				
				x = x/13;
				
				a = String.valueOf("C"+a);
				
			} 
			
			else {	m = x%13;
					x = x/13;
				
					a = String.valueOf(m+a);
					
				 }
			
			c++;
			if(c == 4){
				
				String p = ".";
				a = String.valueOf(p+a);
				
				c = c - 4;
				
			}
			
		}
		
		if(a.charAt(0) == '.'){
			
			return a.replaceFirst(".", "");
			
		}
		
		count_Numbers(a);
		
		return a;
		
	}
	
	
public String tetradecimal_to_decimal(long x){
		
		long m = 0;
		int c = 0;
		
		String a ="";
		
		while(x != 0){
			
			m = x;
			
			if(m%14 == 10){
				
				m = x%14;
				
				x = x/14;
				
				a = String.valueOf("A"+a);
				
			}
			
			else if(m%14 == 11){
				
				m = x%14;
				
				x = x/14;
				
				a = String.valueOf("B"+a);
				
			}
			
			else if(m%14 == 12){
				
				m = x%14;
				
				x = x/14;
				
				a = String.valueOf("C"+a);
				
			}
			
			else if(m%14 == 13){
				
				m = x%14;
				
				x = x/14;
				
				a = String.valueOf("D"+a);
				
			} 
			
			else {	m = x%14;
					x = x/14;
				
					a = String.valueOf(m+a);
					
				 }
			
			c++;
			if(c == 4){
				
				String p = ".";
				a = String.valueOf(p+a);
				
				c = c - 4;
				
			}
			
		}
		
		if(a.charAt(0) == '.'){
			
			return a.replaceFirst(".", "");
			
		}
		
		count_Numbers(a);
		
		return a;
		
	}
	
	public String pentadecimal_to_decimal(long x){
	
	long m = 0;
	int c = 0;
	
	String a ="";
	
	while(x != 0){
		
		m = x;
		
		if(m%15 == 10){
			
			m = x%15;
			
			x = x/15;
			
			a = String.valueOf("A"+a);
			
		}
		
		else if(m%15 == 11){
			
			m = x%15;
			
			x = x/15;
			
			a = String.valueOf("B"+a);
			
		}
		
		else if(m%15 == 12){
			
			m = x%15;
			
			x = x/15;
			
			a = String.valueOf("C"+a);
			
		}
		
		else if(m%15 == 13){
			
			m = x%15;
			
			x = x/15;
			
			a = String.valueOf("D"+a);
			
		}
		
		else if(m%15 == 14){
			
			m = x%15;
			
			x = x/15;
			
			a = String.valueOf("E"+a);
			
		} 
		
		else {	m = x%15;
				x = x/15;
			
				a = String.valueOf(m+a);
				
			 }
		
		c++;
		if(c == 4){
			
			String p = ".";
			a = String.valueOf(p+a);
			
			c = c - 4;
			
		}
		
	}
	
	if(a.charAt(0) == '.'){
		
		return a.replaceFirst(".", "");
		
	}
	
	count_Numbers(a);
	
	return a;
	
}
	
	
	public String hexadecimal_to_decimal(long x){
		
		long m = 0;
		int c = 0;
		
		String a ="";
		
		while(x != 0){
			
			m = x;
			
			if(m%16 == 10){
				
				m = x%16;
				
				x = x/16;
				
				a = String.valueOf("A"+a);
				
				
				
			}
			
			else if(m%16 == 11){
				
				m = x%16;
				
				x = x/16;
				
				a = String.valueOf("B"+a);
				
			}
			
			else if(m%16 == 12){
				
				m = x%16;
				
				x = x/16;
				
				a = String.valueOf("C"+a);
				
			}
			
			else if(m%16 == 13){
				
				m = x%16;
				
				x = x/16;
				
				a = String.valueOf("D"+a);
				
			}
			
			else if(m%16 == 14){
				
				m = x%16;
				
				x = x/16;
				
				a = String.valueOf("E"+a);
				
			}
			
			else if(m%16 == 15){
				
				m = x%16;
				
				x = x/16;
				
				a = String.valueOf("F"+a);
			
			}
			
			else {	m = x%16;
					x = x/16;
				
					a = String.valueOf(m+a);
					
				 }
			
			c++;
			if(c == 4){
				
				String p = ".";
				a = String.valueOf(p+a);
				
				c = c - 4;
				
			}
			
		}
		
		if(a.charAt(0) == '.'){
			
			return a.replaceFirst(".", "");
			
		}
		
		count_Numbers(a);
		
		return a;
		
	}
	
	
	//How does it works 2 start.
           
	public String HDW2 (long n){
		
		String a [];
		String m [];	
		String l [];
		
		long b  = n;		
		long h  = n;
		int  ch = 0;
		
		String v = "";			
		String c = "";
		String g = "";
			
		while(h != 0){
			h = h/2;	
			ch++;	
		}
		
		int i   = 0;
		int ii  = 0;
		int iii = 0;
		
		a = new String[ch++];
		m = new String[ch++];
		l = new String[ch++];
		
		while(b != 0){

			if(b%2 != 0 ){					
				
				   v = String.valueOf(b);			
				a[i] = v;
				i++;
				
				    c = String.valueOf(" : 2"  + " = " + b/2+".5  ");		
				m[ii] = c;
				ii++;
		
				     g = String.valueOf("| Rest = "  + "0.5*2" + " = 1");
				l[iii] = g;
				
				iii++;			
									
				b = (b/2);        						
			}

			if(b==0){				
				break;
			}

			if(b%2 == 0){				
				
				v = String.valueOf(b);
				a[i] = v;
				i++;
				
				c = String.valueOf(" : 2" + " = " + b/2+"    ");
				m[ii] = c;
				ii++;
				
				g = String.valueOf("| Rest = " + "0.0*2" + " = 0");
				l[iii] = g;
				iii++;
				
				b = b/2;	           						
			}		
			if(b==0){				
				break;
			}
			
		}
		
		return literal_Depiction1(a, m, l);
	}

         //How does it works 2 end.

    //How does it works 3 starts
	
public String HDW3 (long n){
		
		String a [];
		String m [];	
		String l [];
		
		long b  = n;		
		long h  = n;
		int  ch = 0;
		
		String v = "";			
		String c = "";
		String g = "";
			
		while(h != 0){
			h = h/3;	
			ch++;	
		}
		
		int i   = 0;
		int ii  = 0;
		int iii = 0;
		
		a = new String[ch++];
		m = new String[ch++];
		l = new String[ch++];
		
		while(b != 0){

			if(b%3 == 0 ){					
				
				   v = String.valueOf(b);			
				a[i] = v;
				i++;
				
				    c = String.valueOf(" : 3"  + " = " + b/3+".00  ");		
				m[ii] = c;
				ii++;
		
				     g = String.valueOf("| Rest = "  + "0.00*3" + " = 0");
				l[iii] = g;
				
				iii++;			
									
				b = (b/3);        						
			}

			if(b==0){				
				break;
			}

			if(b%3 == 1){				
				
				v = String.valueOf(b);
				a[i] = v;
				i++;
				
				c = String.valueOf(" : 3" + " = " + b/3+".33  ");
				m[ii] = c;
				ii++;
				
				g = String.valueOf("| Rest = " + "0.33*3" + " \u2248 1");
				l[iii] = g;
				iii++;
				
				b = b/3;	           						
			}
			
			if(b%3 == 2){				
				
				v = String.valueOf(b);
				a[i] = v;
				i++;
				
				c = String.valueOf(" : 3" + " = " + b/3+".66  ");
				m[ii] = c;
				ii++;
				
				g = String.valueOf("| Rest = " + "0.66*3" + " \u2248 2");
				l[iii] = g;
				iii++;
				
				b = b/3;	           						
			}
			
			
			
			if(b==0){				
				break;
			}
			
		}
		
		return literal_Depiction1(a, m, l);
	}
	
	
	//How does it works 3 ends 

	//How does it works 4 starts

public String HDW4 (long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/4;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%4 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 4"  + " = " + b/4+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*4" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/4);        						
		}

		if(b==0){				
			break;
		}

		if(b%4 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 4" + " = " + b/4+".25  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.25*4" + " = 1");
			l[iii] = g;
			iii++;
			
			b = b/4;	           						
		}
		
		if(b%4 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 4" + " = " + b/4+".50  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.50*4" + " = 2");
			l[iii] = g;
			iii++;
			
			b = b/4;	           						
		}
		
		if(b%4 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 4" + " = " + b/4+".75  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.75*4" + " = 3");
			l[iii] = g;
			iii++;
			
			b = b/4;	           						
		}
		
		
		if(b==0){				
			break;
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 4 ends



	//How does it works 5 ends

public String HDW5 (long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/5;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%5 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 5"  + " = " + b/5+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*5" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/5);        						
		}

		if(b==0){				
			break;
		}

		if(b%5 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 5" + " = " + b/5+".20  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.20*5" + " = 1");
			l[iii] = g;
			iii++;
			
			b = b/5;	           						
		}
		
		if(b%5 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 5" + " = " + b/5+".40  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.40*5" + " = 2");
			l[iii] = g;
			iii++;
			
			b = b/5;	           						
		}
		
		if(b%5 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 5" + " = " + b/5+".60  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.60*5" + " = 3");
			l[iii] = g;
			iii++;
			
			b = b/5;	           						
		}
		
		if(b%5 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 5" + " = " + b/5+".80  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.80*5" + " = 4");
			l[iii] = g;
			iii++;
			
			b = b/5;	           						
		}
		
		
		if(b==0){				
			break;
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 5 ends


	//How does it works 6 starts

public String HDW6(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/6;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%6 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 6"  + " = " + b/6+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*6" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/6);        						
		}

		if(b==0){				
			break;
		}

		if(b%6 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 6" + " = " + b/6+".16  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.16*6" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/6;	           						
		}
		
		if(b%6 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 6" + " = " + b/6+".33  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.33*6" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/6;	           						
		}
		
		if(b%6 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 6" + " = " + b/6+".50  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.50*6" + " = 3");
			l[iii] = g;
			iii++;
			
			b = b/6;	           						
		}
		
		if(b%6 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 6" + " = " + b/6+".66  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.66*6" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/6;	           						
		}
		
		if(b%6 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 6" + " = " + b/6+".83  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.83*6" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/6;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 6 ends


	//How does it works 7 starts

public String HDW7(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/7;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%7 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 7"  + " = " + b/7+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*7" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/7);        						
		}

		if(b==0){				
			break;
		}

		if(b%7 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 7" + " = " + b/7+".14  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.14*7" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/7;	           						
		}
		
		if(b%7 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 7" + " = " + b/7+".28  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.28*7" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/7;	           						
		}
		
		if(b%7 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 7" + " = " + b/7+".42  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.42*7" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/7;	           						
		}
		
		if(b%7 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 7" + " = " + b/7+".57  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.57*7" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/7;	           						
		}
		
		if(b%7 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 7" + " = " + b/7+".71  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.71*7" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/7;	           						
		}
		
		if(b%7 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 7" + " = " + b/7+".85  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.85*7" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/7;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 7 ends
	
	
	//How does it works 8 starts

public String HDW8(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/8;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%8 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 8"  + " = " + b/8+".000  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.000*8" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/8);        						
		}

		if(b==0){				
			break;
		}

		if(b%8 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".125  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.125*8" + " = 1");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
		if(b%8 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".250  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.250*8" + " = 2");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
		if(b%8 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".375  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.375*8" + " = 3");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
		if(b%8 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".500  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.500*8" + " = 4");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
		if(b%8 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".625  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.625*8" + " = 5");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
		if(b%8 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".750  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.750*8" + " = 6");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
		if(b%8 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 8" + " = " + b/8+".875  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.875*8" + " = 7");
			l[iii] = g;
			iii++;
			
			b = b/8;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 8 ends

	//How does it works 9 starts

public String HDW9(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/9;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%9 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 9"  + " = " + b/9+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*9" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/9);        						
		}

		if(b==0){				
			break;
		}

		if(b%9 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".11  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.11*9" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".22  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.22*9" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".33  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.33*9" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".44  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.44*9" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".55  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.55*9" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".66  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.66*9" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".77  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.77*9" + " \u2248 7");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
		if(b%9 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 9" + " = " + b/9+".88  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.88*9" + " \u2248 8");
			l[iii] = g;
			iii++;
			
			b = b/9;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 9 ends

	//How does it works 11 starts

public String HDW11(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/11;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%11 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 11"  + " = " + b/11+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*11" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/11);        						
		}

		if(b==0){				
			break;
		}

		if(b%11 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".09  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.09*11" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".18  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.18*11" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".27  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.27*11" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".36  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.36*11" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".45  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.45*11" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".54  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.54*11" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".63  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.63*11" + " \u2248 7");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".72  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.72*11" + " \u2248 8");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 9){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".82  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.82*11" + " \u2248 9");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
		if(b%11 == 10){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 11" + " = " + b/11+".90  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.90*11" + " \u2248 10 = A");
			l[iii] = g;
			iii++;
			
			b = b/11;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 11 ends

	//How does it works 12 starts

public String HDW12(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/12;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%12 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 12" + " = " + b/12+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*12" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/12);        						
		}

		if(b==0){				
			break;
		}

		if(b%12 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".08  ");
			
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.08*12" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".16  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.16*12" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".25  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.25*12" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".33  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.33*12" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".41  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.41*12" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".50  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.50*12" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".58  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.58*12" + " \u2248 7");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".66  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.66*12" + " \u2248 8");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 9){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".75  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.75*12" + " \u2248 9");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 10){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".83  ");
			m[ii] = c;		   
			ii++;
			
			g = String.valueOf("| Rest = " + "0.83*12" + " \u2248 10 = A");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
		if(b%12 == 11){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 12" + " = " + b/12+".91  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.91*12" + " \u2248 12 = B");
			l[iii] = g;
			iii++;
			
			b = b/12;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 12 ends


	//How does it works 13 starts

public String HDW13(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/13;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%13 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 13" + " = " + b/13+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*13" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/13);        						
		}

		if(b==0){				
			break;
		}

		if(b%13 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".07  ");
			
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.07*13" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".15  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.15*13" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".23  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.23*13" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".30  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.30*13" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".38  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.38*13" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".46  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.46*13" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".53  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.53*13" + " \u2248 7");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".61  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.61*13" + " \u2248 8");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 9){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".69  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.69*13" + " \u2248 9");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 10){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".76  ");
			m[ii] = c;		   
			ii++;
			
			g = String.valueOf("| Rest = " + "0.76*13" + " \u2248 10 = A");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		if(b%13 == 11){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".84  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.84*13" + " \u2248 11 = B");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
		
		if(b%13 == 12){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 13" + " = " + b/13+".92  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.92*13" + " \u2248 12 = C");
			l[iii] = g;
			iii++;
			
			b = b/13;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}


	//How does it works 13 ends

	//How does it works 14 starts

public String HDW14(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/14;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%14 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 14" + " = " + b/14+".00  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.00*14" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/14);        						
		}

		if(b==0){				
			break;
		}

		if(b%14 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".07  ");
			
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.07*14" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".14  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.14*14" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".21  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.21*14" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".28  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.28*14" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".35  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.35*14" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".42  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.42*14" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".50  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.50*14" + " \u2248 7");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".57  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.57*14" + " \u2248 8");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 9){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".64  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.64*14" + " \u2248 9");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 10){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".71  ");
			m[ii] = c;		   
			ii++;
			
			g = String.valueOf("| Rest = " + "0.71*14" + " \u2248 10 = A");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 11){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".78  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.78*14" + " \u2248 11 = B");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		
		if(b%14 == 12){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".85  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.85*14" + " \u2248 12 = C");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
		if(b%14 == 13){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 14" + " = " + b/14+".92  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.92*14" + " \u2248 13 = D");
			l[iii] = g;
			iii++;
			
			b = b/14;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 14 ends


	//How does it works 15 starts

public String HDW15(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/15;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%15 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 15" + " = " + b/15+".000  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.000*15" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/15);        						
		}

		if(b==0){				
			break;
		}

		if(b%15 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".066  ");
			
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.066*15" + " \u2248 1");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".133  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.133*15" + " \u2248 2");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/16+".200  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.200*16" + " \u2248 3");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".266  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.266*15" + " \u2248 4");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".333  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.333*15" + " \u2248 5");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".400  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.400*16" + " \u2248 6");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".466  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.466*14" + " \u2248 7");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".533  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.533*15" + " \u2248 8");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 9){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".600  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.600*16" + " \u2248 9");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 10){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".667  ");
			m[ii] = c;		   
			ii++;
			
			g = String.valueOf("| Rest = " + "0.667*15" + " \u2248 10 = A");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 11){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".733  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.733*16" + " \u2248 11 = B");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		
		if(b%15 == 12){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".800  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.800*15" + " \u2248 12 = C");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 13){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/15+".866  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.866*15" + " \u2248 13 = D");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
		if(b%15 == 14){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 15" + " = " + b/16+".933  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.933*14" + " \u2248 14 = E");
			l[iii] = g;
			iii++;
			
			b = b/15;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 15 ends


	//How does it works 16 starts

public String HDW16(long n){
	
	String a [];
	String m [];	
	String l [];
	
	long b  = n;		
	long h  = n;
	int  ch = 0;
	
	String v = "";			
	String c = "";
	String g = "";
		
	while(h != 0){
		h = h/16;	
		ch++;	
	}
	
	int i   = 0;
	int ii  = 0;
	int iii = 0;
	
	a = new String[ch++];
	m = new String[ch++];
	l = new String[ch++];
	
	while(b != 0){

		if(b%16 == 0 ){					
			
			   v = String.valueOf(b);			
			a[i] = v;
			i++;
			
			    c = String.valueOf(" : 16" + " = " + b/16+".0000  ");		
			m[ii] = c;
			ii++;
	
			     g = String.valueOf("| Rest = "  + "0.0000*16" + " = 0");
			l[iii] = g;
			
			iii++;			
								
			b = (b/16);        						
		}

		if(b==0){				
			break;
		}

		if(b%16 == 1){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".0625  ");
			
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.0625*16" + " = 1");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 2){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".1250  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.1250*16" + " = 2");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 3){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".1875  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.1875*16" + " = 3");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 4){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".2500  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.2500*16" + " = 4");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 5){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".3125  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.3125*14" + " = 5");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 6){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".3750  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.3750*16" + " = 6");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 7){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".4375  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.4375*16" + " = 7");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 8){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".5000  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.5000*15" + " = 8");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 9){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".5625  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.5625*16" + " = 9");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 10){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".6250  ");
			m[ii] = c;		   
			ii++;
			
			g = String.valueOf("| Rest = " + "0.6250*16" + " = 10 = A");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 11){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".6875  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.6875*16" + " = 11 = B");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		
		if(b%16 == 12){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".7500  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.7500*14" + " = 12 = C");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 13){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".8125  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.8125*14" + " = 13 = D");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 14){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".8750  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.8750*14" + " = 14 = E");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
		if(b%16 == 15){				
			
			v = String.valueOf(b);
			a[i] = v;
			i++;
			
			c = String.valueOf(" : 16" + " = " + b/16+".9375  ");
			m[ii] = c;
			ii++;
			
			g = String.valueOf("| Rest = " + "0.9375*14" + " = 15 = F");
			l[iii] = g;
			iii++;
			
			b = b/16;	           						
		}
		
	}
	
	return literal_Depiction1(a, m, l);
}

	//How does it works 16 ends



	//How does it works Bin to dec starts

public String HDW2_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(2, cf);
		
		String a = String.valueOf(t + ", " + "2^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(2, cf++)+pow;}

		}
		
		n_length--;	
		
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW3_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(3, cf);
		
		String a = String.valueOf(t + ", " + "3^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(3, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(3, cf++) + pow;}
			
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW4_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(4, cf);
		
		String a = String.valueOf(t + ", " + "4^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(4, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(4, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(4, cf++) + pow;}
			
		}
		
		n_length--;			
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW5_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(5, cf);
		
		String a = String.valueOf(t + ", " + "5^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(5, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(5, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(5, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(5, cf++) + pow;}
			
		}
		
		n_length--;			
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW6_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(6, cf);
		
		String a = String.valueOf(t + ", " + "6^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(6, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(6, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(6, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(6, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(6, cf++) + pow;}
			
		}
		
		n_length--;			
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW7_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(7, cf);
		
		String a = String.valueOf(t + ", " + "7^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(7, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(7, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(7, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(7, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(7, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(7, cf++) + pow;}
			
		}
		
		n_length--;			
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW8_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(8, cf);
		
		String a = String.valueOf(t + ", " + "8^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(8, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(8, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(8, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(8, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(8, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(8, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(8, cf++) + pow;}
		}
		
		n_length--;			
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW9_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(9, cf);
		
		String a = String.valueOf(t + ", " + "9^" + cf);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		container_part_one  [i] = a;
		container_part_two  [i] = b;
		container_part_three[i] = c;
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(9, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(9, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(9, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(9, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(9, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(9, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(9, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(9, cf++) + pow;}
		}
		
		n_length--;		
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW11_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(11, cf);
		
		String a = String.valueOf(t + ", " + "11^" + cf);
		container_part_one  [i] = a;
	
		
		if(t.charAt(0) == 'A'){
			
			String c = String.valueOf(", + "+(10)*p);
			
			String b = String.valueOf(" = " +10+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;		
			
		} else {
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		container_part_two  [i] = b;
		
		container_part_three[i] = c;
		
		}
		
		
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(11, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(11, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(11, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(11, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(11, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(11, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(11, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(11, cf++) + pow;}
			   
 			else if(t.charAt(0) == '9') 						{pow = 9 *  MathPowInteger.power(11, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'A') 						{pow = 10 *  MathPowInteger.power(11, cf++) + pow;}
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW12_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(12, cf);
		
		String a = String.valueOf(t + ", " + "12^" + cf);
		container_part_one  [i] = a;
	
		
		if(t.charAt(0) == 'A'){
			
			String c = String.valueOf(", + "+(10)*p);
			
			String b = String.valueOf(" = " +10+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;		
			
		} else if(t.charAt(0) == 'B'){
			
			String c = String.valueOf(", + "+(11)*p);
			
			String b = String.valueOf(" = " +11+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		}
		
		else {
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		container_part_two  [i] = b;
		
		container_part_three[i] = c;
		
		}
		
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(12, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(12, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(12, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(12, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(12, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(12, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(12, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(12, cf++) + pow;}
			   
 			else if(t.charAt(0) == '9') 						{pow = 9 *  MathPowInteger.power(12, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'A') 						{pow = 10 *  MathPowInteger.power(12, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'B') 						{pow = 11 *  MathPowInteger.power(12, cf++) + pow;}
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW13_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(13, cf);
		
		String a = String.valueOf(t + ", " + "13^" + cf);
		container_part_one  [i] = a;
	
		
		if(t.charAt(0) == 'A'){
			
			String c = String.valueOf(", + "+(10)*p);
			
			String b = String.valueOf(" = " +10+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;		
			
		} else if(t.charAt(0) == 'B'){
			
			String c = String.valueOf(", + "+(11)*p);
			
			String b = String.valueOf(" = " +11+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'C'){
			
			String c = String.valueOf(", + "+(12)*p);
			
			String b = String.valueOf(" = " +12+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		}
		
		else {
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		container_part_two  [i] = b;
		
		container_part_three[i] = c;
		
		}
		
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(13, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(13, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(13, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(13, cf++) + pow;}
			   
 			else if(t.charAt(0) == '9') 						{pow = 9 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'A') 						{pow = 10 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'B') 						{pow = 11 *  MathPowInteger.power(13, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'C') 						{pow = 12 *  MathPowInteger.power(13, cf++) + pow;}
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}

public String HDW14_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(14, cf);
		
		String a = String.valueOf(t + ", " + "14^" + cf);
		
		container_part_one  [i] = a;
	
		
		if(t.charAt(0) == 'A'){
			
			String c = String.valueOf(", + "+(10)*p);
			
			String b = String.valueOf(" = " +10+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;		
			
		} else if(t.charAt(0) == 'B'){
			
			String c = String.valueOf(", + "+(11)*p);
			
			String b = String.valueOf(" = " +11+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'C'){
			
			String c = String.valueOf(", + "+(12)*p);
			
			String b = String.valueOf(" = " +12+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'D'){
			
			String c = String.valueOf(", + "+(13)*p);
			
			String b = String.valueOf(" = " +13+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		}
		
		else {
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		container_part_two  [i] = b;
		
		container_part_three[i] = c;
		
		}
		
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(14, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(14, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(14, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(14, cf++) + pow;}
			   
 			else if(t.charAt(0) == '9') 						{pow = 9 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'A') 						{pow = 10 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'B') 						{pow = 11 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'C') 						{pow = 12 *  MathPowInteger.power(14, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'D') 						{pow = 13 *  MathPowInteger.power(14, cf++) + pow;}
			
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}

public String HDW15_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(15, cf);
		
		String a = String.valueOf(t + ", " + "15^" + cf);
		
		container_part_one  [i] = a;
	
		
		if(t.charAt(0) == 'A'){
			
			String c = String.valueOf(", + "+(10)*p);
			
			String b = String.valueOf(" = " +10+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;		
			
		} else if(t.charAt(0) == 'B'){
			
			String c = String.valueOf(", + "+(11)*p);
			
			String b = String.valueOf(" = " +11+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'C'){
			
			String c = String.valueOf(", + "+(12)*p);
			
			String b = String.valueOf(" = " +12+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'D'){
			
			String c = String.valueOf(", + "+(13)*p);
			
			String b = String.valueOf(" = " +13+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'E'){
			
			String c = String.valueOf(", + "+(14)*p);
			
			String b = String.valueOf(" = " +14+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		}

		
		else {
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		container_part_two  [i] = b;
		
		container_part_three[i] = c;
		
		}
		
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(15, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(15, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(15, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(15, cf++) + pow;}
			   
 			else if(t.charAt(0) == '9') 						{pow = 9 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'A') 						{pow = 10 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'B') 						{pow = 11 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'C') 						{pow = 12 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'D') 						{pow = 13 *  MathPowInteger.power(15, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'E') 						{pow = 14 *  MathPowInteger.power(15, cf++) + pow;}
			
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public String HDW16_NS_to_dec(String n){
	
	String container_part_one   [];
	String container_part_two   [];
	String container_part_three [];
	
	int i = 0;
	
	StringBuffer  rev_n = new StringBuffer(n);        		
				  rev_n.reverse();
	
	long n_length = rev_n.length();
	int  ssleft   = 0;
	int  ssright  = 0;
	
	String t = "";
	      		
	long pow = 0;
	long cf  = 0;

	
	container_part_one   = new String[(int) n_length];
	container_part_two   = new String[(int) n_length];
	container_part_three = new String[(int) n_length];
	
	while(n_length != 0){
		
		{
		ssright = ssright+1;
		
		t = rev_n.substring( ssleft, ssright);
		
		ssleft = ssleft+1;
		}
		
		long p = MathPowInteger.power(16, cf);
		
		String a = String.valueOf(t + ", " + "16^" + cf);
		
		container_part_one  [i] = a;
	
		
		if(t.charAt(0) == 'A'){
			
			String c = String.valueOf(", + "+(10)*p);
			
			String b = String.valueOf(" = " +10+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;		
			
		} else if(t.charAt(0) == 'B'){
			
			String c = String.valueOf(", + "+(11)*p);
			
			String b = String.valueOf(" = " +11+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'C'){
			
			String c = String.valueOf(", + "+(12)*p);
			
			String b = String.valueOf(" = " +12+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'D'){
			
			String c = String.valueOf(", + "+(13)*p);
			
			String b = String.valueOf(" = " +13+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'E'){
			
			String c = String.valueOf(", + "+(14)*p);
			
			String b = String.valueOf(" = " +14+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;
			
		} else if(t.charAt(0) == 'F'){
			
			String c = String.valueOf(", + "+(15)*p);
			
			String b = String.valueOf(" = " +15+"*" + p);
			
			container_part_two  [i] = b;
			
			container_part_three[i] = c;

		}
		
		else {
		
		String c = String.valueOf(", + "+Long.parseLong(t)*p);
		
		String b = String.valueOf(" = " +t+"*" + p);
		
		container_part_two  [i] = b;
		
		container_part_three[i] = c;
		
		}
		
		i++;
		
		{
			     if(t.charAt(0) == '0') 						{cf++;}
 			
 			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(16, cf++) + pow;}

 			else if(t.charAt(0) == '2') 						{pow = 2 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == '3') 						{pow = 3 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == '4') 						{pow = 4 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == '5') 						{pow = 5 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == '6') 						{pow = 6 *  MathPowInteger.power(16, cf++) + pow;}
			
 			else if(t.charAt(0) == '7') 						{pow = 7 *  MathPowInteger.power(16, cf++) + pow;}
			
 			else if(t.charAt(0) == '8') 						{pow = 8 *  MathPowInteger.power(16, cf++) + pow;}
			   
 			else if(t.charAt(0) == '9') 						{pow = 9 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'A') 						{pow = 10 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'B') 						{pow = 11 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'C') 						{pow = 12 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'D') 						{pow = 13 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'E') 						{pow = 14 *  MathPowInteger.power(16, cf++) + pow;}
			     
 			else if(t.charAt(0) == 'F') 						{pow = 15 *  MathPowInteger.power(16, cf++) + pow;}
			
		}
		
		n_length--;	
	}	
	
    Long result = pow;
    
    String result_string = "\u03a3 "+ result.toString();
	
	return literal_Depiction2(container_part_one, container_part_two, container_part_three, result_string);	
}


public static String literal_Depiction2(String a [], String b [], String y [], String sum){
	
	int counter_index_start = 0;
	
	int counter_space_four_steps = 0;
	
	String string_storage = "";
	
	String lines = "";
	
	for(int i = 0; i < a.length ; i++){		

		
	int index_counter = counter_index_start++;

	
	while( a[a.length-1].length() != a[index_counter].length() ){
		
		a[index_counter] =	a[index_counter]+ " ";
		
	}
	
	while( b[a.length-1].length() != b[index_counter].length() ){
		
		b[index_counter] =	b[index_counter]+ " ";

	}

	while( (a[a.length-1].length() + b[a.length-1].length() + y[a.length-1].length()) != sum.length()  ){
		
		sum = " " + sum;
		
	}
	
	while( (a[a.length-1].length() + b[a.length-1].length() + y[a.length-1].length()) != lines.length()  ){
		
		lines = lines + "_";
		
	}
	
	string_storage = string_storage + (a[i] + b[index_counter] + y[index_counter]) + "\n" ;
	
	counter_space_four_steps++;
	
	if(counter_space_four_steps == 4){
		
		string_storage = string_storage + "\n" ;
		
		counter_space_four_steps = counter_space_four_steps-4;
	}
		
	}
	
	int index_counter2 = a.length-1;
	
	if(a[index_counter2].charAt(0) == '0'){
	
	while(a[index_counter2].charAt(0) == '0'){
		
		index_counter2--;
		
		if(a[index_counter2].charAt(0) == '1'){
			
			while( (a[index_counter2].length()+b[index_counter2].length()+y[index_counter2].length()) != sum.length() ){
				
				sum = " " + sum;		
			}
			
			while( sum.length() != lines.length() ){
				
				lines = lines + "_";
		    }
		 }
	  }
	
	return string_storage + lines + "\n" + sum;
	
	} 
	
	else { return string_storage + lines + "\n" +sum; }
}




	//How does it works Bin to dec ends

	public static String literal_Depiction1(String[] a, String[] m, String[] l){
	
				String n = "";
				String v = "";

				int c = 0;
				
				for( int i = 0; i < a.length; i++  ){			

					while(a[0].length() != a[i].length()){

						a[i] =  " " + a[i];

					}

					while( (m[0].length()) != m[i].length()){
	
						m[i] =  m[i]+ " ";

					}

					v = "\n" + a[i];
		
					c++;
					
					if(c == 4){ n = n + v + m[i] + l[i] + "\n";
								
								c = c - 4; } 
					
					else { n = n + v + m[i] + l[i]; }
				}

				return n;

			}	

	
            //Bin_to_dec start
            
            public static long bin_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long n_length = rev_n.length();
        		int ssleft = 0;
        		int ssright = 0;
        		
        		String t = "";
        		      		
        		long pow = 0;
        		long cf = 0;
        		
        		
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(2, cf++) + pow;}
        			
        			
        			
        			}
        			
        			n_length--;
        		}	
        		return pow;	
        	}
            
            
            public static long ternary_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		       		
        		long pow = 0;
        		long cf = 0;
        		
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(3, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(3, cf++) + pow;}
       			
        			}    		
        			
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            public static long quaternary_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		       		
        		long pow = 0;
        		long cf = 0;
        		
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring(ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        					 if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(4, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(4, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(4, cf++) + pow;}
        				 
        			}
        			
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            public static long quinary_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		        		
        		long pow = 0;
        		long cf = 0;
        		
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(5, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(5, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(5, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(5, cf++) + pow;}
             				 
			 
        			
        				 
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            public static long senary_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		       		
        		long pow = 0;
        		long cf = 0;
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(6, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(6, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(6, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(6, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(6, cf++) + pow;}
        				 
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            public static long septenary_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		       		
        		long pow = 0;
        		long cf = 0;
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        					 if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(7, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(7, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(7, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(7, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(7, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(7, cf++) + pow;}
             			
        				 
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            public static long octal_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		       		
        		long pow = 0;
        		long cf = 0;
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(8, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(8, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(8, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(8, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(8, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(8, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(8, cf++) + pow;}
             				 
        				 
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            public static long nonary_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		
        		
        		long pow = 0;
        		long cf = 0;
     
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        					 if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(9, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(9, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(9, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(9, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(9, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(9, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(9, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(9, cf++) + pow;}
        			
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            public static long undecimal_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		
        		
        		long pow = 0;
        		long cf = 0;
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(11, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(11, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '9')							{pow = 9 *  MathPowInteger.power(11, cf++) + pow;}
             			     			
             			else if((t.charAt(0) == 'A') ^ t.charAt(0) == 'a')	{pow = 10 * MathPowInteger.power(11, cf++) + pow;}
             				 
        				 
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
  
            
            public static long duodecimal_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		        		
        		long pow = 0;
        		long cf = 0;

        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				     if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(12, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '9')							{pow = 9 *  MathPowInteger.power(12, cf++) + pow;}
             			     			
             			else if((t.charAt(0) == 'A') ^ t.charAt(0) == 'a')	{pow = 10 * MathPowInteger.power(12, cf++) + pow;}
             				 
             			else if((t.charAt(0) == 'B') ^ t.charAt(0) == 'b')	{pow = 11 * MathPowInteger.power(12, cf++) + pow;}
             			
        			
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            
            public static long tridecimal_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		
        		long pow = 0;
        		long cf = 0;
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        					 if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(13, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '9')							{pow = 9 *  MathPowInteger.power(13, cf++) + pow;}
             			     			
             			else if((t.charAt(0) == 'A') ^ t.charAt(0) == 'a')	{pow = 10 * MathPowInteger.power(13, cf++) + pow;}
             				 
             			else if((t.charAt(0) == 'B') ^ t.charAt(0) == 'b')	{pow = 11 * MathPowInteger.power(13, cf++) + pow;}
             			
             			else if((t.charAt(0) == 'C') ^ t.charAt(0) == 'c')	{pow = 12 * MathPowInteger.power(13, cf++) + pow;}
        					 
        			    
        				 
        			}
        				
        			n_length--;
        		}	
        		return (pow);	
        	}
            
            
            public static long tetradecimal_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		
        		long pow = 0;
        		long cf = 0;
        	
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			{
        				 	 if(t.charAt(0) == '0') 						{cf++;}
             			
             			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(14, cf++) + pow;}
             			
             			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if(t.charAt(0) == '9')							{pow = 9 *  MathPowInteger.power(14, cf++) + pow;}
             			     			
             			else if((t.charAt(0) == 'A') ^ t.charAt(0) == 'a')	{pow = 10 * MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if((t.charAt(0) == 'B') ^ t.charAt(0) == 'b')	{pow = 11 * MathPowInteger.power(14, cf++) + pow;}
             				 
             			else if((t.charAt(0) == 'C') ^ t.charAt(0) == 'c')	{pow = 12 * MathPowInteger.power(14, cf++) + pow;}
             			
             			else if((t.charAt(0) == 'D') ^ t.charAt(0) == 'd')	{pow = 13 * MathPowInteger.power(14, cf++) + pow;}
        				 	 
        			}
        				
        			n_length--;
        		}	
        		
        		return (pow);	
        	}
            
            
            public static long pentadecimal_to_dec(String n){
        		
        		StringBuffer  rev_n = new StringBuffer(n);        		
        					  rev_n.reverse();
        		
        		long   n_length = rev_n.length();
        		int    ssleft   = 0;
        		int    ssright  = 0;
        		
        		String t        = "";
        		
        		long pow = 0;
        		long cf = 0;
        		
        		while(n_length != 0){
        			
        			{
        			ssright = ssright+1;
        			
        			t = rev_n.substring( ssleft, ssright);
        			
        			ssleft = ssleft+1;
        			}
        			
        			
        			{
        				 if(t.charAt(0) == '0') 						{cf++;}
        			
        			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(15, cf++) + pow;}
        			
        			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if(t.charAt(0) == '9')							{pow = 9 *  MathPowInteger.power(15, cf++) + pow;}
        			     			
        			else if((t.charAt(0) == 'A') ^ t.charAt(0) == 'a')	{pow = 10 * MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if((t.charAt(0) == 'B') ^ t.charAt(0) == 'b')	{pow = 11 * MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if((t.charAt(0) == 'C') ^ t.charAt(0) == 'c')	{pow = 12 * MathPowInteger.power(15, cf++) + pow;}
        				 
        			else if((t.charAt(0) == 'D') ^ t.charAt(0) == 'd')	{pow = 13 * MathPowInteger.power(15, cf++) + pow;}
        			
        			else if((t.charAt(0) == 'E') ^ t.charAt(0) == 'e')	{pow = 14 * MathPowInteger.power(15, cf++) + pow;}
        				 
        			
        				 
        			}
        				
        			n_length--;
        		}	
        		
        		return (pow);	
        	}
            
            
            public static long hexadecimal_to_dec(String n){
         		
         		StringBuffer  rev_n = new StringBuffer(n);        		
         					  rev_n.reverse();
         		
         		int    n_length = rev_n.length();
         		int    ssleft   = 0;
         		int    ssright  = 0;
         		
         		String t        = "";
         		
         		long pow = 0;
         		long cf = 0;
         		
         		
         		
         		while(n_length != 0){
         			
         			{
         			ssright = ssright+1;
         			
         			t = rev_n.substring( ssleft, ssright);
         			
         			ssleft = ssleft+1;
         			}
         			
         			{
         				     if(t.charAt(0) == '0') 						{cf++;}
            			
            			else if(t.charAt(0) == '1') 						{pow = 1 *  MathPowInteger.power(16, cf++) + pow;}
            			
            			else if(t.charAt(0) == '2')							{pow = 2 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '3')							{pow = 3 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '4')							{pow = 4 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '5')							{pow = 5 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '6')							{pow = 6 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '7')							{pow = 7 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '8')							{pow = 8 *  MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if(t.charAt(0) == '9')							{pow = 9 *  MathPowInteger.power(16, cf++) + pow;}
            			     			
            			else if((t.charAt(0) == 'A') ^ t.charAt(0) == 'a')	{pow = 10 * MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if((t.charAt(0) == 'B') ^ t.charAt(0) == 'b')	{pow = 11 * MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if((t.charAt(0) == 'C') ^ t.charAt(0) == 'c')	{pow = 12 * MathPowInteger.power(16, cf++) + pow;}
            				 
            			else if((t.charAt(0) == 'D') ^ t.charAt(0) == 'd')	{pow = 13 * MathPowInteger.power(16, cf++) + pow;}
            			
            			else if((t.charAt(0) == 'E') ^ t.charAt(0) == 'e')	{pow = 14 * MathPowInteger.power(16, cf++) + pow;}
         				
            			else if((t.charAt(0) == 'F') ^ t.charAt(0) == 'f')	{pow = 15 * MathPowInteger.power(16, cf++) + pow;}
         				
         				 
         			   
         				
         			}
         				
         			n_length--;
         		}	
         		
         		return (pow);	
         	}
            
            
		}



