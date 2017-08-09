/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bus;

import java.util.Scanner;

/**
 *
 * @author viki
 */
class bus {

    void route() {
        ticket tic =new ticket();
        Scanner bus = new Scanner(System.in);
	try {
			while (true) {
				System.out.println("1.select route\t2normal services\t3Exit.");
				int ch = bus.nextInt();
				switch (ch) {

                      case 1:
                          cut_services();
                          break;
                    case 2:
                        normal_services();
                        break;
               case 3:
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

    private void cut_services() {
 Scanner bus = new Scanner(System.in);

        System.out.println("enter your id");
int id=bus.nextInt();
System.out.println(id);
	try {
			while (true) {
				System.out.println("1.depot to mint\t2.karanodai to mint\t3Exit.");
				int ch = bus.nextInt();
				switch (ch) {

                      case 1:
                          tic.depot_to_mint();
                          break;
                    case 2:
                        tic.karanodai_to_depot();
                        break;
               case 3:
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

    private void normal_services() {
Scanner bus = new Scanner(System.in);

        System.out.println("enter your id");
int id=bus.nextInt();
System.out.println(id);
	try {
			while (true) {
				System.out.println("1.karanodai to mint\t2. mint to karanodai\t3Exit.");
				int ch = bus.nextInt();
				switch (ch) {

                      case 1:
                          tic.karanodai_to_mint();
                          break;
                    case 2:
                        tic.mint_to_karanodai();
                        break;
               case 3:
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
