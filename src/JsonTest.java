import org.json.simple.JSONObject;

// Program for print data in JSON format.
public class JsonTest {
    public static void main(String args[])
    {
        // In java JSONObject is used to create JSON object
        // which is a subclass of java.util.HashMap.

        JSONObject file = new JSONObject();

        file.put("Full Name", "Ritu Sharma");

        // To print in JSON format.
        System.out.print(file);
    }
}
