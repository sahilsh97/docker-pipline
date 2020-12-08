package JavaBasics;

public class JavaBasic {

	public JavaBasic() {
		super();
		int a=0;
		int loop=3;
		for(int i=0;i<=loop;i++) {
			a=a+10;
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		new JavaBasic();
		fetchPalindromeForThisNumber(131);//Put any number
		try {
			fetchArmstrongForThisNumber(154);//Put any number(ArmStrong No=153)
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private static void fetchArmstrongForThisNumber(int no) throws Exception {
		int i=0;
		int armstrong =0;
		int check=no;
		while(no>0)
		{
			i= no%10;
			armstrong=armstrong+(i*i*i);
			no=no/10;
		}
		if(armstrong==check) {
			System.out.println(armstrong+":is an armstrong No! ");
		}
		else {
			//System.out.println(armstrong+":is not an armstrong No! ");
			throw new Exception(armstrong+":is not an armstrong No! ");
		}
		
	}

	private static void fetchPalindromeForThisNumber(int no) {
		// TODO Auto-generated method stub
		int i=0;
		int palindrome =0;
		int check=no;
		while(no>0)
		{
			i= no%10;
			palindrome=palindrome*10+i;
			no=no/10;
		}
		if(palindrome==check) {
			System.out.println(palindrome+":is Palindrome! ");
		}
		else {
			System.out.println(palindrome+":is not Palindrome! ");
		}
	}

}
