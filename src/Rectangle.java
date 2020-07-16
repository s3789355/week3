public class Rectangle {
    double height;
    double width;
    Rectangle (double heightValue, double widthValue ){
        this.height = heightValue;
        this.width = widthValue;
    }
    double getArea(){
        return this.height*this.width;
    }
    double getPerimeter(){
        return (this.height + this.width)*2;
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(1,1 );
        System.out.println("The area of the rectangle is " + rec.getArea() +
                "\nThe perimeter of the rectangle is  "+ rec.getPerimeter());

    }
    }



