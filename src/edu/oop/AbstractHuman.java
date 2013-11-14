package edu.oop;

import java.io.Serializable;

// Ключевое слово abstract указывает на абстрактный класс.
// От абстрактного нельзя создать обьекты
public abstract class AbstractHuman extends Object implements Serializable,
		Comparable<AbstractHuman> {

	// поля по-умолчанию надо писать через private.
	// private - указывает на принадлежность к классу.
	private static final long serialVersionUID = -151620687547012961L;
	private String lastName;
	private String firstName;
	private String sureName;
	private int age;

	public AbstractHuman() {
	}

	public AbstractHuman(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}

	public AbstractHuman(AbstractHuman human) {
		setFirstName(human.getFirstName());
		setLastName(human.getLastName());
		setSureName(human.getSureName());
		setAge(human.getAge());
	}

	// геттеры и сеттеры (getters and setters)
	// служат для получения и установки значений полей.
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		// this ставят там где без него необойтись
		// this - ссылка на этот обьект
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Перегрузка(overload)- это возможность создать методы которые называются
	// одинаковым именем, соответсвенно служать одной цели,
	// делают одно и то же. Но имееют разные параметры.

	public void setAge(double age) {
		this.age = (int) age;
	}

	public String toString() {
		return getFirstName() + " " + getSureName() + " " + getAge();
	}

	public abstract void printInformation();

	public int hashCode() {
		int hash = 1;
		if (getFirstName() != null) {
			hash = hash * 3 + getFirstName().hashCode();
		}
		if (getLastName() != null) {
			hash = hash * 5 + getLastName().hashCode();
		}
		if (getSureName() != null) {
			hash = hash * 7 + getSureName().hashCode();
		}
		hash = hash * 13 + getAge();

		return hash;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object instanceof AbstractHuman) {
			AbstractHuman anotherHuman = (AbstractHuman) object;

			if (getFirstName() != null) {
				// Если 2 имени не равны -значит обьекты не равны
				if (!getFirstName().equals(anotherHuman.getFirstName())) {
					return false;
				}
			} else {
				// Если в первом обьекте null, а во втором обьекте !null - они не равны.
				if (getFirstName() != anotherHuman.getFirstName()) {
					return false;
				}
			}

			if (getAge() != anotherHuman.getAge()) {
				return false;
			}

			if (getLastName() != null) {
				if (!getLastName().equals(anotherHuman.getLastName())) {
					return false;
				}
			} else {
				if (getLastName() != anotherHuman.getLastName()) {
					return false;
				}
			}

			if (getSureName() != null) {
				if (!getSureName().equals(anotherHuman.getSureName())) {
					return false;
				}
			} else {
				if (getSureName() != anotherHuman.getSureName()) {
					return false;
				}
			}

			return true;
		}

		return false;
	}

	@Override
	public int compareTo(AbstractHuman human) {
		int compareTo = getSureName().compareToIgnoreCase(human.getSureName());
		if (compareTo == 0) {
			if (equals(human)) {
				return 0;
			}
			// Сортировка от меньшего к большему
			return 1;
		}

		return compareTo;
	}

}
