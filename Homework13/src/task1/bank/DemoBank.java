package task1.bank;

import java.util.ArrayList;
import java.util.List;

import task1.bank.client.Client;
import task1.bank.client.ClientException;
import task1.bank.client.IClient;

public class DemoBank {

	private static final int LOAN_BASE = 500;
private static final int LOAN_RANGE = 1_000;
private static final int NUM_CLIENTS = 10;

	public static void main(String[] args) throws BankException, ClientException {
		IBank dskBank = new Bank("Banka DSK Q!", "Zoopakra v Goce Delchev");
		
		List<IClient> clients = new ArrayList<IClient>(NUM_CLIENTS); 
		for(int index = 0;index < NUM_CLIENTS;index++){
			clients.add(new Client("Client " + index, "ul.Kukuvica No." + index));
		}
		outputInfo("Before deposit :",dskBank, clients);
		
		int[][] deposits = { {3 , 3} , { 5 , 12} };
		int[] loans = { 6 , 10};
		
		clients.forEach(client -> {
			int holder = (int)(Math.random()*2);
			client.depositMoney(dskBank, deposits[holder][0], deposits[holder][1],
				((Math.random()/5) + 0.8)*client.getCapital());
		});
		
		outputInfo("After deposit :", dskBank, clients);
		
		clients.forEach(client -> {
			client.takeLoan(dskBank, loans[(int)(Math.random()*2)],
					(int)(Math.random()*50), (int)(Math.random()*LOAN_RANGE + LOAN_BASE));
		});
		
		outputInfo("After loans :", dskBank, clients);

	}

	private static void outputInfo(String message,IBank dskBank, List<IClient> clients) {
		System.out.println(message);
		System.out.println(dskBank);
		System.out.println();
		clients.forEach(client -> client.print());
		System.out.println();
	}

}
