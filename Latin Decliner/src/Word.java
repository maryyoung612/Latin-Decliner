public class Word
	{
	private String translation;
	private String latinWord1;
	private String latinWord2;
	public Word(String lw, String lw2, String t)
	 {
	 latinWord1=lw;
	 latinWord2=lw2;
	 translation=t;
	 }
	public String getLatinWord2()
		{
			return latinWord2;
		}
	public void setLatinWord2(String latinWord2)
		{
			this.latinWord2 = latinWord2;
		}
	public String getTranslation()
		{
			return translation;
		}
	public void setTranslation(String translation)
		{
			this.translation = translation;
		}
	public String getLatinWord1()
		{
			return latinWord1;
		}
	public void setLatinWord1(String latinWord1)
		{
			this.latinWord1 = latinWord1;
		}
	}