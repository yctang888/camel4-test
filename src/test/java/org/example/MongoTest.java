package org.example;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWith;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.language.JsonPathExpression;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.apache.camel.test.spring.junit5.MockEndpoints;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Anthony Tang
 * <p>
 * Lenovo PCCW Solutions Limited
 * @created 30/11/2023 - 2:37 pm
 * @project camel4-test
 */


@SpringBootTest
@CamelSpringBootTest
@MockEndpoints("direct:result")
class MongoTest {


    @Autowired
    private ProducerTemplate producerTemplate;

    @EndpointInject("mock:direct:result")
    private MockEndpoint mock;

    @Test
    void whenSendBody_thenGreetingReceivedSuccessfully() throws InterruptedException {
        mock.expectedMessageCount(1);
        mock.message(0).body().contains("ok=1.0"); // how to test the content of the value

        producerTemplate.sendBody("direct:dbStat", null);
       mock.assertIsSatisfied();
    }
    }


