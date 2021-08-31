import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public final class FileUtils {

    private FileUtils() {}

    public static String getResourceAsBase64(String resourceName) throws URISyntaxException, IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(FileUtils.class.getResource(resourceName).toURI()));
       return new String(Base64.getDecoder().decode(bytes));

    }
    public static byte[] getResourceAsByteArray(String resource) throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(FileUtils.class.getResource(resource).toURI()));
        return bytes;

    }
}
