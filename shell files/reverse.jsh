//defining array
double [] a = {10.5,12.3,6.8,7.3,2.1};
double temp=0;
//calculating size
int size=a.length;
println("Before reverse:");
for(int i=0;i<size;i++)
{
print(a[i]+",");
}
print("\n");
//reversing array
for(int i=0;i<size/2;i++)
{
temp=a[i];
a[i]=a[size-i-1];
a[size-i-1]=temp;
}
println("After reverse:");
for(int i=0;i<size;i++)
{
print(a[i]+",");
}
