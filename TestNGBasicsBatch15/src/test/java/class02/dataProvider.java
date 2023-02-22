package class02;

import org.testng.annotations.DataProvider;

public class dataProvider {
    @DataProvider(name = "credential")
    public Object[][] data() {
        Object[][] loginData = {
                {"Admin", "12345", "Invalid", "credential"},
                {"ABCD", "HUM@nhrm123", "Invalid", "credentials"},
                {"Admin", "", "Password cannot be empt"},
                {"", "Hum@nhrm123qs", "Invalid", "credential"}};

        return loginData;
    }
}
