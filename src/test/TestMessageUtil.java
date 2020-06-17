package test;

import main.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

  String message = "Strohm";
  MessageUtil messageUtil = new MessageUtil(message);

  @Test
  public void testPrintMessage() {
    System.out.println("Inside testPrintMessage()");
    assertEquals(message, messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + "Strohm";
    assertEquals(message, messageUtil.salutationMessage());
  }
}