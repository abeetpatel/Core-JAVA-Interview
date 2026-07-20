package com.rays.javabasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCreateUsingDeserialization implements Serializable {

	public static void display() {

		System.out.println("Object is created using deserialization");

	}

	public static void main(String[] args) {
		try {
			// serialization
			ObjectCreateUsingDeserialization original = new ObjectCreateUsingDeserialization();
			FileOutputStream fos = new FileOutputStream("objectcreateusingdeserialization.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(original);
			oos.close();

			// deserialization
			FileInputStream fis = new FileInputStream("objectcreateusingdeserialization.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectCreateUsingDeserialization deserialized = (ObjectCreateUsingDeserialization) ois.readObject();
			ois.close();

			deserialized.display();

		} catch (Exception e) {
		}
	}

}
