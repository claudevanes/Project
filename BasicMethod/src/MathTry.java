/**
 * Class math. Play with math method. No bigger thought yet.
 */

public class MathTry {

	private static double pi = Math.PI;
	private static double e = Math.E;

	public MathTry() {
	}

	static void mathTry(){
		Main.LOGGER.info("");

		Prin.l("Math.abs: " + Math.abs(0));
		Prin.l("Math.min:" + Math.min(10, 1));
		Prin.l("Math.random: " + Math.random());
		Prin.l("Math.E: " + pi);
		Prin.l("Math.PI: " + e);

		// Only for funny:
		Prin.l("Do you know why it is zero?: " + (int) (Math.random()));
	}

}
