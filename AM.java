// use array to get new array

public class AM{
public static void main(String[]args)
{
double[] ogarray ={5.0,4.0,3.0,2.0,1.0};
double[] newarray=new double[ogarray.length];
for(int i=0;i<ogarray.length;i++){
newarray[i]=ogarray[i]*2.5;
}
System.out.println("Array : ");
for(double num : ogarray){
System.out.println(num+ " ");
}
System.out.println("New Array : ");
for(double num: newarray){
System.out.println(num + " ");
}
}
}