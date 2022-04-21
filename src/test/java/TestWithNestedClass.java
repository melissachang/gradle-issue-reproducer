import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
 
public class TestWithNestedClass {
  @Test
  void root() {}

  @Nested
  class NestedClass {
    @Test
    void nestedTest() {}
  }
}
 
