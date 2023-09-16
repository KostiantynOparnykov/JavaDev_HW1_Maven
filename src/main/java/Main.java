import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User("Kostiantyn", "Oparnykov");

        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writeValueAsString(user));
    }
}
