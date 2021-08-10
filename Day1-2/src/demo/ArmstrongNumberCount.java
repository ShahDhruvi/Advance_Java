package demo;

import java.util.*;

public class ArmstrongNumberCount {

	public static void armstrongCount(int count)
	{
		int c=0,i=1;
		while(c!=count)
		{
			int temp,p=0,sum=0;
			temp=i;
			// counting no of digits
			/*while(temp!=0)
			{
				p++;
				temp/=10;
			}*/
			//temp=i;
			while(temp!=0)
			{
				int rem = temp%10;
				/*int r=1;
				for(int j=1;j<=p;j++)
				{
					r=r*rem;
				}*/
				sum+=(rem*rem*rem);
				temp/=10;
			}
			if(sum==i)
			{
				System.out.print(i +" ");
				c++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Count: ");
		int n = sc.nextInt();
		System.out.print("First " + n + " armstrong numbers are: ");
		armstrongCount(n);
		sc.close();
	}

}
