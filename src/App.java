import java.time.LocalDateTime;
import java.util.*;

public class App {

	public static void main(String[] args) {
		Block<String> b = new Block<>(0, "hello world", LocalDateTime.now(), "");
		
		System.out.println(b.hash);
	}
}
