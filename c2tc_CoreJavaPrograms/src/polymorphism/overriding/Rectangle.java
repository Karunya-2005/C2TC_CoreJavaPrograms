package polymorphism.overriding;

public class Rectangle extends Shape {
	private double l , b;
	public Rectangle(double l, double b) {
		this.l=l;
		this.b=b;
	}
	public void calArea() {
		System.out.println("From Rectangle class:"+(l*b));
	}

}
