package javaPractice;

//-----------------------------INHERITENCE CONCEPT-----------------------------------------------------

//To Access City method from Grandparent we need to call it by extends method as below
public class Parent extends GrandParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent a = new Parent();
		// now just call the method as classobject.methodname

		a.city();
		a.name();
		a.town();
	}

	public void pincode() {
		System.out.println("Pincode");
		
	}
}
