package amit.springframework.amitdempExternalPropertyWithSpring.examplebeans;

/**
 * created by KUAM on 4/24/2020
 */
public class FakeDataSource {

    private String username;
    private String password;
    private String dburl;

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

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
}
