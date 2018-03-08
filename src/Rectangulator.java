public class Rectangulator {
	public static void main(String args[]) {
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);

		rectangle myrect = new rectangle(length, width);

		String output = String.format("Rectangle values\n\nLength = %d\nWidth = %d\nArea = %d\nPerimeter = %d\n",myrect.length,myrect.width,myrect.getArea(),myrect.getPerimeter());

		System.out.println(output);
	}
}