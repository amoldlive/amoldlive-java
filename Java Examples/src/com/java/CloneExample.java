package com.java;

class Test {
    int x, y;
}
 
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

//deep cloaning
class Test3 implements Cloneable{
	int a;
    int b;
    Test c = new Test();
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	
    	Test3 test3=(Test3) super.clone();
    	test3.c=new Test();
    	test3.c.x=c.x;
    	test3.c.y=c.y;
    	
    	
    	return test3;
    	
    }
	
}
 
// Driver class
public class CloneExample {
    public static void main(String args[])
        throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
 
        Test2 t2 = (Test2)t1.clone();
 
        // Creating a copy of object t1
        // and passing it to t2
        t2.a = 100;
 
        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t2.c.x = 300;
 
        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                           + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x
                           + " " + t2.c.y);
    }
}