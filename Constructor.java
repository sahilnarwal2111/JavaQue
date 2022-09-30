
public class Constructor {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("SahilNarwal",1221 , 1500000);
//        harry.setId(23);
        
//        harry.setName("CodeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());


    }
}

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

//    public MyMainEmployee(){
//        id = 12;
//        name = "CodeWithSahil";
//    }

    public MyMainEmployee(String myName,int myId,int mySalary){
        id = myId;
        name = myName;
        salary = mySalary;

    }

}
