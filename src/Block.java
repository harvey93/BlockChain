import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.*;

public class Block <T>{
	int index;
	String previousHash = "";
	LocalDateTime timeStamp;
	T data;
	String hash;
	
	public Block(int index,  T data, LocalDateTime timeStamp, String previousHash) {
		this.index = index;
		this.data = data;
		this.timeStamp = timeStamp;
		this.previousHash = previousHash;
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		}catch(NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		String dataString = this.data == null ? "null" : this.data.toString();
		String text = this.index + this.previousHash + this.timeStamp + dataString;
		
		
		try {
			md.update(text.getBytes("UTF-16"));
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		} 
		
		byte[] digest = md.digest();
		
		return String.format("%064x", new java.math.BigInteger(1, digest));
		
	}
	
	public String toString(){
		return "{" + " index: " + this.index + ", data: " + this.data + ", timeStamp" + 
				this.timeStamp + ", prevHash: " + this.previousHash + ", Hash: " + this.hash + " } \n";
	}
	
	
}
