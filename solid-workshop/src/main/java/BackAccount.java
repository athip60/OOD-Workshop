class BankAccount {
}

interface BankAccountProcess {
    public void transferMoney(BankAccount target, double amount);
}

class LocalBankAccount implements BankAccountProcess{
    public void transferMoney(BankAccount target, double amount) {
        // Local
    }
}

class InterBankAccount implements BankAccountProcess {
    public void transferMoney(BankAccount target, double amount) {
        // Inter
    }
}

class TransferProcess {
    BankAccountProcess process(String type) {
        if ( "LOCAL".equals(type) ) {
            return new LocalBankAccount();
        }
        if ( "INTER".equals(type) ) {
            return new InterBankAccount();
        }
        throw new RuntimeException("NO NO NO");
    }
}

class Client {
    // Local + Inter
    void start(String type, BankAccount target, int opts) {
        TransferProcess transferProcess = new TransferProcess();
        transferProcess.process(type).transferMoney(target, 1000);
        transferProcess.process(type).transferMoney(target, 500);
    }
    // API 1
    void startForLocal(BankAccount target, double amount) {
        new LocalBankAccount().transferMoney(target, amount);
    }
    // API 2
    void startForInter(BankAccount target, double amount) {
        new InterBankAccount().transferMoney(target, amount);
    }
}