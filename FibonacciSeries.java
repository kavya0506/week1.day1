package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
			System.out.println(a);
		for(int i=1;i<11;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
		
	}

	}


