class Point {
	private int x;
	
	// public so that anyone can instantiate an instance of Point
	public Point(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
                
               public getManhattanDistance( int x1,int x2){
                  return (Math.abs(x1-x2));               
              }

}

class Point2D extends Point {
	private int y;
	
	public Point2D(int x, int y) {
		super(x);
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

               public getManhattanDistance(int x1,int x2,int y1,int y2){
                 super.getManhattanDistance(x1,x2);
                 return()
              }
	
	// Remember that the methods getX and setX have been inherited
}

class Point3D extends Point2D{
              	private int z;

	public Point3D(int x, int y,int z) {
		super(x);
                                super(y);
		this.z = z;
	}

             public int getZ() {
		return z;
	}
	
	public void setY(int y) {
		this.z = z;
	}

           	public getManhattanDistance() {
	


	}

}


class PointRunner {
	public static void main(String[] args) {		
		Point2D p2 = new Point2D(10, 20);
		System.out.println("p2.getX(): " + p2.getX());
		System.out.println("Calling p2.setX(30)");
		p2.setX(30);
		System.out.println("p2.getX(): " + p2.getX());
	}
}