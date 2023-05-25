package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("Kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
      amazonPage.aramaKutusu.sendKeys("Nutella" +Keys.ENTER);
     // amazonPage.aramaKutusu.click();

    }
    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik="Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
      Driver.closeDriver();
    }



    @When("Java icin arama yapar")
    public void java_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("Java");
        amazonPage.aramaKutusu.submit();
    }
    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik="Java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }


    @Then("Title'in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String actualtitle=Driver.getDriver().getTitle();
        String expectedIcerik="Amazon";
    }

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {//amazonUrl,wiseUrl

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @When("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakKelime) {
        amazonPage.aramaKutusu.sendKeys(aranacakKelime+Keys.ENTER);

    }

    @Then("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String expectedIcerik) {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) {
        //cucember sayi yazildiginda direk parametre olarak kabul eder
        try {
            Thread.sleep(beklenecekSaniye*1000);
        } catch (InterruptedException e) {

        }

    }
}
