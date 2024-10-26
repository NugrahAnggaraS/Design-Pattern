package singleton_object;


// file AccountService.java
class AccountService{
    public void saveAccount(String name,String password){
        DatabaseHelper.setInstance().query("Melakukan Query SQL DISINI");
    }
}