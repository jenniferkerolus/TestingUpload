package HomeWork25;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
        void maximizeWindow();
       void  findElement();
    }
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("You can login and open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You can logout from your browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You can maximize your window");
    }

    @Override
    public void findElement() {
        System.out.println("It is easy to find your elements");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Enter your username and password to open ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You can shut down your browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You can check your setting ");
    }

    @Override
    public void findElement() {
        System.out.println("You can find elements more than one ");
    }
}
