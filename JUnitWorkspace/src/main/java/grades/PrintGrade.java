package grades;

public class PrintGrade {
	public String print(int grade)
	{
		if(grade > 90)
			return "Congratulation! You got A!";
		else if(grade > 80)
			return "Good Job, You received B";
		else if(grade > 70)
			return "Keep it up, You got C";
		else
			return "Work Hard";
	}

}
