package day1;

public class Student {

    public int id;
    String sirName;
    String firstname;
    String lastName;
    int age;

    String address;

    String fullName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    this is a java keyword, and it equals to whetevr object you used to call current method.
    String getFullName(){
        String firstname = "I am local FirstName ";
        String fullName = this.sirName + this.firstname + this.lastName;

        return fullName;
    }

    void changeId(){
        Student stdObject = new Student();
        stdObject.id = 123;
    }
}
