package tests.data;

public class Data {

    public static final String mainUrl = "https://www.seleniumeasy.com/test/";

    public static String driverPath;

    public static final int defaultTimeOut = 2;

    public static int defaultMaximumWaitingTime = 10000;

    static{
        driverPath = System.getProperty("user.dir") + "/webDriver/chromedriver.exe";
    }
}
