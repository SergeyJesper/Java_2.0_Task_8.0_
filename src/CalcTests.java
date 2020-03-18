import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Zyablitsev Sergey
 */

public class CalcTests {
    Calc calc = new Calc();
    @Test
    public void doSum() {
        calc.setX(10.0);
        calc.setY(15.0);
        String res = calc.getAdd();
        assertEquals("Не прошла проверка сложения", "25,0000", res);
    }
    @Test
    public void doSub() {
        calc.setX(80.0);
        calc.setY(20.0);
        String res = calc.getSub();
        assertEquals("Не прошла проверка вычитания", "60,0000", res);
    }
    @Test
    public void doMul() {
        calc.setX(25.0);
        calc.setY(5.0);
        String res = calc.getMul();
        assertEquals("Не прошла проверка умножения", "125,0000", res);
    }
    @Test
    public void doDiv(){
        calc.setX(100.0);
        calc.setY(7.0);
        String res = calc.getDiv();
        assertEquals("Не прошла проверка деления", "14,2857", res);
    }
    @Test(expected = ArithmeticException.class)
    public void doDivZ(){
        calc.setX(70.0);
        calc.setY(0);
        String res = calc.getDiv();
        Assert.fail("Не прошла проверка деления на ноль" + " res= " + " " + res);
        //assertEquals("Не прошла проверка деления на ноль", ArithmeticException.class, res);

    }

}
