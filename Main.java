/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bus;

import java.util.Scanner;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 * @author viki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      bus s =new bus();
    Scanner bus = new Scanner(System.in);
    		System.out.println("\n\n\t----57f Simulator----");
		try {
			while (true) {
				System.out.println("1.select route\t3Exit.");
				int ch = bus.nextInt();
				switch (ch) {

                      case 1:
                          s.route();
                          break;

               case 2:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Option");
				}
			}
		} catch (Exception e) {
			System.out.println("SELF THROWN EXCEPTION IS--->" + e);
		}
            bus.close();
	}



    }


