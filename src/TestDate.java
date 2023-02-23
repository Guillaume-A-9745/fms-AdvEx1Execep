import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date []toto = {new Date(), new Date(), null,new Date()};
				
		for (int i = 0; i < toto.length; i++) {
			try {
				System.out.println(toto[i].getClass().getName());
			} catch (java.lang.NullPointerException e) {
				System.out.println(e);
			}
		}
	}
}
