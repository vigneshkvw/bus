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
class tic {

    private static void mint() {
         int fair =15;
        System.out.println("enter number of pasnger");
        Scanner bus = new Scanner(System.in);
		int passenger=bus.nextInt();

        int amount=fair*passenger;
        System.out.println("collect the amount"+amount);

    }

    private static void moolakadai() {
     int fair =20;
        System.out.println("enter number of pasnger");
        Scanner bus = new Scanner(System.in);
		int passenger=bus.nextInt();

        int amount=fair*passenger;
        System.out.println("collect the amount"+amount);

    }

    private static void redhills() {
        int fair =15;
        System.out.println("enter number of pasnger");
        Scanner bus = new Scanner(System.in);
		int passenger=bus.nextInt();

        int amount=fair*passenger;
        System.out.println("collect the amount"+amount);
    }
busfair  fair= new busfair();
    static void depot_to_mint() {
    stage3();
    }

    static void karanodai_to_depot() {
    stage2();
    stage3();

    }


    static void karanodai_to_mint() {
    stage2();
    stage3();

    }

    static void mint_to_karanodai() {
        stage1();
        stage2();

    }


    private static void stage1() {
            Scanner bus = new Scanner(System.in);
				int ch = bus.nextInt();
                	System.out.println("1.redhiils\t2.moolakadai\t3.mint\t4Exit.");

				switch (ch) {
                    case 1:
                        redhills();
                break;
                    case 2:
                        moolakadai();
                        break;
                    case 3:
                        mint();
                        break;
                    case 4:
                        System.exit(ch);
                }

    }

    private static void stage2() {
            Scanner bus = new Scanner(System.in);
				int ch = bus.nextInt();
                	System.out.println("1.redhiils\t2.moolakadai\t3.mint\t4Exit.");

				switch (ch) {
                    case 1:
                        moolakadai();
                        break;
                    case 2:
                        mint();
                        break;
                    case 3:
                        System.exit(ch);
                }

    }

    private static void stage3() {
            Scanner bus = new Scanner(System.in);
				int ch = bus.nextInt();
                	System.out.println("1.redhiils\t2.moolakadai\t3.mint\t4Exit.");

				switch (ch) {
                    case 1:
                        mint();
                        break;
                    case 2:
                        System.exit(ch);
                }


    }



}
