import java.util.*;

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return owner.toString() + "Account ID: " + getId() + " | Account Balance: " + getBalance() + "\n";
    }
}

interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}


// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService{
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        Account foundAccount = null;

        for (Account account : accounts){
            if (account.getId() == id){
                foundAccount = account;
            }
        }
        return foundAccount;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;

        for (Account account : accounts){
            if (account.getBalance() > value){
                count++;
            }
        }

        return count;
    }

}


class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getID() {
        return id;
    }

    @Override
    public String toString() {
        return "User's name: " + getFirstName() + " " + getLastName() + "\n";
    }
}

class AccountDriver {

    public static void main(String[] args) {
        User[] users = {
                new User(123456, "Noah", "Calhoun"),        // The Notebook
                new User(234567, "Allie", "Hamilton"),      // The Notebook
                new User(345678, "Jack", "Dawson"),         // Titanic
                new User(456789, "Rose", "DeWitt"),         // Titanic
                new User(567890, "Tim", "Lake"),            // About Time
                new User(678901, "Mary", "Hollis"),         // About Time
                new User(789012, "Connell", "Waldron"),     // Normal People
                new User(890123, "Marianne", "Sheridan"),   // Normal People
                new User(901234, "Oliver", "Parker"),       // Love at First Sight
                new User(912345, "Hadley", "Sullivan")      // Love at First Sight
        };


        Account[] accounts = new Account[10];
        long[] ids = {
                270485196,
                516492380,
                450829317,
                263057489,
                516708423,
                386915407,
                358917462,
                198316427,
                218730965,
                234324543
        };

        long[] balances = {
                1446129,
                983835,
                1362881,
                1174917,
                1759729,
                1799210,
                860747,
                1308262,
                1600240,
                1353718
        };

        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(ids[i], balances[i], users[i]);
        }

        long inputId, inputBalance;
        String[] inputs;
        Account resultAccount;
        long resultCount;

        inputs = args[0].split(",");

        try {
            inputId = Long.parseLong(inputs[0]);
            inputBalance = Long.parseLong(inputs[1]);

            AccountServiceImpl service = new AccountServiceImpl(accounts);
            resultAccount = service.findAccountByOwnerId(inputId);
            resultCount = service.countAccountsWithBalanceGreaterThan(inputBalance);

            if (resultAccount == null) {
                System.err.println("No Record Found With Given ID Number: " + inputId + "\n");
            } else {
                System.out.println("Found Account with ID number: " + inputId + "\n" + resultAccount.toString());
            }

            System.out.println("Accounts with balance greater than " + inputBalance + ": " + resultCount);

        } catch (NumberFormatException e) {
            System.err.println("Arguments " + inputs[0] + " must be an Integer and " + inputs[1] + " must be a Float: " + e.getMessage());
        }



    }
}

