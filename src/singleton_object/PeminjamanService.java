package singleton_object;

// file PeminjamanService.java
public class PeminjamanService {
    public void pinjamBuku(String idUser,String idBuku){
        DatabaseHelper.setInstance().query("Melakukan QUERY SQL DISINI");
    }
}
