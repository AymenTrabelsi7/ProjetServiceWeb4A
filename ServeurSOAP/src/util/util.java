package util;

public class util {
	public static String toPrice(float price) {
		String s = String.format("%.2f",price);
		String[] sParsed = s.split(".");
		String num = sParsed[0] + "," + sParsed[1];
		return  num;
	}
}
