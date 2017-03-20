
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CommonLayer;

/**
 *
 * @author Amirsaleh
 */
public class User {
 private String name;
 private String familyName;
 private String userName;
 private String passWord;
 private boolean security;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isSecurity() {
        return security;
    }

    public void setSecurity(boolean security) {
        this.security = security;
    }


}
