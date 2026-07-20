package com.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLine {
	public static void main(String[] args) throws Exception {

		PrintWriter out = new PrintWriter(new FileWriter("D:\\io\\keyboard.txt"));

		out.println("Hello , ");
		out.println(" JAVA ");

		out.close();

	}
}
