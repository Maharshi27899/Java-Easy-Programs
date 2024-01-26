class Palindrone{
	public static void main(String[] args) {
		{
			int n=141;
			int r;
			int rev=0;
			int t;
			t=n;
			while(n!=0)
			{
				r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			if(rev==t)
				System.out.println("The Number is a Palindrone");
			else 
				System.out.println("The Number is not a Pallindrone");
		}
	}
}