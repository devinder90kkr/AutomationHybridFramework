//package ApiTestScript;
//
//import org.json.JSONObject;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import cuesz.utils.api.ApiUtils;
//import io.qameta.allure.Allure;
//import java.io.IOException;
//
//public class Case16_MS_searchclickapi {
//   // private final ApiUtils apiUtils = new ApiUtils();
//
//    @Test
//    public void searchTeamMemberApi() {
//    	  String searchString = "Kumar Devinder"; // Adjust this as per your test case
//          String apiUrl = cuesz.utils.api.ApiConfig.API_URL1; // Use the desired API URL from ApiConfig
//
//          // Create an instance of ApiUtils with the specific API URL
//          ApiUtils apiUtils = new ApiUtils(apiUrl);
//
//        try {
//            String response = apiUtils.getTeamMemberData(searchString);
//            
//            // Print response to the console
//            System.out.println("Response Body: " + response);
//            
//            // Attach the response body to Allure report
//            Allure.addAttachment("Response Body", "application/json", response);
//            
//            JSONObject jsonResponse = new JSONObject(response);
//            JSONObject dataObject = jsonResponse.getJSONArray("data").getJSONObject(0);
//            String name = dataObject.getString("name");
//            
//            // Attach the extracted name to Allure report
//            Allure.addAttachment("Extracted Name", "text/plain", name);
//
//            // Asserting the name is as expected
//            Assert.assertEquals(name, searchString, "The name in the response does not match the expected name.");
//
//            // Since userType is an integer, use getInt to retrieve it
//            int userType = dataObject.getInt("userType");
//            
//            // Attach the extracted userType to Allure report
//            Allure.addAttachment("User Type", "text/plain", String.valueOf(userType));
//
//            // Assuming you want to attach the timezone as well
//            String timeZone = dataObject.getString("timeZone");
//            Allure.addAttachment("Time Zone", "text/plain", timeZone);
//
//        } catch (IOException e) {
//            e.printStackTrace(); // Print the stack trace for debugging
//            Assert.fail("The test failed due to an IOException: " + e.getMessage());
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt(); // Handle interrupted exception properly
//            Assert.fail("The test was interrupted: " + e.getMessage());
//        }
//    }
//}
