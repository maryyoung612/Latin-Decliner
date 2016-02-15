public class Word
	{
	private String translation;
	private String latinWord1;
	private String latinWord2;
	private String delNum;
	private String gender;
	public Word(String lw, String lw2, String t, String dn, String g)
	 {
	 latinWord1=lw;
	 latinWord2=lw2;
	 translation=t;
	 delNum=dn;
	 gender=g;
	 }
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDelNum() {
		return delNum;
	}
	public void setDelNum(String delNum) {
		this.delNum = delNum;
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
	@Override
	public String toString() 
		{
		return latinWord1 +", "+ latinWord2+", "+ gender+", "+ delNum+" - translation: " + translation ;
		}
	}