package amit.springframework.amitdempExternalPropertyWithSpring.examplebeans;

/**
 * created by KUAM on 4/24/2020
 */
public class FakeJMSBroker {

    private String user;
    private String pass;
    private String dburl;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
}
