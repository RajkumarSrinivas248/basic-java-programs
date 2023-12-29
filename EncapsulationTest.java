class Transaction{
    private int id;
    private String type;

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
}
public class EncapsulationTest {
    public static void main(String[] args){
       Transaction transaction=new Transaction();
       transaction.setId(1);
       transaction.setType("Card");
       System.out.println("Transaction id :"+transaction.getId());
       System.out.println("Transaction type :"+transaction.getType());
    }
}
