package com.study.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class FileInputStreamTest {

	@Test
	public void demo1(){
		InputStream inputstream = null;
		try {
			inputstream = new FileInputStream("e:\\test.txt");
			int data = 0;
			while((data = inputstream.read()) != -1) { 
			    //do something with data...  
			    //doSomethingWithData(data);   
			    data = inputstream.read();
			    System.out.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void demo2(){
		InputStream inputstream = null;
		try {
			inputstream = new FileInputStream("e:\\test.txt");
			byte[] data = new byte[1024];
			int bytesRead = 0;
			while((bytesRead = inputstream.read(data)) != -1) {
			    //doSomethingWithData(data, bytesRead);
			    System.out.write(data,0,bytesRead);
			    System.err.write(data,0,bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
