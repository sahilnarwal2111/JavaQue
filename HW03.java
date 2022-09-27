import java.util.*;
public class HW03 {
    float area;
    HW03(){
        System.out.println();
    }
    HW03(float n1){
        this.area = (n1)*(n1);
        System.out.println("Area of square is "+this.area);
    }
    HW03(float n1, float n2){
        this.area = n1*n2;
        System.out.println("Area of rectangle is "+this.area);
    }
    HW03(float n1, float n2, float n3){
        float s = (n1+n2+n3)/2;
        this.area = (float) Math.sqrt(s*(s-n1)*(s-n2)*(s-n3));
        System.out.println("Area of triangle is "+this.area);
    }
   public void compare(float a1, float a2){
        if(a1 >a2){
            System.out.println("Figure 1 has more area");
        }
        else {
            System.out.println("Figure 2 has more area");
        }

   }

    public static void main(String[] args) {
        HW03 fig1 = new HW03(10);
        HW03 fig2 = new HW03(2f,3f);
        HW03 fig3 = new HW03(2.3f,4.5f,6.7f);
        HW03 com = new HW03();
        com.compare(fig1.area, fig2.area);

    }

}
