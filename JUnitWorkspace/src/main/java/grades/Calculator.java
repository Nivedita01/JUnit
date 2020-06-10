package grades;

/*
 * @author Nivedita Hari
 * */

public class Calculator {
	public int total(int[] nums)
	{
		int sum=0;
		for(int num:nums)
			sum +=num;
		return sum;
	}
}