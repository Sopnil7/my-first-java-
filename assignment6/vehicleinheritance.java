abstract class Vehicle
{
abstract void start() ;
void stop()
{
}
}


class twowheeler extends Vehicle
{
void start()
{
System.out.println("Two wheeler starts"); 
}
void stop()
{
System.out.println("Two wheeler stops"); 
}
}

class fourwheeler extends Vehicle
{
void start()
{
System.out.println("Four wheeler start"); 
}
void stop()
{
System.out.println("Four wheeler stop"); 
}
}

class vehicleinheritance
{
public static void main(String args[])
{
Vehicle t=new twowheeler();
t.start();
t.stop();
Vehicle f=new fourwheeler();
f.start();
f.stop();
}
}