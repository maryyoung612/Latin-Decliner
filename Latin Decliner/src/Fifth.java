public class Fifth extends Declension
	{
	Fifth()
		{
		name="fifth";
		for(int i=0; i<Runner.input.length();i++)
			{
			ending=Runner.input.substring(0,i)+Runner.input.substring(i-2);
			}
		
		}
	}