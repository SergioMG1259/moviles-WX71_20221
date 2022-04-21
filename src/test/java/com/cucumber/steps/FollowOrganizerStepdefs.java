package com.cucumber.steps;
import com.frikiteam.events.configuration.MyWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FollowOrganizerStepdefs {
    String Path = System.getProperty("user.dir");
    public  WebDriver webDriver = MyWebDriver.getWebDriver();

    @Given("user wants to follow an organizer")
    public void userWantsToFollowAnOrganizer() {
        webDriver.findElement(By.xpath("html/body/app-root/app-nav-bar/mat-toolbar/button[5]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("josias@correo.com");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("contraseña123");
        webDriver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-sidenav-container/mat-sidenav-content/main/app-login/div/form/button")).click();
        try {
            Thread.sleep(3*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @When("choose the organizer you want to follow")
    public void chooseTheOrganizerYouWantToFollow() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-sidenav-container/mat-sidenav-content/main/app-home/div/div[3]/div/mat-card")).click();
        try {
            Thread.sleep(1*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        webDriver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-sidenav-container/mat-sidenav-content/main/app-event/mat-drawer-container/mat-drawer/div/div/div[1]/div[3]/button")).click();
        try {
            Thread.sleep(1*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Then("the system notifies you that you are now following that organizer")
    public void theSystemNotifiesYouThatYouAreNowFollowingThatOrganizer() {
    }
}
