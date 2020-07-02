package tdd_junit;

public class main implements access{
	
public String accept(String s)
{   String h1="";
	int ya=s.length();
	if(ya>=2)
	{
		if(s.charAt(0)!='A')
		{
			h1=h1+s.charAt(0);
			
		}
		if(s.charAt(1)!='A')
		{
			h1=h1+s.charAt(1);
			
		}
		if(ya>2)
		{
			
			h1=h1+s.substring(2,ya);
			
		}
	
		
	}
	else
	{
		if(ya==1)
		{
			if(s.charAt(0)!='A')
			{
				h1=h1+s.charAt(0);
				
			}	
			
			
		}
		}
	
	return(h1);
}
}
