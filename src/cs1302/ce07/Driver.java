package cs1302.ce07;

import cs1302.ce07.impl.Car;

/**
 * A driver program to test the functionality of
 * {@code cs1302.ce07.impl.Car} which implements
 * {@code cs1302.ce07.contract.Drivable}
 */
public class Driver {

    /**
     * Attempts to speedup and slowdown the {@link cs1302.ce07.impl.Car} object
     * by a specified amount. If the {@link cs1302.ce07.impl.Car} object is unable
     * to speedup or slowdown by the specified amount, an appropriate message is
     * printed.
     *
     * @param car the car to test
     * @param speedupAmount the amount to speedup the car
     * @param slowdownAmount the amount to slowdown the car
     */ 
    public static void test(Car car, double speedupAmount,
			    double slowdownAmount) {
	System.out.println(car);
	if(car.speedUp(speedupAmount)) {
	    System.out.println("The car sped up by " + speedupAmount + " mph");
	} else {
	    System.out.println("The car cannot go that fast");
	} // if

	if(car.slowDown(slowdownAmount)) {
	    System.out.println("The car slowed down by " + slowdownAmount + " mph");
	} else {
	    System.out.println("The car is cannot slow down by that amount");
	} // if

	System.out.println(car);
    } // test

    /**
     * 
     * @param args the command-line arguments to the program
     */
    public static void main(String[] args) {
	Car fastCar = new Car(185.5);
	Car slowCar = new Car(75.0);

	System.out.println("--------------------");
	
	test(fastCar, 200.5, 20);
	System.out.println("--------------------");

	test(fastCar, 125, 20);
	System.out.println("--------------------");
	
	test(slowCar, 85, 20);
	System.out.println("--------------------");
	
	test(slowCar, 65, 65);
	System.out.println("--------------------");
    } // main
} // Driver
