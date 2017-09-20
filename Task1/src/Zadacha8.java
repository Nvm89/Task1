
public class Zadacha8 {
public static void main(String[] args) {
		 
	byte c = 5;
	byte x, x1, x2, y, y1, y2;
	x = 0;
	y = 1;
	x1 = -1;
	x2 = 5;
	y1 = 1;
	y2 = 5;
	boolean xy = ((x*x) + (y*y)<=c*c);
	boolean xy2 = (x2>=x & x>=x1 & y>=y1 & y<=y2);	 
	System.out.println(xy);
	System.out.println(xy2);
	}
}