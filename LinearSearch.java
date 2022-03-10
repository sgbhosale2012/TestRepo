

// to find duplicats if repeated only one time
class LinearSearch{

public static int serach(int[] a, int key)
{
	for(int i=0;i<m;i++)
{

	if(a[i]==key)
	return i;

}

}



public static void main(String arg[])
{

Scanner obj=new Scanner(System.in);
System.out.println("Enter size");
int m=obj.nextInt();
int[] a=new int[m];


for(int i=0;i<m;i++)
{
System.out.println("Enter value");
a[i]=obj.nextInt();
}
System.out.println("Duplicates are ");

}}