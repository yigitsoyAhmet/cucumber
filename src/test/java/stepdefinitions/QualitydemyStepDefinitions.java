package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;

public class QualitydemyStepDefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();


    @Then("ilk login linkine click yapar")
    public void ilk_login_linkine_click_yapar() {
        if (qualitydemyPage.cookies.isDisplayed()) {
            qualitydemyPage.cookies.click();
        }
            qualitydemyPage.ilkLoginLinki.click();
    }
        @Then("user email olarak {string} girer")
        public void user_email_olarak_girer (String kullaniciEmail){
            qualitydemyPage.emailKutusu.sendKeys(kullaniciEmail);
        }
        @Then("password olarak {string} girer")
        public void password_olarak_girer (String kullaniciPassword){
            qualitydemyPage.passwordKutusu.sendKeys(kullaniciPassword);
        }
        @When("login butonuna basar")
        public void login_butonuna_basar () {

            qualitydemyPage.loginButonu.click();
        }
        @Then("giriş yapilamadigini test eder")
        public void giris_yapilamadigini_test_eder () {
            Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        }


    }

