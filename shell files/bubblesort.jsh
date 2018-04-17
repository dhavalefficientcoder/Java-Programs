//defining array
double [] a = {10.5,12.3,6.8,7.3,2.1};
double temp=0;
//calculating size
int size=a.length;
//bubblesort array
for(int i=0;i<size;i++)
for(int j=0;j<size-1;j++)
{
if(a[j]>a[j+1]){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
for(int i=0;i<size;i++)
{
print(a[i]+",");
}
