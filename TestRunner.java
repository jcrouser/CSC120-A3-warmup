import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main(String[] args) {
    System.out.println("Running unit tests...");
    Result result = JUnitCore.runClasses(ConversationIntroTest.class);
    
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
      break;  // comment out this line to see tests after first fail
    }
    
    if (result.wasSuccessful()) {
      System.out.println("All tests completed successfully.");
    }
  }
}