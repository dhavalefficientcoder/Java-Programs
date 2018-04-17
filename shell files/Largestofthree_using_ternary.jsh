double [] a={5.0,6.0,4.0};
{
double c= 0;
c= a[0]>a[1] ? (a[0]>a[2] ? a[0]:a[2]) :(a[1]>a[2] ? a[1]:a[2]);
println(c+"is largest");
}
