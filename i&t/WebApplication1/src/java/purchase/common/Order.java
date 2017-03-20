package purchase.common;



public class Order {
 private String usern;
 private String Productn;
 private String status;
 private Integer id;
 
 
 public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }

    public String getProductn() {
        return Productn;
    }

    public void setProductn(String Productn) {
        this.Productn = Productn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  
}