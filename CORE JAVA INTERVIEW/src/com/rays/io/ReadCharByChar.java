package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadCharByChar {
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("D:\\io\\keyboard.txt");
		FileWriter fw = new FileWriter("D:\\io\\output.txt");
		int ch = fr.read();
		while (ch != -1) {
			fw.write(ch);
			System.out.println((char) ch);
			ch = fr.read();

		}
		fr.close();
		fw.close();
	}

}
