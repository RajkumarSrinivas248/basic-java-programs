public class Threadfinalise {
    public void finalize()
    {
        System.out.println("this is garbage collector");
    }  
 public static void main(String args[]){  
    Threadfinalise s1=new Threadfinalise();  
    Threadfinalise s2=new Threadfinalise();  
    Threadfinalise s3=new Threadfinalise();
    Threadfinalise s4=new Threadfinalise();
  s1=null;  
  s2=null;  
  s3=null;
  s4=null;
  System.gc();  
 }  
    
}
