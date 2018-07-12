package javaPractice;

//-----------------------------INHERITENCE CONCEPT-----------------------------------------------------

        //Child can access both Parent and GrandParent by just calling only parent(as parent already have access to Grandparent)
public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.city();
		c.town();
		c.name();
		
		c.pincode();
		
	}
	

}
