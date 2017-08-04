package core;

public class OddNumbers 
{
    public static void main( String[] args )
    {
    	int num = Integer.parseInt(args[0]);
		int max = num;
    	for (int i = 0; i <= max; i++)
        	if (i % 2 != 0){System.out.println( i + ", ");}
    }
}
