import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class BlockChain <T>{

	private ArrayList<Block<T>> chain;
	public BlockChain() {
		this.chain = new ArrayList<>();
		this.chain.add(createGenesisBlock());
	}
	
	private Block<T> createGenesisBlock() {
		LocalDate date = LocalDate.of(2017, 1, 1); 
		LocalTime time = LocalTime.of(0, 0);
		return new Block<T>(0, null, LocalDateTime.of(date, time), "0");

	}
	
	public Block<T> getLatestBlock(){
		return this.chain.get(this.chain.size() - 1);
	}
	
	public void addBlock(Block<T> newBlock) {
		
	}
}
