class Even1
{
void get()
{
 int a[]={1,2,3,4,5,6};
 for(int i=0;i<=5;i++)
{
 if(a[i]%2==0)
{
 System.out.println(a[i]);
}
}
}
public static void main(String[] args)
{
 Even1 e=new Even1();
 e.get();
}
}