package edu.primitive;

public class Task7101 {

	public static void main(String[] args) {
		char[] palindrom = { 'д', 'о', 'х', 'о', 'д' };
		boolean flag = true;
		for (int i = 0; i < palindrom.length; i++) {
			if (palindrom[i] != palindrom[palindrom.length - 1 - i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Полиндром");
		} else {
			System.out.println("Не палиндром");
		}
	}
}
