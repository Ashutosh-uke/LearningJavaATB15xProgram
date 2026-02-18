package ex_25_ENUM;

public class Locators {
    void page_input_email("//*[@id=\"login-username\"]"),
    void page_input_password("//*[@id=\"login-password\"]"),
    void page_button("#btn");

    private String locator;
    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}
