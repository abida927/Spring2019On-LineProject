package day51;

public class JavaAssessment extends Assessment {

	int level ; 
//  int questionCount; 
//  int score; 
//  String type; 
  
//   static int timeLimit;  
  
  
  public static void main(String[] args) {
    
    // static way to access .timeLimit
    System.out.println( Assessment.timeLimit  );
    //  accessing inherited static field directly in static method
    System.out.println(  timeLimit );
    // accessing inherited static filed in static way 
    // using this class name 
    System.out.println(  JavaAssessment.timeLimit   );
    
    
    Assessment.printTimelimit();
    printTimelimit();
    JavaAssessment.printTimelimit();
    
    
    
  }
  
//  // static method can only access static members 
//    public static void printTimelimit() {
//      
//      System.out.println("time Limit " + timeLimit);
//      
//    }
//    
//    
//    
//    @Override
//    public String toString() {
//      return "Assesment [questionCount=" 
//          + questionCount + ", score=" + score 
//          + ", type=" + type + "]";
//    } 
	 
}
