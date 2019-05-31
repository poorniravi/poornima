import java.io.*;
import java.util.*;
class stack
{
static int a[]=new int[20];
static int top=0;
public static void main(String s1[])
{
while(true)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
switch(n)
{
	case 1:
	{
		push();
		break;
	}
	case 2:
	{
		pop();
		break;
	}
	case 3:
	{
		disp();
		break;
	}
	default:
	{
		System.exit(0);
	}
}
}
}
static void push()
{
	top++;
	if(top>5)
	{
		System.out.println("over");
	}
	else
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("no");
		int b=ob.nextInt();
		a[top]=b;
	}
}
static void pop()
{
	if(top==-1)
	{
		System.out.println("empty");
	}
	else
	{
		int d=a[top];
		top--;
		System.out.println(d);
	}
}
static void disp()
{
for(int i=top;i>0;i--)
{
System.out.println(a[i]);
}
}
}	
