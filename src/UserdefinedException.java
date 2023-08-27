class InvalidSlimException extends Exception 
{
	InvalidSlimException(String s)
	{
		System.out.println(s);
	}
}
public class UserdefinedException {

	public static void main(String[] args) {
		try
		{
			check(120);
		}
		catch (InvalidSlimException e)
		{
			System.out.println(e);
		}
		finally
		{			
			System.out.println("Finally Block");
		}
	}

public static void check(int weight) throws InvalidSlimException
{
	if(weight>100)
	{
		throw new InvalidSlimException("This man is not Slim");
	}
	else
	{
		System.out.println("This man is Slim");
	}
}

}
