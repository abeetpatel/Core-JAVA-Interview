package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\io\\keyboard.txt");

		if (f.exists()) {

			System.out.println("Name => " + f.getName());
			System.out.println("Path => " + f.getAbsolutePath());

			System.out.println("file => " + f.isFile());
			System.out.println("dir => " + f.isDirectory());

			System.out.println("Readable => " + f.canRead());
			System.out.println("Writable => " + f.canWrite());

			long length = f.length();
			System.out.println("Length => " + length);

			Date d = new Date(f.lastModified());
			System.out.println("Last Modified Date => " + d);

		}

	}

}
