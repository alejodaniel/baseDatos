package ejercicio;

public class Datos {

    private String hostbame;
    private String puerto;
    private String username;
    private String password;
    private String base;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Datos() {
    }

    public Datos(String hostbame, String puerto, String username, String password, String base) {
        this.hostbame = hostbame;
        this.puerto = puerto;
        this.username = username;
        this.password = password;
        this.base = base;
    }

    public String getHostbame() {
        return hostbame;
    }

    public void setHostbame(String hostbame) {
        this.hostbame = hostbame;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
