# Encode
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Power1 {
	public static void main(String[] args)throws IOException
	{
		int c,j = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		java.lang.String a1=br.readLine();
		char ch1[]=new char[a1.length()];
		java.lang.String a2=br.readLine();
		char ch2[]=new char[a2.length()];
		for(int i=0;i<a1.length();i++)
		{
			int b=Integer.valueOf(a1.charAt(i))+10;
			if(b>122)
			{
				b=b-122;
				b=96+b;
			}
			ch1[j]=(char)b;
			j++;
			}
		String b=new String(ch1);
		System.out.print(b);
		System.out.print(a2.charAt(0));
		for(int i=1;i<a2.length()-1;i++)
		{
			c=Integer.valueOf(a2.charAt(i))+10;
			if(c>122)
			{
				c=c-122;
				c=96+c;
			}
			System.out.print((char)c);
		}
			System.out.print (a2.charAt(a2.length()-1));
		}
		
		
	}
