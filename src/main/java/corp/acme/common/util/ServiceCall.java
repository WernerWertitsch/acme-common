package corp.acme.common.util;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URL;

public class ServiceCall {

    public static WebClient.RequestHeadersSpec buildDefaultGetCall(URI uri, String service) {
        return WebClient.create()
                .method(HttpMethod.GET)
                .uri(uri.toString()+"/"+service)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_PLAIN_VALUE);
    }

    public static WebClient.RequestHeadersSpec  buildDefaultCall(URI uri, String service, String content) {
        return  WebClient.create()
                .method(HttpMethod.POST)
                .uri(uri.toString()+"/"+service)
                .body(BodyInserters.fromValue(content))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_PLAIN_VALUE);
    }

    public static WebClient.RequestHeadersSpec buildDefaultJsonCall(URI uri, String service, Object object) {
        return WebClient.create()
                .method(HttpMethod.POST)
                .uri(uri.toString()+"/"+service)
                .body(BodyInserters.fromValue(object))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
    }
}
