// Use Interface and inherit car and override drive method().

interface TataCar{
 void drive(){
System.out.println("Tata Car is Driving.");
}
}
interface class TataCar implements Car{
@override
public void drive(){
System.out.println(" car is Driving very fast.");
}
}
public static void main(String[]args){
Tata t = new Tata();
t.drive();
}
}