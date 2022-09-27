public class InterfacesExamplePhone {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        String[] ar = sp.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
        sp.record4KVideo();

    }
}
interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
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
class SmartPhone extends MyCellPhone implements wifi,Camera{
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