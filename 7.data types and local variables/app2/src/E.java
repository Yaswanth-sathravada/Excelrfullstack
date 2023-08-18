import java.text.DecimalFormat;
class E 
{
	public static void main(String[] args) 
	{
		DecimalFormat df =new DecimalFormat("#.###");
		float i =30.90f;
		System.out.println(df.format(i));
	}
}
