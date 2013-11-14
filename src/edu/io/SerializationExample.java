package edu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.oop.Female;
import edu.oop.Male;

public class SerializationExample {

	public static void main(String[] args) {
		// Сериалиация -  преобразование обьектов в поток байт.
		// Поток байт -  можно передать по сети ... и т.д.
		
		Female firstFemale = new Female();
		firstFemale.setFirstName("Оля");
		firstFemale.setLastName("Олегович");
		firstFemale.setSureName("Олеговна");
		firstFemale.setAge(15);
		firstFemale.setPregnant(false);

		Male firstMale = new Male();
		firstMale.setSpause(firstFemale);
		firstMale.setFirstName("Борис");
		firstMale.setSureName("Валютин");
		firstMale.setLastName("Буратович");
		firstMale.setAge(21);
		
		//Сериализация в  общем в файл
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("male.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			// Сериализация
			objectOutputStream.writeObject(firstMale);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Десериализация в общем из файла
		Male male = null;
		try {
			FileInputStream fileInputStream  = new FileInputStream("male.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			// Десериализация
			male = (Male) objectInputStream.readObject();
			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(firstMale.equals(male));
			
	}

}
