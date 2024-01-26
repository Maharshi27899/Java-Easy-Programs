class Armstrong{
	public static void main(String[] args) {
		int c;
		int n=135;
		int r;
		int s=0;
		int t;
		t=n;
		c=countDigit(n);
		while(n!=0)
		{
			r=n%10;
			s=s+pow(r,c);
			n=n/10;
		}
		if(t==s)
			System.out.println(t+"is an armstrong Number");
		else 
			System.out.println(t+"is not an armstrong number");
	}
	public static int countDigit(int n) {
		
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;

	}
	public static int pow(int n,int p) {
		
		
		int i,s=1;
		for(i=1;i<=p;i++)
		{
			s=s*n;

		}
		return s;
	}
	
}