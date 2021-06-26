package com.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SaveMe implements Serializable{
	
	int id=10;
	String name="Amol";
	transient String city="Nagpur";
	 String state="Maharashtra";
	
	@Override
	public String toString() {
		return "saveMe [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
public class SerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SaveMe me=new SaveMe();
		System.out.println("Save me before serialization : "+me);
		
		FileOutputStream fos=new FileOutputStream("G:/MyWorkspace/Java Examples/src/Files/SaveMe.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(me);
		os.flush();
		os.close();
		System.out.println("Object Serialized");
		
		FileInputStream fis=new FileInputStream("G:/MyWorkspace/Java Examples/src/Files/SaveME.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SaveMe deSerializedMe=(SaveMe) ois.readObject();
		System.out.println("De Serialized Object : "+deSerializedMe);
				
		
	}
}
