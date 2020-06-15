package learn;

import com.fasterxml.jackson.databind.ObjectMapper;

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
        ObjectMapper mapper = new ObjectMapper();
        Jokes jokes = mapper.readValue(json.toString(), Jokes.class);
        return "type = " + jokes.type + "value.id = " + jokes.value.id + "value.joke = " + jokes.value.joke;
    }
}

class Jokes {
    public String type;
    public Value value;
}

class Value {
    public String id;
    public String joke;
    public String[] categories;
}
