class Sum
{
    int z;
	String sum(int x,int y)
	{
	    if(x==y)
		{
		    z=x+y;
			return"yes";
		}
        else
		{
            return "stop";		
		}
	}
	public static void main(String[] args)
	{
	    Sum s=new Sum();
		  String t=s.sum(3,3);
		  System.out.println(t);
	}
}