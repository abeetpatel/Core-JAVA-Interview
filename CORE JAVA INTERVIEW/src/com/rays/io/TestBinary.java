package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("D:\\io\\rays.png");
		FileOutputStream fos = new FileOutputStream("D:\\io\\raysCopy.png");

		int pic = fis.read();
		while (pic != -1) {
			fos.write(pic);
			pic = fis.read();
		}
		fis.close();
		fos.close();
		System.out.println("Done...");
	}

}
