package Model;

import Annotation.*;


@Table(name = "student")
public class Student {
    @PrimaryKey
    @ColumnInfo(name = "student_id")
    private int id;

    @ColumnInfo(name = "student_name", length = 30)
    private String name;

    @ColumnInfo(name = "student_age")
    private Integer age;

    @ColumnInfo(name = "student_gender", length = 6)
    private String gender;

    @ColumnInfo(name = "student_address", nullable = true)
    private String address;

    @ColumnInfo(name = "student_phone", nullable = true, length = 15)
    private String phone;

    public Student() {
    }

    public Student(int id, String name, Integer age, String gender, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
