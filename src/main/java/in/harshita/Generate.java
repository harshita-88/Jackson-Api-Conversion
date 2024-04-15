package in.harshita;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Generate {
	
	public void ObjToJson() throws Exception {
		Customer c = new Customer(1, "Riya", "riya@gmail.com");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("Completed...");		
	}
	
	public void JsonToObj() throws Exception{
		File f = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		
		Customer customer = mapper.readValue(f, Customer.class);
		System.out.println(customer);	
	} 

	public static void main(String[] args) throws Exception {
		Generate g = new Generate();
		g.JsonToObj();		
		
	}

}
