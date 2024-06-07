
public class Main {
   public static void main(String[] args){
    System.out.println("Creating object using prototype design");
    NetworkConnection netconnect=new NetworkConnection();
    netconnect.setIp("192.168.1.1");
    netconnect.loadVeryImportantData();
    System.out.println(netconnect);

    // we want new Object of network connection
   
    try{
      // (NetworkConnection)netconnect.clone(); is converted from object to NetworkConnection datatype.
      NetworkConnection copyNetworkConnet=(NetworkConnection)netconnect.clone();
      System.out.println(copyNetworkConnet);
    }catch(CloneNotSupportedException e){
      e.printStackTrace();

    }
   }
    
}