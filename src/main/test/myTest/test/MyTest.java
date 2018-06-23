package myTest.test;

import com.test.BuilderMode.Student;
import com.test.adapterMode.Adapter1;
import com.test.adapterMode.Adapter2;
import com.test.adapterMode.Usber;
import com.test.prototypeMode.Prototype;
import com.test.templateMode.Shuizhuroupian;
import com.test.templateMode.Yuxiangrousi;
import org.junit.Test;

/**
 * @创建人: $AUTHOR$
 * @描述:
 * @创建时间: 22:52$ 2018/6/21$
 * @修改原因:
 */
public class MyTest {

    @Test
    public void doTest() {
        Shuizhuroupian shuizhuroupian = new Shuizhuroupian();
        Yuxiangrousi yuxiangrousi = new Yuxiangrousi();
        System.out.println(yuxiangrousi.getName());
        shuizhuroupian.cookTempalte();
        System.out.println("*************************************");
        yuxiangrousi.cookTempalte();
    }


    @Test
    public void testBuilder() {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder().setAge(10).setGender("女").setGrade("一年级");
        Student student = studentBuilder.build();

        Student.StudentBuilder studentBuilder2 = new Student.StudentBuilder().setAge(12).setGender("男").setGrade("二年级");
        Student student2 = studentBuilder2.build();

    }

    @Test
    public void testPrototype() {
        Prototype prototype = new Prototype("原型模式");
        Prototype clone = (Prototype)prototype.clone();
    }

    @Test
    public void testAdapter() {
        Adapter1 adapter1 = new Adapter1();
        adapter1.isPs2();
        Adapter2 adapter2 = new Adapter2(new Usber());
        adapter2.isPs2();
    }
}
