package javaPractice;

//-------------------------INTERFACE CONCEPT----------------------------Linked With PDetailMethods

//here we can call interface by using implements method, we can call more than 1 or 2 interfaces by separating with comma.
public class CallingInterface implements PDetailMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingInterface d = new CallingInterface();
		d.town();
		d.name();
		d.city();

		PDetailMethods dr = new CallingInterface();
		dr.city();
		dr.town();
		dr.name();

	}

	@Override
	public void name() {
		// TODO Auto-generated method stub

	}

	@Override
	public void town() {
		// TODO Auto-generated method stub

	}

	@Override
	public void city() {
		// TODO Auto-generated method stub

	}

}
