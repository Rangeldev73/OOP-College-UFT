package aula6.student;

import java.awt.Color; 

public class Student {

    private String name;
    private int age;
    private Color color;
    private Sex sex;

    public Student(){};
    public Student(String name, int age, Color color, Sex sex) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.sex=sex;
    }

    public void Eating() {

    }

    public void Studying() {

    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public Color getColor() {return color;}
    public Sex getSex() {return sex;}

    public void setName(String name) {this.name=name;}
    public void setAge(int age) {this.age=age;}
    public void setColor(Color color) {this.color=color;}
    public void setSex(Sex sex) {this.sex=sex;}

}