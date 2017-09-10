import java.time.LocalDateTime;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		BlockChain<String> bc = new BlockChain<>();
		Block<String> b = bc.getLatestBlock();
		System.out.println(b.hash);
		
	}
}
