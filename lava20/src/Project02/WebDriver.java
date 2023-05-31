package Project02;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenShot {
    void getScreenShot();
}
interface RemoteDriver extends TakeScreenShot,WebDriver {
    void navigate();
}
class SafariDriver implements WebDriver{
    public void open(){
        System.out.println("Open Safari website");
    }

    @Override
    public void close() {
        System.out.println("Close Safari now");
    }

    @Override
    public String getTitle() {
        return null;
    }
    }

class FirefoxDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox now");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox now");
    }

    @Override
    public String getTitle() {
        return null;

    }
}
class ChromeDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }
}