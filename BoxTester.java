public class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box(5, 3, 2 ) ;

     //System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
     
     System.out.println(box.faceArea());
     System.out.println(box.sideArea());
     //System.out.println( "length: " + box.length + " height: " + box. height + "width:  " + box.width );

  }
}
