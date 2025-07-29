#  Java Access Modifiers:

Access Modifiers ka kaam hota hai **"kis cheez ko kahan tak access mil sakta hai?"** define karna — jaise chhoti si permission.



## ✅ Modifier – (Permission)

| Modifier        | Real Life Example                                | Java Explanation                                        |
|----------------|---------------------------------------------------|----------------------------------------------------------|
| `public`        | Sabko ijazat                                      | Accessible from **anywhere**                            |
| `private`       | Sirf mujhe (andar hi andar)                       | Accessible **only within the same class**               |
| `protected`     | Ghar walay aur rishtedaar (yaani inherited)       | Accessible in **same package + subclass outside**       |
| *(default)*     | Sirf colony walon ko (same package)               | Accessible only within **same package** (no keyword)    |

---

## ✅ 1. Same Class – (Apna kamra)

 Hamary apne kamray mein diary ya document — sirf hum access kar sakty hy.

```java
public class A {
    private int x = 5;

    public void show() {
        System.out.println(x); // ✅ Same class, access allowed
    }
}
```

###   Using Private with Getter & Setter – (Indirect Access)

Jab koi variable `private` hota hai, toh hum usay **directly bahar se access nahi** kar sakte. Isliye hum uske liye **getters and setters** banate hain.

📌 *Getter: read karne ke liye*  
📌 *Setter: value set karne ke liye*

```java
public class Student {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mueza");
        System.out.println(s.getName());  // Output: Mueza
    }
}
```


## ✅ 2. Same Package – (pura ghar)

Hum or hamry behan/bhai ek hi ghar mein ho — same package.

```java
// File A.java
package mypackage;
class A {
    int x = 10;  // default access
}

// File B.java
package mypackage;
class B {
    public void show() {
        A a = new A();
        System.out.println(a.x); // ✅ Access allowed, same package
    }
}
```


## ✅ 3. Subclass (Outside Package) – (Rishtedaar jo aur sheher mein hain)

Cousin chachi doosre sheher mein rehti hain lekin rishtedaar hain — agar unhone hamary surname (inheritance) use kiye hy, toh access milta hai.

```java
// animals/Animal.java
package animals;
public class Animal {
    protected String name = "Tiger";
}

// zoo/Lion.java
package zoo;
import animals.Animal;

public class Lion extends Animal {
    public void show() {
        System.out.println(name);  // ✅ Access allowed through inheritance
    }
}
```


## ✅ 4. Other Classes – (Paraye log)

Na ghar walay, na rishtedaar — koi access nahi!

```java
// zoo/Zookeeper.java
package zoo;
import animals.Animal;

public class Zookeeper {
    public void show() {
        Animal a = new Animal();
        System.out.println(a.name);  // ❌ ERROR — not allowed
    }
}
```


##  Easy Formula to Remember

| Heading             | Real Life Example                                          |
|---------------------|------------------------------------------------------------|
| Same Class          | Hum khud apni diary padh rahy hy.                          |
| Same Package        | Hamary behan/bhai usi ghar mein hy.                        |
| Subclass (outside)  | Cousin jo rishtedaar hain, or hamra surname le rakha hy.   |
| Other Classes       | Na rishtedaar, na ghar wale — paraye.                      |



>  Ye guide specially beginners ke liye hai, taake woh real-life comparisons ke through **Java Access Modifiers** ko easily samajh saken.



