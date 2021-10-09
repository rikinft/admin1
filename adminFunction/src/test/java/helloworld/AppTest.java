package helloworld;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fintuple.admin.functions.adminReport.GetInternalUserDashBoardDataFunction;
import org.junit.Test;

public class AppTest {
  @Test
  public void successfulResponse() {
    GetInternalUserDashBoardDataFunction app = new GetInternalUserDashBoardDataFunction();
    APIGatewayProxyResponseEvent result = app.handleRequest(null, null);
    assertEquals(result.getStatusCode().intValue(), 200);
//    assertEquals(result.getHeaders().get("Content-Type"), "application/json");
//    String content = result.getBody();
//    assertNotNull(content);
//    assertTrue(content.contains("\"message\""));
//    assertTrue(content.contains("\"hello world\""));
//    assertTrue(content.contains("\"location\""));
  }
}
