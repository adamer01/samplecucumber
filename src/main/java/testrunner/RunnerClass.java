package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="C:\\Users\\adamer01\\Documents\\Selenuim Practise\\Test Scripts\\samplecucumber\\src\\main\\java\\features\\login.feature",
glue={"stepdefination"},
format= {"pretty","html:test-output"}
)
public class RunnerClass 
{

}
