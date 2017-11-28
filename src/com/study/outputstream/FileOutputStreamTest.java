package com.study.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.junit.Test;

public class FileOutputStreamTest {

	@Test
	public void demo1(){
		try {
			OutputStream out = new FileOutputStream("e:\\test.txt",true);
			out.write("test".getBytes());
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
