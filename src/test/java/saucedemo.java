import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class saucedemo {
//    @AfterTest
//    public void Test() {
//        _globalDriver.close();
//    }

    WebDriver _globalDriver;

    @BeforeTest
    public void openUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        _globalDriver = new ChromeDriver(options);
        _globalDriver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testCase() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement addToCart4 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCart4.click();
        WebElement addToCart5 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCart5.click();
        WebElement addToCart6 = _globalDriver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCart6.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cart.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement checkout = _globalDriver.findElement(By.id("checkout"));
        checkout.click();
        _globalDriver.findElement(By.id("first-name")).sendKeys(generateUsername());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("last-name")).sendKeys(generateUsername());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("postal-code")).sendKeys("41514");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement next = _globalDriver.findElement(By.id("continue"));
        next.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement finish = _globalDriver.findElement(By.id("finish"));
        finish.click();


    }

    @Test
    public void TCSort() {

        _globalDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement sortButton = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        sortButton.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.DOWN));
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.ENTER));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement sortButton1 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        sortButton1.click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.DOWN));
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.ENTER));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement sortButton2 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        sortButton2.click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.DOWN));
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.ENTER));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement sortButton3 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        sortButton3.click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.UP));
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.UP));
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.UP));
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).sendKeys((Keys.ENTER));


    }

    @Test
    public void TestCase2() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("problem_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement addToCart4 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCart4.click();
        WebElement addToCart5 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCart5.click();
        WebElement addToCart6 = _globalDriver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCart6.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cart.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement checkout = _globalDriver.findElement(By.id("checkout"));
        checkout.click();
        _globalDriver.findElement(By.id("first-name")).sendKeys(generateUsername());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("last-name")).sendKeys(generateUsername());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("postal-code")).sendKeys("41514");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement next = _globalDriver.findElement(By.id("continue"));
        next.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement finish = _globalDriver.findElement(By.id("finish"));
        finish.click();


    }

    @Test
    public void TestCase3() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement addToCart4 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCart4.click();
        WebElement addToCart5 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCart5.click();
        WebElement addToCart6 = _globalDriver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCart6.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cart.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement checkout = _globalDriver.findElement(By.id("checkout"));
        checkout.click();
        _globalDriver.findElement(By.id("first-name")).sendKeys(generateUsername());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("last-name")).sendKeys(generateUsername());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("postal-code")).sendKeys("41514");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement next = _globalDriver.findElement(By.id("continue"));
        next.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement finish = _globalDriver.findElement(By.id("finish"));
        finish.click();


    }

    @Test
    public void TestCase5() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement menu = _globalDriver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement menu2 = _globalDriver.findElement(By.id("reset_sidebar_link"));
        menu2.click();


    }

    @Test
    public void TestCase6() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("problem_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement menu = _globalDriver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement menu2 = _globalDriver.findElement(By.id("reset_sidebar_link"));
        menu2.click();


    }

    @Test
    public void TestCase7() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement menu = _globalDriver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement menu2 = _globalDriver.findElement(By.id("reset_sidebar_link"));
        menu2.click();


    }

    @Test
    public void testCase8() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login = _globalDriver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart1 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();
        WebElement addToCart3 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart3.click();
        WebElement addToCart4 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCart4.click();
        WebElement addToCart5 = _globalDriver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCart5.click();
        WebElement addToCart6 = _globalDriver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCart6.click();
        WebElement textas1 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
        WebElement textas2 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div"));
        WebElement textas3 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div"));
        WebElement textas4 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div"));
        WebElement textas5 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/a/div"));
        WebElement textas6 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div"));
        String name1 = textas1.getText();
        String name2 = textas2.getText();
        String name3 = textas3.getText();
        String name4 = textas4.getText();
        String name5 = textas5.getText();
        String name6 = textas6.getText();
        String name = (name1 + name2 + name3 + name4 + name5 + name6);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cart.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textas01 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div"));
        String name01 = textas01.getText();
        WebElement textas02 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div"));
        String name02 = textas02.getText();
        WebElement textas03 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[5]/div[2]/a/div"));
        String name03 = textas03.getText();
        WebElement textas04 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[6]/div[2]/a/div"));
        String name04 = textas04.getText();
        WebElement textas05 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[7]/div[2]/a/div"));
        String name05 = textas05.getText();
        WebElement textas06 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[8]/div[2]/a/div"));
        String name06 = textas06.getText();
        String name0 = (name01 + name02 + name03 + name04 + name05+ name06);

        Assert.assertEquals((name), (name0));
    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    public static String generateUsername() {
        Random random = new Random();
        StringBuilder username = new StringBuilder();
        int usernameLength = random.nextInt(10) + 5;
        for (int i = 0; i < usernameLength; i++) {
            char randomChar = (char) (random.nextInt(36) + '0');
            if (Character.isLetter(randomChar)) {
                randomChar = Character.toUpperCase(randomChar);
            }
            username.append(randomChar);
        }
        return username.toString();
    }


}
