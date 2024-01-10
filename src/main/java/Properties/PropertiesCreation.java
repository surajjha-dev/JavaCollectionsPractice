package Properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesCreation {
    public static void main(String[] args) {

        Properties p = new Properties();
        p.setProperty("Suraj", "Java Developer");
        p.setProperty("Sumit", "Full Stack");
        p.setProperty("Aman", "Software Engineer");

        Iterator iterator = p.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
