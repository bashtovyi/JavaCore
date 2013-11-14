package edu.oop;
//Наследование
public class Male extends AbstractHuman implements Cloneable, SupermanInterface {
	private boolean isPlayHockey;
	private Female spause;

	// Конструктор - похож на метод который конструирует и создает обьект.
	// Конструктор - возвращает ссылку на обьект.
	public Male(String firstName, int age) {
		super(firstName, age);
	}
	 
	public Male() {
	}

	public Female getSpause() {
		return spause;
	}

	public void setSpause(Female spause) {
		this.spause = new Female(spause);
	}

	// конструктор копирования
	// deep copy constructor
	public Male(Male male) {
		super(male);
		setPlayHockey(male.isPlayHockey());
		setSpause(male.getSpause());
	}

	public boolean isPlayHockey() {
		return isPlayHockey;
	}

	public void setPlayHockey(boolean isPlayHockey) {
		this.isPlayHockey = isPlayHockey;
	}

	// Override- переопределение. Возможность изменить поведение метода
	// наследованного от родителя.
	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}

	public Male clone() throws CloneNotSupportedException {
		Male male = (Male) super.clone();
		male.setSpause(getSpause());
		
		return male;
	}

	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
	}

	@Override
	public void flyInTheSky() {
		System.out.println("Полет нормальный "
				+ SupermanInterface.SPEED_OF_SOUND);
	}

	// deep
	public int hashCode() {
		int hash = 3 + super.hashCode();
		if (getSpause() != null) {
			hash = hash * 9 + getSpause().hashCode();
		}
		if (isPlayHockey()) {
			hash = hash * 11 + 3;
		} else {
			hash = hash * 17 + 1;
		}

		return hash;
	}

//	public boolean equals(Male male) {
//		return getFirstName().equals(male.getFirstName())
//				&& getAge() == male.getAge()
//				&& getLastName().equals(male.getLastName())
//				&& getSureName().equals(male.getSureName());
//	}
	
	// 3 ступени equals
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object instanceof Male) {
			Male anotherMale = (Male) object;
			
			if (!super.equals(object)) {
				return false;
			}
			
			if (isPlayHockey() != anotherMale.isPlayHockey()) {
				return false;
			}
			
			if (getSpause() != null) {
				if (!getSpause().equals(anotherMale.getSpause())) {
					return false;
				}
			} else {
				if (getSpause() != anotherMale.getSpause()) {
					return false;
				}
			}

			return true;
		}

		return false;
	}
	

	

}