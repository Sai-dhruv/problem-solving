/**
 * 
 */
package stars;

/**
 * @author Sai Krishna
 *
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row = 3;

		for(int i = 0;i<=row;i++) {
			for(int k=row;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
