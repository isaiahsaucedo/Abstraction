// Isaiah Saucedo
public class Main {

	public static void main(String[] args) {
		
		Shape [] s = new Shape[6]; 
		
		s[0] = new Triangle(new Vertex(0.0, 0.0), new Vertex(0.0, 4.0), new Vertex(3.0, 0,0));
		s[1] = new Rectangle(new Vertex(0.0, 0.0), new Vertex(0.0, 2.0), new Vertex(4.0, 2,0), new Vertex(4.0, 0.0));
		s[2] = new Circle(new Vertex(0.0, 0.0), new Vertex(4.0, 0.0));
		s[3] = new SquarePyramid(new Vertex(0.0, 0.0, 0.0), 8.0, 4.0 );
		s[4] = new Cuboid(new Vertex(0.0, 0.0, 0.0), 8.0, 4.0, 2.0 ); 
		s[5] = new Sphere(new Vertex(0.0, 0.0, 0.0), 4.0); 




		System.out.println(s[0].toString()); 
		System.out.println(s[1].toString()); 
		System.out.println(s[2].toString()); 
		System.out.println(s[3].toString()); 
		System.out.println(s[4].toString()); 
		System.out.println(s[5].toString());



	}

}
