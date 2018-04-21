double pi=3.14;
double radius=4;
//function definition(create)

double area(double radius){
 double a = pi*radius*radius;
 return a;
}

double circumference(double radius){
double c=2*pi*radius;
return c;
}

double volume(double radius){
double v= 4/3*pi*radius*radius*radius;
return v;
}

//function calling
double area = area(radius);
double circumference = circumference(radius);
double volume = volume(radius);

//printing values
println("Area="+area);
println("circumference="+circumference);
println("volume="+volume);
