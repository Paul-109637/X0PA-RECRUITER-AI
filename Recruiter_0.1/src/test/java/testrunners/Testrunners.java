package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/featurefiles.feature",glue="stepdefinitions",
dryRun=false,plugin={"plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html"},tags={"@RecruiterLogin,@RecruiterLogout,@CreateNewJob"})
public class Testrunners 
{
	

}
