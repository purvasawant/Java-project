public class rectangle {
	public int length;
	public int width;

	public rectangle(int l, int w) {
		l = length;
		w = width;
	} 

	public int getArea() {
		return length * width;
	}

	public int getPerimeter() {
		return 2 * (length * width);
	}
}