package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T001_LoginYourStore {

    public WebDriver driver;

    @Given("^El usuario existe en la pagina Your Store$")
    public void el_usuario_existe_en_la_pagina_Your_Store() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opencart.abstracta.us/");
        driver.manage().window().maximize();
        driver.close();
        driver.quit();
    }

    @When("^Hace click en la opcion My Account en el navbar$")
    public void hace_click_en_la_opcion_My_Account_en_el_navbar() throws Throwable {
        System.out.println("Step When");
    }

    @And("^Selecciona la opcion Login e ingresa sus credenciales$")
    public void selecciona_la_opcion_Login_e_ingresa_sus_credenciales() throws Throwable {
        System.out.println("Step And");
    }

    @Then("^Se inicia sesion correctamente$")
    public void se_inicia_sesion_correctamente() throws Throwable {
        System.out.println("Step Then");
    }
}
