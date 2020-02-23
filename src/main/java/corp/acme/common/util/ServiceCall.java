package corp.acme.common.util;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URL;

public class ServiceCall {
    public static WebClient.RequestHeadersSpec  buildDefaultCall(URI uri, String service, String content) {
        WebClient.RequestHeadersSpec spec = WebClient.create()
                .method(HttpMethod.POST)
                .uri(uri.toString()+"/"+service)
                .body(BodyInserters.fromValue(content))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_PLAIN_VALUE);
        return spec;
    }

    public static WebClient.RequestHeadersSpec buildDefaultJsonCall(URI uri, String service, Object object) {
        WebClient.RequestHeadersSpec spec = WebClient.create()
                .method(HttpMethod.POST)
                .uri(uri.toString()+"/"+service)
                .body(BodyInserters.fromValue(object))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        return spec;
    }
}
