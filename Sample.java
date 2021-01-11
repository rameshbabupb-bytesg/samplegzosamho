import java.util.*;
class Sample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n,x=0;
n=sc.nextInt();    //Input 5
int a[][]=new int[n][n];
x=n;
for(i=0;i<n;i++)
{
	for(j=i;j<n;j++)
	{
		a[i][j]=x;
		a[j][i]=x;
	}
	x--;
}
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
}
}