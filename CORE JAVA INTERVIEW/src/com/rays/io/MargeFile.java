package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MargeFile {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("D:\\io\\A1A2.txt");

		BufferedReader br = new BufferedReader(new FileReader("D:\\io\\A1.txt"));

		String s1 = br.readLine();

		while (s1 != null) {

			fw.write(s1 + "\n");

			s1 = br.readLine();

		}
		br.close();

		br = new BufferedReader(new FileReader("D:\\io\\A2.txt"));

		String s2 = br.readLine();

		while (s2 != null) {

			fw.write(s2);
			s2 = br.readLine();

		}
		br.close();
		fw.close();
	}

}
