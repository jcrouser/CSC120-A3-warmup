import static org.junit.Assert.*;
import org.junit.Test;


public class ConversationIntroTest {
	
	@Test
	public void Example_A() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("plusOne", 6, ci.plusOne(5));
    System.out.println("Passed plusOne test.");
	}
	
	@Test
	public void Exercise_1() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("timesTwo", 6, ci.timesTwo(3));
    System.out.println("Passed timesTwo test.");
	}
	
	@Test
	public void Exercise_2() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("squared", 9, ci.squared(3));
    System.out.println("Passed squared test.");
	}
	
	@Test
	public void Exercise_3() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("intDivideBy7", 2, ci.intDivideBy7(19));
    System.out.println("Passed intDivideBy7 test.");
	}
  	
	@Test
	public void Exercise_4() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("doubleDivideBy7", 19.0/7.0, ci.doubleDivideBy7(19),1e-14);
    System.out.println("Passed doubleDivideBy7 test.");
	}
    	
	@Test
	public void Example_B() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("isPrime #1", false, ci.isPrime(8));
    System.out.println("Passed isPrime test #1.");
		assertEquals("isPrime #2", true, ci.isPrime(37));
    System.out.println("Passed isPrime test #2.");

	}
  	
	@Test
	public void Exercise_5() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("isEven", true, ci.isEven(14));
    System.out.println("Passed isEven test.");
	}
      	
	@Test
	public void Example_C() {
		ConversationIntro ci = new ConversationIntro();
    String s = "A,B";
		assertEquals("isComma #1", true, ci.isComma(s.substring(1,2)));
    System.out.println("Passed isComma test #1.");
    assertEquals("isComma #2", false, ci.isComma(s.substring(0,1)));
    System.out.println("Passed isComma test #2.");
	}
  	
	@Test
	public void Exercise_6() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("isPunctuation #1", true, ci.isPunctuation("."));
    System.out.println("Passed isPunctuation test #1.");
		assertEquals("isPunctuation #2", true, ci.isPunctuation(","));
    System.out.println("Passed isPunctuation test #2.");
    assertEquals("isPunctuation #3", true, ci.isPunctuation("?"));
    System.out.println("Passed isPunctuation test #3.");
    assertEquals("isPunctuation #4", true, ci.isPunctuation("!"));
    System.out.println("Passed isPunctuation test #4.");
    assertEquals("isPunctuation #5", false, ci.isPunctuation("A"));
    System.out.println("Passed isPunctuation test #5.");
	}
  	
	@Test
	public void Exercise_7() {
		ConversationIntro ci = new ConversationIntro();
		assertEquals("mirrorWord #1", "you", ci.mirrorWord("I"));
    System.out.println("Passed mirrorWord test #1.");
		assertEquals("mirrorWord #2", "I", ci.mirrorWord("you"));
    System.out.println("Passed mirrorWord test #2.");
		assertEquals("mirrorWord #3", "test", ci.mirrorWord("test"));
    System.out.println("Passed mirrorWord test #3.");
	}

      	
	@Test
	public void Example_D() {
		ConversationIntro ci = new ConversationIntro();
    int[] expectedArray = {1,2,3,4};
    assertArrayEquals("wholeNumbers", expectedArray, ci.wholeNumbers(4));
    System.out.println("Passed wholeNumbers test.");
	}  

      	
	@Test
	public void Exercise_8() {
		ConversationIntro ci = new ConversationIntro();
    int[] expectedArray = {1,4,9,16,25};
    assertArrayEquals("squares", expectedArray, ci.squares(5));
    System.out.println("Passed squares test.");
	} 
}