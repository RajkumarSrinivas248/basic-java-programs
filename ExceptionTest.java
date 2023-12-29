class ExceptionTest{
    public static void main(String[] args) {
        
        try
        {  
            int a=10;
            int b=0;
            //throw Arithmetic Exception
            //int result=a/b;

            String s=null;
            //throw NullPointer Exception
            //int stringLength=s.length();

            String[] array={"a","b","c","d","e"};
            //throw array indexoutof Bound Exception
            //String uniqueChar=array[6];

            s="Mani";
            //throw Number Format Exception
            //int convertToInteger=Integer.parseInt(s);

            //Custom Exception
            validateTransactionType("CASH");  
        }  
        catch (NullPointerException ex)  
        {  
        System.out.println("Null Pointer Exception :"+ex);
        } 
        catch (ArrayIndexOutOfBoundsException ex)  
        {  
        System.out.println("Array Index Out of Bound Exception :"+ ex);
        } 
        catch (ArithmeticException ex)  
        {  
        System.out.println("Arithmetic Exception :"+ ex);
        } 
        catch (NumberFormatException ex)  
        {  
       System.out.println("Number format Exception :" + ex);
        } 
        catch (InvalidTransactionType ex)  
        {  
       System.out.println("Custom Exception :" + ex);
        }
    }

    static void validateTransactionType(String txnType) throws InvalidTransactionType{    
        if(!txnType.equalsIgnoreCase("CASH")){  
            throw new InvalidTransactionType("Transaction Type is not valid");    
        }  
        else {   
            System.out.println("Valid Transaction");   
        }   
      }    
}

class InvalidTransactionType  extends Exception  
{  
    public InvalidTransactionType (String txnType)  
    {  
        super(txnType);  
    }  
}  