package week2.task1;

public class Task1 {
    public static int gcd(int a, int b) {
	a=Math.abs(a);
	b=Math.abs(b);
        // TODO: Tính ước chung lớn nhất của 2 số a, b
	while (a!=b){
		if(a>b) a=a-b;
		else if(a<b) b=b-a;
	}

	return a;

    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
	
        if(n==0) return 0;
	else if(n==1) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
