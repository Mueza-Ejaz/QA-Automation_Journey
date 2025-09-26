# Selenium Automation Testing:

##  Introduction

Automation Testing ka matlab hai ke jo kaam hum manually karty hai, wo ek **program/script automatically** kare.

👉 Example: Login page test karna.

* **Manual Testing**: Aap khud username likhoge, password likhoge, login button pe click karoge, aur check karoge ke login hua ya nahi.
* **Automation Testing**: Ek script ye sab steps khud karegi — browser open karegi, credentials dalegi aur result verify karegi.


## 🔹 What is Selenium?

Selenium ek **automation framework/library** hai jo web applications ki testing ke liye use hota hai.

✔️ Selenium browsers ko control karta hai (Chrome, Firefox, Edge, Safari).
✔️ Ye automatically buttons click kar sakta hai, text likh sakta hai, forms fill kar sakta hai, aur results verify kar sakta hai.
❌ Selenium khud ek testing framework nahi hai — ye sirf browser control karta hai.



## 🔹 Key Tools Overview

* **Automation Testing** → Computer khud website test karta hai.
* **Selenium** → Framework jo browser (Chrome, Firefox) ko control karta hai.
* **Maven** → Helper jo Selenium ki libraries khud download karta hai.



## 🔹 IntelliJ me Selenium Setup

### ✅ Step 1: Install Required Tools

1. Java JDK (e.g., JDK 11)
2. IntelliJ IDEA
3. ChromeDriver (browser automation ke liye)

### ✅ Step 2: Project Setup

* IntelliJ open karo → New Project → Maven select karo → Project ka naam likho (e.g., `SeleniumTest`).

### ✅ Step 3: Maven & pom.xml

Maven ek build automation tool hai jisme ek file hoti hai `pom.xml`.

Pom.xml me dependency likhne se Maven automatically Selenium library download kar lega:

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.25.0</version>
    </dependency>
</dependencies>
```

👉 Dependency copy karne ke liye: [Maven Repository Selenium-Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)

### ✅ Step 4: ChromeDriver Path

1. Search: "Download ChromeDriver"
2. Download from:

   * [https://googlechromelabs.github.io/chrome-for-testing/](https://googlechromelabs.github.io/chrome-for-testing/)
   * Example: [https://storage.googleapis.com/chrome-for-testing-public/140.0.7339.185/win64/chromedriver-win64.zip](https://storage.googleapis.com/chrome-for-testing-public/140.0.7339.185/win64/chromedriver-win64.zip)



## 🔹 Example: Manual vs Automation

### Manual Testing (OrangeHRM Login Page)

1. Chrome open karo
2. URL enter karo
3. Username: `Admin`
4. Password: `admin123`
5. Login button click karo
6. Dashboard page verify karo

### Automation Testing with Selenium

* **Selenium** = Robot hand (browser ko control karta hai)
* **TestNG** = Examiner (result check karta hai & report banata hai)


## 🔹 Role Difference

### ✅ Selenium

* Browser open/close karta hai
* Click, type, scroll, interact karta hai
* Sirf actions perform karta hai (pass/fail decide nahi karta)

### ✅ TestNG

* Test cases organize karta hai
* Expected vs Actual result check karta hai
* Reports generate karta hai (Pass/Fail)



## 🔹 What is TestNG?

* TestNG = **Next Generation Testing Framework for Java**
* Use cases:

  * Unit testing
  * Integration testing
  * End-to-end testing
* Features:

  * Organize test cases
  * Grouping / prioritization
  * Parallel execution
  * Reporting



## 🔹 Selenium Locators

Automation test likhte waqt Selenium ko batana padta hai ke **page pe kaunsa element dhoondhna hai** (button, textbox, link, etc.).

➡️ Is dhoondhne ke tareeqe ko **Locator** kehte hain.

### Example:

Facebook login page me ek email textbox hai. Agar aap Selenium ko kahoge:

👉 "Is textbox me 'Mueza' likho"

Selenium poochega: "Kaunsa textbox?" → Aapko us textbox ka **locator** dena hoga.



## ✅ Summary

* **Automation Testing** = Computer khud website test karta hai.
* **Selenium** = Browser ko control karne wala tool.
* **Maven** = Dependencies manage karta hai.
* **TestNG** = Test framework jo result check karta hai & report banata hai.
* **Locators** = Elements ko identify karne ka address.



