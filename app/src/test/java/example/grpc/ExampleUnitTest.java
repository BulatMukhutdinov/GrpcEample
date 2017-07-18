package example.grpc;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

  @Test
  public void test1() throws Exception {
    ApiUser apiUser = new ApiUser();
    boolean result = false;
    Assert.assertFalse(result);
  }

  @Test
  public void test2() throws Exception {
    ApiUser apiUser = new ApiUser();
    boolean result = true;
    Assert.assertTrue(result);
  }
}