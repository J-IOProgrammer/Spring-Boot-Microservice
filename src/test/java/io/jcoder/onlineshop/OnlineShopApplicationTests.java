package io.jcoder.onlineshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class OnlineShopApplicationTests {

    @Container
    static final MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");

    static void setProperties(DynamicPropertyRegistry properties) {
        properties.add("spring.data.mongodb.uri" , mongoDBContainer::getReplicaSetUrl);
    }

    @Test
    void contextLoads() {
    }

}
