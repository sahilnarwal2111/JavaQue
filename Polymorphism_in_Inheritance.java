public class Polymorphism_in_Inheritance {
    Camera1 c = new SmartPhone1();

}
interface Camera1{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K");
    }
}
interface wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
//    void takeSnap(){
//        System.out.println("Take Snap!!");
//    }

}
class SmartPhone1 extends MyCellPhone implements wifi1,Camera1{
    public void takeSnap(){
        System.out.println("Photo Clicked!");
    }
    public void recordVideo(){
        System.out.println("Recording begins...!");
    }
    public String[] getNetworks(){
        System.out.println("Getting the list of Networks!!!");
        String[] networkList = {"Harry","Prashanth","Anjali"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void record4KVideo(){
        System.out.println("Recording in 4K and taking a snap!");
    }

}