public class ThrowDemo
{
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("not elgible");
		else
			System.out.println("bank account is opened");
	}
	public static void main(String args[])
	{
		validate(13);
		System.out.println("rest of the code...");
	}
}