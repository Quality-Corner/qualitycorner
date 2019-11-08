package samples;

import static org.hamcrest.Matchers.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import demo.timeclock.User;
import demo.timeclock.Users;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.*;

public class SampleTests {
    Properties prop = new Properties();

    @BeforeTest
    public void getPropertiesFile() throws IOException {
        // ToDo: Figure out relative path, this was not working
        FileInputStream fis = new FileInputStream("src/main/java/resources/config.properties");
        prop.load(fis);
    }

    @Test
    public void castlemockTest() {
        baseURI = prop.getProperty("baseURI");
        String body = given().header("Accept", "application/json").get("/mock/rest/project/mhAjF9/application/izoQVd/users").then().assertThat().statusCode(200).body(not(containsString("error"))).extract().body().asString();
    }

    @Test
    public void serializationExample() {
        Users users = new Users();

        User user = new User();
        user.setName("admin");
        user.setUsername("admin");
        user.setRole("Administrator");
        user.setActive(false);
        users.addUser(user);

        user = new User();
        user.setName("Lucas Hale");
        user.setUsername("lhale");
        user.setRole("manager");
        user.setActive(true);
        users.addUser(user);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);
        System.out.println(json);
    }
}