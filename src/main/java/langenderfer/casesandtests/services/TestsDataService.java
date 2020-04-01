package langenderfer.casesandtests.services;

import java.io.IOException;
import java.lang.InterruptedException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.annotation.PostConstruct;

import com.google.gson.Gson;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import langenderfer.casesandtests.models.StateTests;

@Service
public class TestsDataService {
  private String TESTS_API_URL = "https://covidtracking.com/api/states";
  private String STATE_POPS_URL = "https://simple.wikipedia.org/wiki/List_of_U.S._states_by_population";
  private String STATE_POST_CODES_URL = "https://www.infoplease.com/us/postal-information/state-abbreviations-and-state-postal-codes";

  private List<StateTests> allTests = new ArrayList<>();

  @PostConstruct
  public void fetchData() throws IOException, InterruptedException {

    // API Test data
    
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(TESTS_API_URL))
      .build();
    HttpResponse<String> httpResponse = client.send(
        request,
        HttpResponse.BodyHandlers.ofString()
    );

    Gson gson = new Gson();
    StateTests[] stateTests = gson.fromJson(httpResponse.body(), StateTests[].class);


    System.out.println("APIDATATEST");
    System.out.println(stateTests);

    for (StateTests stateTest : stateTests ) {
      System.out.println(stateTest);
    }

    // wikipedia state pops.
    
    Document doc = Jsoup.connect(STATE_POPS_URL).get();
    Map<String, String> statePops = new HashMap<String, String>();
    for (int i = 2; i < 58; i++) {
      String stateTemplate = String.format(
        "#mw-content-text > div > table > tbody > tr:nth-child(%s) > td:nth-child(3)",
        i
      ); 
      String popTemplate = String.format(
        "#mw-content-text > div > table > tbody > tr:nth-child(%s) > td:nth-child(4)",
        i
      );
      String state = doc.select(stateTemplate).text();
      String pop = doc.select(popTemplate).text();
      statePops.put(state, pop);
    }
    System.out.println(statePops);

    // State Postal Codes

    Document postalCodeDoc = Jsoup.connect(STATE_POST_CODES_URL).get();
    Map<String, String> statePostCodes = new HashMap<String, String>();
    // contiguous states
    for (int i = 1; i < 52; i++) {
      String stateTemplate = String.format(
        "#mainaside > article > table:nth-child(3) > tbody > tr:nth-child(%s) > td:nth-child(1) > a",
        i
      ); 
      String postalCodeTemplate = String.format(
        "#mainaside > article > table:nth-child(3) > tbody > tr:nth-child(%s) > td:nth-child(3)",
        i
      );
      String state = postalCodeDoc.select(stateTemplate).text();
      String postalCode = postalCodeDoc.select(postalCodeTemplate).text();
      statePostCodes.put(state, postalCode);
    }

    // territories
    for (int i = 1; i < 9; i++) {
      String stateTemplate = String.format(
        "#mainaside > article > table:nth-child(5) > tbody > tr:nth-child(%s) > td:nth-child(1) > a",
        i
      ); 
      String postalCodeTemplate = String.format(
        "#mainaside > article > table:nth-child(5) > tbody > tr:nth-child(%s) > td:nth-child(3)",
        i
      );
      String state = postalCodeDoc.select(stateTemplate).text();
      String postalCode = postalCodeDoc.select(postalCodeTemplate).text();
      statePostCodes.put(state, postalCode);
      
    }
    System.out.println("postal codes");
    System.out.println(statePostCodes);

  }

}
