** selenium webdriver example **

---


### 1. Installation

```
1. JDK 1.8.x
2. Maven 3.5.x
3. Selenium 3.141.0
5. ...

```

### 2. Environment settings


#### 2.1 Chrome Caps
```
webdriver.driver = chrome
webdriver.chrome.driver = .\\drivers\\chromedriver.exe

```

### 3. Execute Test

`mvn clean verify`


For Dev Mode: Copy the scenario and paste into DevDebugMode.java

`mvn clean verify -Pdev` 
