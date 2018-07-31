
# Spring-boot

## Setting
1. jdk ( 1.7~)
2. maven (3.3.x~)
      MVN_HOME=C:\utils\apache-maven-3.5.4
      Path=~~~~%MVN_HOME%\bin;

## Create Project
1. create maven java project
      ```
      1.  mvn archetype:generate -DgroupId=com.bit.application -DartifactId=my-boot -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
      ```
2. add parent element to pom.xml
    ```
    <parent>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-parent</artifactId>
      <version>2.0.3.RELEASE</version>
    </parent>
    ```
3. add  dependency to pom.xml
    ```
    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ```
4.  edit main method
```
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
```

###  Rest Web Service Coding
1. add Controller
```
package com.bit.application;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController{

  @RequestMapping("/")
  public String index(){
    return "Hello boot";
  }

}
```

## Run
```
mvn spring-boot:run
```

> Written with [bit](https://github.com/class4/).