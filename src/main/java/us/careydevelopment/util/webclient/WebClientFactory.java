package us.careydevelopment.util.webclient;

import org.springframework.web.reactive.function.client.WebClient;


/**
 * Used to create a WebClient instance.
 */
public class WebClientFactory {

    /**
     * Accepts the base endpoint of a downstream service and builds the client.
     * 
     * Calling classes can append whatever endpoints they need to the base endpoint
     * and make requests.
     * 
     * @param endpoint -the base endpoint as a string (e.g., "http://mycoolservice.com")
     * @return WebClient instance
     */
    public static WebClient createWebClient(String endpoint) {
        WebClient client = WebClient
                                .builder()
                                .baseUrl(endpoint)
                                .filter(WebClientFilter.logRequest())
                                .filter(WebClientFilter.logResponse())
                                .filter(WebClientFilter.handleError())
                                .build();
        
        return client;
    }
}
