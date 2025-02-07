public class Box {

    private double height;
    private double length;
    private double width;


    public Box(double length, double width, double height){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side){
        this(side, side, side);
    }

    public double volume(){
        return this.height*this.length*this.width;
    }
    // public double area(){
    //     return ((this.length*this.width) + (this.length*this.height)+(this.width*this.height))*2;
    // }
    
    public double faceArea(){
        return this.length*this.height;
    }
     double topArea(){
        return this.length*this.width;
    }
     double sideArea(){
        return this.width*this.height;
    }


    double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
    }
    
    
}
