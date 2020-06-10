package calculator;

/**
 *
 * @author Nivedita Hari
 */
public class Sum {
    public int total(int[] nums)
	{
		int sum=0;
		for(int num:nums)
			sum +=num;
		return sum;
	}
    
}
