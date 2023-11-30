package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Anthony Tang
 * <p>
 * Lenovo PCCW Solutions Limited
 * @created 17/11/2023 - 6:02 pm
 * @project camel4-test
 */
@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        /*
    SpringApplicationBuilder app = new SpringApplicationBuilder(MongoAppConfig.class);
    app.web(WebApplicationType.NONE).run(args);

            .run(
        "--spring.data.mongodb.uri=mongodb://" + USER + ":" + PASS + "@" + HOST + ":" + PORT + "/" + DB,
        "--spring.data.mongodb.database=" + DB
        );
             */
    }
}
