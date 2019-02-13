package za.ac.cput.projects;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        Calculater calc = new Calculater();
        assertEquals(10,calc.calcSum(5,5));
    }
}
