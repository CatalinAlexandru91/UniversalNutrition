package pages.LogInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance;


    private LogInPage() {
    }

    public static LogInPage getInstance() {
        if (instance == null) {
            instance = new LogInPage();
        }
        return instance;
    }
}
