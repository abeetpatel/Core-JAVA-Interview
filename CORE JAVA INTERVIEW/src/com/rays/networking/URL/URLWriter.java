package com.rays.networking.URL;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {

	public static void main(String[] args) throws Exception {

		URL u = new URL("https://erp.sunilos.com/NCSA/#/");

		URLConnection conn = u.openConnection();

		conn.setDoOutput(true);

		OutputStreamWriter write = new OutputStreamWriter(conn.getOutputStream());

		write.write("q=java");

		write.close();

	//	conn.connect();

		InputStream in = conn.getInputStream();

		Scanner sc = new Scanner(in);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

}
