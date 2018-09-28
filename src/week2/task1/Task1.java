package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
         for(int i=0;a!=b;i++)
	   {
		if(a>b) a=a-b;
		else b=b-a;
	   }

	   return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
      int ar [] = new int [n];
        ar[0]=0;
        ar[1]=1;
        if(n==0) return ar[0];
	if(n==1) return ar[1];
	else
        {
            for(int i=2; i<=n-1; i++)
            {
            ar[i]=ar[i-1]+ar[i-2];
            }
            int m=ar[n-1];
            return m;
	}
    }
}
