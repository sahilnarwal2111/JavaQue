public class ExerciseOnAccesModifiers {
    public static void main(String[] args) {

        sphere sp = new sphere();
        System.out.println(sp.getRad());



    }
}

class Cylinder{
    private int radius;
    private int height;
    float area = 0f;
    float vol = 0f;
//    public void setRadius(int r){
//        radius = r;
//    }
//    public void setHeight(int h){
//        height = h;
//    }


//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    //    A=2πrh+2πr2
//    V=πr^2h
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public void surfaceArea(){
        area = (float) (2*3.14f*radius*height + 3.14*2*radius*radius);
        System.out.println("Surafce Area of Cylinder is "+area);
    }
    public void Volume(){
        vol = (float) (3.14*radius*radius*height);
        System.out.println("Volume is "+vol);
    }

}

class rectangle{
    int length;
    int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class sphere{
    int rad = 5;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
}
