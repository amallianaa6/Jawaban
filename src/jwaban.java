public class jwaban {
    private String Nama;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String noTelp) {
        NoTelp = noTelp;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    public jwaban(String Nama, String User, String NoTelp, String Password){
        this.Nama= nama;
        this.UserID= usid;
        this.NoTelp = notelp;
        this.Password = pw;
        System.out.println("Nama");
        System.out.println("UserID");
        System.out.println("NoTelp");
        System.out.println("Password")
    }

    private String UserID;
    private String NoTelp;
    private String Password;
}
