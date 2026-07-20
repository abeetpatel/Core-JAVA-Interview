package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadWriteByKeyboard {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("D:\\io\\keyboard.txt");

		System.out.println("Enter here.......");

		String str = br.readLine();

		while (str != null) {

			fw.write(str);

			System.out.println(str);

			str = br.readLine();

		}

		br.close();
		fw.close();

	}
}

// use ctrl+z for saving the text after the input done(by keyboard)