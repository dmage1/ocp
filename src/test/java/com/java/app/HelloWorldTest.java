package com.java.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import lombok.extern.java.Log;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Log
public class HelloWorldTest {

  private String[] expectedArray;
  private String[] resultArray;
  private String string1 = "Junit";
  private String string2 = "Test";
  private String string3 = null;

  @BeforeClass
  public static void beforeClass() {
    logStr("BeforeClass");
  }

  @AfterClass
  public static void afterClass() {
    logStr("AfterClass");
  }

  private static void logStr(String str) {
    log.info(str);
  }

  @Before
  public void beforeTest() {
    logStr("BeforeTest");
    expectedArray = new String[]{string1, string2, string3};
    resultArray = new String[]{string1, string2, string3};
  }

  @After
  public void afterTest() {
    logStr("AfterTest");
    expectedArray = null;
    resultArray = null;
  }

  @Test
  public void testArrayEqual() {
    // The assertArrayEquals() method will test whether two arrays are equal to each other. In other words, if the two arrays contain the same number of elements, and if all the elements in the array are equal to each other.
    assertArrayEquals(expectedArray, resultArray);
  }

  @Test
  public void testEquals() {
    //The assertEquals() method compares two objects for equality, using their equals() method.
    assertEquals("one", "one");
  }

  @Test
  public void testBooleans() {
    // The assertTrue() and assertFalse() methods tests a single variable to see if its value is either true, or false.
    assertTrue(true);
    assertFalse(false);
  }

  @Test
  public void testNulls() {
    // The assertNull() and assertNotNull() methods test a single variable to see if it is null or not null.
    assertNull(string3);
    assertNotNull(string1);
  }

  @Test
  public void testObjects() {
    // The assertSame() and assertNotSame() methods tests if two object references point to the same object or not.
    assertSame(resultArray, resultArray);
    assertNotSame(string2, resultArray);
  }

  @Test
  public void testMatchers() {
    String obj1 = "Junit";
    String obj2 = "Junit";
    assertEquals(obj1, obj2);
  }
}
