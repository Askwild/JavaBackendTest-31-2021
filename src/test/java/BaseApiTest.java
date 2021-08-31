import java.io.IOException;

abstract class BaseApiTest {


    private final String token;
    private final String baseUri;
    private final String username;
    private final PropertyScanner scanner;

    public BaseApiTest() throws IOException {
        scanner = new PropertyScanner();

        token = scanner.getProperty("imgur.auth.token");
        baseUri = scanner.getProperty("imgur.api.url");
        username = scanner.getProperty("imgur.username");
    }

    public String getToken() {
        return token;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public String getUsername() {
        return username;
    }

    public PropertyScanner getScanner() {
        return scanner;
    }
}
