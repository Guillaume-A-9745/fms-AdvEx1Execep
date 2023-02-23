import java.util.Date;

/**
 * 
 * @author Anselme Guillaume
 *
 */

public class FoundException {
	public static void main(String[] args) {
		
		Date date = null;
		Date today = new Date();
		
		try {
			System.out.println(date.getClass().getName());
		} catch (java.lang.NullPointerException ae) {
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(today.getClass().getName()); 
		} catch (java.lang.NullPointerException ae) {
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(e);
		}
		//System.out.println(today);
	}
}