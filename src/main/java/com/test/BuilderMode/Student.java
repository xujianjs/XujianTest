package com.test.BuilderMode;

/**
 * @创建人: $AUTHOR$
 * @描述:学生构建器(对象实例化参数不定的优化解决方案)
 * @创建时间: 21:04$ 2018/6/22$
 * @修改原因:
 */
public class Student {
    private String name = null;
    private int age = -1;
    private String gender = null;
    private int height = -1;
    private String grade = null;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.height = studentBuilder.height;
        this.grade = studentBuilder.grade;
    }


    /*利用构造器作为参数  实例化Student*/
    public static class StudentBuilder {
        private String name = null;
        private int age = -1;
        private String gender = null;
        private int height = -1;
        private String grade = null;


        //正常实例化是 new Student();但是参数个数不定,参数属性也不定(这就只能通过一个全属性对象  +  外部传入参数进行  映射比较   =>把实例化的方法由具体实现转为抽象出所有构造情况)


        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;

        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;

        }

        public StudentBuilder setHeight(int height) {
            this.height = height;
            return this;

        }

        public StudentBuilder setGrade(String grade) {
            this.grade = grade;
            return this;

        }

        public Student build() {
            return new Student(this);
        }

    }

}
