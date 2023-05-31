package Project02;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webs={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for (WebDriver w:webs){
            w.open();
            w.close();
            w.getTitle();

                }
            }
        }



