import java.time.LocalDate;
import java.time.Period;

class HelloWorld {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "John";
        youngerUser.birthDay = LocalDate.parse("1988-03-06");

        System.out.printf("%s was born in %s and is %s years old.", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
    }
}

public class User {
    public String name;
    public LocalDate birthDay;

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }
}