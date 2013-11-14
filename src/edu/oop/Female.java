package edu.oop;


public class Female extends AbstractHuman {
	private boolean isPregnant;

	public Female(String firstName, int age) {
		super(firstName, age);
	}

	public Female() {

	}

	public Female(Female female) {
		super(female);
		setPregnant(female.isPregnant());
	}

	public boolean isPregnant() {
		return isPregnant;
	}

	public void setPregnant(boolean isPregnant) {
		this.isPregnant = isPregnant;
	}

	// override Human Class
	@Override
	public void setFirstName(String firstName) {
		super.setFirstName("Ms. " + firstName);
	}

	@Override
	public void printInformation() {
		
	}
	@Override
	public  int hashCode() {
		int hash = 3  + super.hashCode();
		
		if(isPregnant()) {
			hash = hash * 74 + 12;
		} else {
			hash = hash * 14 +  25;
		}
		
		return hash;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		
		if (object instanceof Female) {
			Female anotherFemale = (Female) object;

			if (!super.equals(object)) {
				return false;
			}
			
			if (isPregnant != anotherFemale.isPregnant()) {
				return false;
			}

			return true;
		}

		return false;
	}
}
