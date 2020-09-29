package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
public class AmazonAramaStepdefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("http://amazon.com");

    }

    @Given("headphone aramasi yapar")
    public void headphone_aramasi_yapar() {
        amazonPage.aramaKutusu.sendKeys("headphones" + Keys.ENTER);
    }

    @Then("sonucu ekrana yazdirir")
    public void sonucu_ekrana_yazdirir() {
        System.out.println(amazonPage.sonucSayisi.getText());
    }

    @Given("camera aramasi yapar")
    public void camera_aramasi_yapar() {
        amazonPage.aramaKutusu.sendKeys("camera" + Keys.ENTER);
    }

    @Given("kullanici aramakutusuna {string} yazar ve arar")
    public void kullanici_aramakutusuna_yazar_ve_arar(String string) {
        amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici sonuc sayisini ekrana yazdirir")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.sonucSayisi.getText());

    }

    @Given("kullanici dropdownda {string} secer")
    public void kullanici_dropdownda_secer(String string) {
        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);


    }
}