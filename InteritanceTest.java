class Backend {
    protected String language = "Java";       
    public void greetings() {                    
      System.out.println("Hello Everyone!");
    }
  }
  
public class InteritanceTest extends Backend {
    private String framwork = "Spring Boot"; 
    public static void main(String[] args) {
        InteritanceTest interitanceTest = new InteritanceTest();
        interitanceTest.greetings();
        System.out.println(interitanceTest.language + " " + interitanceTest.framwork);
    }
}
