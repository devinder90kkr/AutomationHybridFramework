package cuesz.utils;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class ApiUtils {
    private final HttpClient client;

    public ApiUtils() {
        this.client = HttpClient.newHttpClient();
    }

    public String getTeamMemberData(String searchString) throws IOException, InterruptedException {
        String url = "https://pre-stageapi.app.cuesz.com/v3/team/member";
        String encodedSearchString = URLEncoder.encode(searchString, StandardCharsets.UTF_8);
        String authorizationToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY0NDkxOTdlMjlmMjkwMzMzMzkyZjBlNiIsImRhdGUiOjE3MDI1Mzc2MTg1MzUsImlhdCI6MTcwMjUzNzYxOCwiZXhwIjoxNzAyNTM3OTE4fQ.mvT0dWPTvy5c8eSZPSoVAhqH0bdT2WfRJcmzjJyjNnE";
        String apiKey = "sdnf4ewqu58_wwu";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + "?searchString=" + encodedSearchString))
                .header("accept", "application/json")
                .header("authorization", authorizationToken)
                .header("X-API-KEY", apiKey)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new IOException("Failed to fetch team member data, status code: " + response.statusCode());
        }
    }
}
