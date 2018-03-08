public class rectangle {
	public int length;
	public int width;

	public rectangle(int l, int w) {
		length = l;
		width = w;
	} 

	public int getArea() {
		return length * width;
	}

	public int getPerimeter() {
		return 2 * (length * width);
	}
}