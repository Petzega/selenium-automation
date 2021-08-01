package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"tests"},
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:results/cucumber-reports/report.html",
                "json:results/cucumber-reports/report.json"}
)

public class TestRunner {
    @AfterClass
    public static void createReportJS() {
        try {
            System.out.println("Generando reporte JS");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte generado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
