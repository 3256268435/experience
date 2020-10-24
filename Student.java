package shiyan2;

public class Student extends Personnel {  //子类
    public Student(int number, String name, char sex,Courses a){
        super(number,name,sex);
        this.a = a;
    }
    public String toString(){
        return  "\n" + "Student(学生信息):  姓名：" + name
                + "    学号：" + number + "   性别：" + sex + "\n" + "所选课程信息:   " + a;
    }
    }


