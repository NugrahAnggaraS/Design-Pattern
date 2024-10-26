package singleton_object;

public class Singleton{
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.saveAccount("user1", "user123");

        PeminjamanService peminjamanService = new PeminjamanService();
        peminjamanService.pinjamBuku("123", "123");
    }
}