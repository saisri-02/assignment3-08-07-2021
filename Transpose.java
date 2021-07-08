import java.util.*;

class Transpose
{

public static void main(String args[ ])

{

Scanner sc=new Scanner(System.in);

System.out.println("Enter number of rows : ");

int r=sc.nextInt();

System.out.println("Enter number of columns : ");

int c=sc.nextInt();

int a[][]=new int[r][c];

System.out.println("Enter elements in array : ");

for(int i=0;i<r;i++)

{

for(int j=0;j<c;j++)

{

a[i][j]=sc.nextInt();

}

}

int b[][]=new int[c][r];
for(int i=0;i<c;i++)
{
for(int j=0;j<r;j++)
{
b[j][i]=a[i][j];
}
}
System.out.println("Transpose matrix = ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(" "+b[i][j]);
}
System.out.println();
}
}
}