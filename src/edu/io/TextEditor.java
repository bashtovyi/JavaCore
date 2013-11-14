package edu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TextEditor {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("1.txt", true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			bufferedWriter.write("Привет \r\n");
			// \n - UNIX, Linux ....
			// \r\n - return - Windows X, MS-DOS
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fileInputStream = new FileInputStream("1.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(
					fileInputStream, "Windows-1251");
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String text = "";
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				text = text + line + "\r\n";
			}
			System.out.println(text);

			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
