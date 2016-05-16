/**
 * Created by taisho6339 on 2016/05/17.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message: " + this.message);
    }
}
