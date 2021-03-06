import com.test.factoryMode.ExecutorFactory;
import com.test.factoryMode.TargetExecutor;
import com.test.templateMode.Shuizhuroupian;
import com.test.templateMode.Yuxiangrousi;
import org.junit.Test;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author 徐健
 * @Date 2018/6/15 8:27
 * @Version 1.0
 **/
public class MyTest {

    @Test
    public void testFactoryMode(){
        TargetExecutor executorA = new ExecutorFactory().getExecutor("targetA");
        TargetExecutor executorB = new ExecutorFactory().getExecutor("targetB");
        TargetExecutor executorOther = new ExecutorFactory().getExecutor("...");
        executorA.process();
        executorB.process();
        executorOther.process();
    }

    @Test
    public void cook() {
        Shuizhuroupian shuizhuroupian = new Shuizhuroupian();
        shuizhuroupian.cookTempalte();
        Yuxiangrousi yuxiangrousi = new Yuxiangrousi();
        yuxiangrousi.cookTempalte();

    }
}
