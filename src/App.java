import java.time.LocalDateTime;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		BlockChain<String> bc = new BlockChain<>();
		bc.addBlock(new Block<String> (1, "hrant Mirijanyan", LocalDateTime.now(), ""));
		bc.addBlock(new Block<String> (2, "khacho Mirijanyan", LocalDateTime.now(), ""));
		bc.addBlock(new Block<String> (3, "vuzh Kadoyan", LocalDateTime.now(), ""));
		System.out.println(bc);
		
		System.out.println(bc.isChainValid());
	}
}
