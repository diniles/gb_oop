package seminar6;

import java.util.HashMap;
import java.util.Map;

public class Formats {
    private final Map<String, Format> reportFormats = new HashMap<>();

    public void addFormat(String name, Format format) {
        reportFormats.put(name, format);
    }
}
