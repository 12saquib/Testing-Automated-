package my.selenium.webdriver.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException{
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saquib Jawed\\Downloads\\chromedriver_win32\\chromedriver.exe");
          ChromeDriver driver =new ChromeDriver();
          String url="https://www.thesparksfoundationsingapore.org/";
          driver.manage().window().maximize();
          driver.get(url);
          Thread.sleep(3000);
	  driver.findElement(By.linkText("Glimpses for Kids")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Student Scholarship Program")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Career Choices")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Contact Us")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("GRIP (Internship)")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Why Join Us")).click();
          Thread.sleep(3000);
          driver.findElement(By.name("Name")).sendKeys("Saquib Jawed");
          Thread.sleep(3000);
          driver.findElement(By.name("Email")).sendKeys("saquibjawed00@gmail.com");
          Thread.sleep(3000);
          driver.findElement(By.linkText("Brand Ambassador")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Expert Mentor")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Events Volunteer")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Management Volunteer")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
	  Thread.sleep(10000);
          driver.findElement(By.linkText("Jobs at Angel.co Portal")).click();
          Thread.sleep(10000);
          driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
          Thread.sleep(10000);
          driver.findElement(By.linkText("Internships at Internshala")).click();
          Thread.sleep(10000);
          driver.close();
          driver.quit();
	}

}
