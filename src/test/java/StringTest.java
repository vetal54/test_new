import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringsTest {

  private static final int ITERATIONS = 500_000;
  private long start;
  private long end;
  private long result;

  @Test
  void allTest() {
    long stringResult = stringTest();
    long stringBuilderResult = stringBuilderTest();
    long stringBufferResult = stringBufferTest();

    assertAll(
        () -> assertTrue(stringResult > stringBufferResult && stringResult > stringBuilderResult),
        () -> assertTrue(stringBuilderResult < stringBufferResult)
    );
  }

  private long stringTest() {
    start = System.currentTimeMillis();
    String str = "";
    for (int i = 0; i < ITERATIONS; i++) {
      str += "a";
    }
    end = System.currentTimeMillis();
    result = end - start;

    System.out.println("String: " + result);

    return result;
  }

  public long stringBuilderTest() {
    start = System.currentTimeMillis();
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < ITERATIONS; i++) {
      str.append("a");
    }
    end = System.currentTimeMillis();
    result = end - start;

    System.out.println("StringBuilder: " + result);

    return result;
  }

  public long stringBufferTest() {
    start = System.currentTimeMillis();
    StringBuffer str = new StringBuffer();
    for (int i = 0; i < ITERATIONS; i++) {
      str.append("a");
    }
    end = System.currentTimeMillis();
    result = end - start;

    System.out.println("StringBuffer: " + result);

    return result;
  }
}
