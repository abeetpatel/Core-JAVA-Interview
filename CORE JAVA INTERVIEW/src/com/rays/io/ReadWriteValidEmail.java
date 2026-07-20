package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidEmail {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("D:\\io\\EmailList.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\io\\Valid Emails.txt"));
		String line = br.readLine();
		while (line != null) {
			if (line.matches("^[a-zA-Z0-9,_%+-]+@gmail\\.com$")) {
				bw.write(line);
				bw.newLine();
				System.out.println(line);
			}
			line = br.readLine();
		}
		br.close();
		bw.close();
	}

}

// for regex matching 
// if (email.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$"))