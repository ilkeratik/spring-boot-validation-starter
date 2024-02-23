package com.iky;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootValidationSampleApplicationTests {

  private final ApplicationContext context;

  SpringBootValidationSampleApplicationTests(ApplicationContext context) {
    this.context = context;
  }

  @Test
  void contextLoads() {
    assertNotNull(context);
  }

}
