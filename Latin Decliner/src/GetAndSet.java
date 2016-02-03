public class GetAndSet
	{
	private String translation;
	private String type;
	private String cases;
	private String root;
	public GetAndSet(String t, String ty, String c, String r)
	 {
	 translation=t;
	 type=ty;
	 cases=c;
	 root=r;
	 }
	public String getTranslation()
		{
			return translation;
		}
	public void setTranslation(String translation)
		{
			this.translation = translation;
		}
	public String getType()
		{
			return type;
		}
	public void setType(String type)
		{
			this.type = type;
		}
	public String getCases()
		{
			return cases;
		}
	public void setCases(String cases)
		{
			this.cases = cases;
		}
	public String getRoot()
		{
			return root;
		}
	public void setRoot(String root)
		{
			this.root = root;
		}
	}