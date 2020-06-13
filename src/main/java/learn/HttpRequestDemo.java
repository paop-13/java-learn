package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HttpRequestDemo {
    public String getRequest() throws IOException {
        URL url = new URL("http://api.icndb.com/jokes/random");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer json = new StringBuffer();
        String line;

        while ((line = reader.readLine()) != null) {
            json.append(line);
        }
        reader.close();
        return json.toString();
    }
}
