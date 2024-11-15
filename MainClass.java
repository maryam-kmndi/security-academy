package ir.isc.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		Account a1 = new Account("Mary", "001", 150.00);
		Account a2 = new Account("Amir", "001", 500.00);
		Account a3 = new Account("Ali", "002", 5.00);
		Account a4 = new Account("Mina", "001", 10.00);
		Account a5 = new Account("Reza", "002", 120.00);
		Account a6 = new Account("Zahra", "001", 58.00);
		
		//1-make list of accounts-first solution
		Account[] accountsArray = {a1, a2, a3, a4, a5, a6};
		List<Account> accounts = Arrays.asList(accountsArray);
		
		//make list of accounts-second solution
//		List<Account> accounts = new ArrayList<>();
//		accounts.add(a1);
//		accounts.add(a2);
//		accounts.add(a3);
//		accounts.add(a4);
//		accounts.add(a5);
//		accounts.add(a6);
		
		
		//2-print accounts
		System.out.println("\nAccounts:\n");

		for (Account account : accounts) {
			System.out.println(account);
		}
		
		//3-sort by balance
		List<Account> sortedAccounts = Arrays.asList(accountsArray);

		Collections.sort(sortedAccounts, new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				return (int) (o1.getBalance()-o2.getBalance());
			}
		});
		
			System.out.println("\nAccounts sorted by balance ascending:\n");
			for (Account account : sortedAccounts) {
				System.out.println(account);
			}		
	
		//4-reverse sort
			Collections.reverse(sortedAccounts);
			System.out.println("\nAccounts sorted by balance Descending:\n");

			for (Account account : sortedAccounts) {
				System.out.println(account);
			}
			
		//5-Mapping
		List<Account> firstBranch = new ArrayList<>();
		firstBranch.add(a1);
		firstBranch.add(a2);
		firstBranch.add(a4);
		firstBranch.add(a6);

		List<Account> secondBranch = new ArrayList<>();
		secondBranch.add(a3);
		secondBranch.add(a5);
		
		Map<String, List<Account>> mapAccounts = new HashMap<>();
		mapAccounts.put("001", firstBranch);
		mapAccounts.put("002", secondBranch);
		
		//6-Print Map
		for (Map.Entry<String,List<Account>> entry : mapAccounts.entrySet()) {
			String key = entry.getKey();
			List<Account> val = entry.getValue();
			System.out.println("Branch code: " + key + "\n" + val + "\n");
		}
		
		//7-Remove branch 002
		List<Account> removedAccounts = mapAccounts.remove("002");
		System.out.println("Removed accounts:\n " + removedAccounts + "\n");
		
		for (Map.Entry<String, List<Account>> entry : mapAccounts.entrySet()) {
			String key = entry.getKey();
			List<Account> val = entry.getValue();
			System.out.println("Remaining accounts\n: " + key + val);
		}
		
//_____________________________________________________________________________
		
		//return accounts start with "A"	
		List<Account> accountsStartWithA = 
				accounts.stream()
						.filter(t -> t.getName().startsWith("A"))
						.collect(Collectors.toList());
		System.out.println("\nAccounts start with A:\n " + accountsStartWithA);
	
		
		//capsLock accounts name
		List<Account> accountsNameCapslock = accounts.stream()
			    .map(account -> {
			        account.setName(account.getName().toUpperCase());
			        return account;})
			    .collect(Collectors.toList());
		System.out.println("\nUpperCase accounts name:\n " + accountsNameCapslock);
	
		
		//accounts which balance > 10 && startsWith "A"
		//using filter chain
		List<Account> filteredAccounts =
				accounts.stream()
						.filter(t -> t.getBalance() > 10)
						.filter(t -> t.getName().startsWith("A"))
						.collect(Collectors.toList());
		System.out.println("\nFiltered Accounts:\n " + filteredAccounts);			
		
		//using logical and
		List<Account> filteredAccounts2 =
				accounts.stream()
						.filter(t -> t.getBalance() > 10 && t.getName().startsWith("A"))
						.collect(Collectors.toList());
		System.out.println("\nFiltered Accounts:\n " + filteredAccounts2);
		
	}

}
