
public class Demo {

	public static void main(String[] args) {
		
//		Shape shape1 = new Shape(); // this is an error
		Circle circle1 = new Circle();
		circle1.setRadius(10.0);
		System.out.println(circle1.computeArea());
		
		Circle circle2 = new Circle();
		circle2.setRadius(20.0);
		
		Rectangle rec1 = new Rectangle();
		rec1.setSide1(5.5);
		rec1.setSide2(7.5);
		
		Rectangle rec2 = new Rectangle();
		rec2.setSide1(15);
		rec2.setSide2(20.0);
		
		// Create a list of those shapes and compute the area of each one
//		Shape[] shapes = {circle1, circle2, rec1, rec2};
//		
//		for(int i=0; i<shapes.length; i++) {
//			System.out.println("Area: " + shapes[i].computeArea());
//		}
		
		// Challenge: How to use ArrayList to contain the shapes?
		
		
		

	}

}
