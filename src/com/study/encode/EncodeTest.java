package com.study.encode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EncodeTest {

	public static void main(String[] args) throws Exception {
		String file = "e:/stream.txt";
		String charset = "UTF-8";
		FileOutputStream outputStream = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(outputStream, charset);
		writer.write("测试");
		writer.close();

		FileInputStream inputStream = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(inputStream, charset);
		StringBuffer buffer = new StringBuffer();
		char[] buf = new char[1024];
		int count = 0;
		while ((count = reader.read(buf)) != -1) {
			buffer.append(buf, 0, count);
		}
		reader.close();
		System.out.println(buffer.toString());
		
		
		/*String name = "I an 君山";
		byte[] iso8859 = name.getBytes("ISO-8859-1");
		System.out.println(iso8859.toString());*/
	}
}
