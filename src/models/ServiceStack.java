package models;

import java.util.Stack;

import models.errors.EmptyStackException;
import models.errors.NotFoundException;

public class ServiceStack {
	
	Stack<Client> clientStack;
	public ServiceStack() {
		clientStack = new Stack<Client>();
		addClient(new Client(01, "Jass", "#14"));
		addClient(new Client(02, "Juan", "#15"));
		addClient(new Client(03, "Jill", "#16"));
		addClient(new Client(04, "AllJ", "#17"));
		addClient(new Client(05, "Fllls", "#18"));
	}
	
	public void addClient(Client client) {
		clientStack.push(client);
	}
	
	public String listClient() {
		String chain = "";
		if(!clientStack.empty()) {
			for (int i = 0; i < clientStack.size(); i++) {
				chain += clientStack.get(i)+ "\n";
			}
		}
		return chain;
	}
	
	public String searchClientByCodeCount(String codeCount) throws NotFoundException, EmptyStackException {
		String chain = "";
		if(!clientStack.empty()) {
			for (int i = 0; i < clientStack.size(); i++) {
				if(clientStack.get(i).getCodeCount().equals(codeCount)) {
					return chain += clientStack.get(i);
				}
			}
			throw new NotFoundException();
		}
		throw new EmptyStackException();
	}
	
	public String getLastClient() {
		String chain = "";
		if(!clientStack.empty()) {
			chain += clientStack.peek();
		}
		return chain;
	}

	public boolean deleteClient() throws EmptyStackException{
		if(!clientStack.empty()) {
			clientStack.pop();
			return true;
		}
		throw new EmptyStackException();
	}
	
	public static void main(String[] args) {
		ServiceStack service = new ServiceStack();
		service.addClient(new Client(06, "JJSS", "#19"));
		System.out.println(service.listClient());
		try {
			System.out.println(service.searchClientByCodeCount("#16")+"\n");
		} catch (NotFoundException e) {
			e.printStackTrace();
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		System.out.println(service.getLastClient());
	}
}
