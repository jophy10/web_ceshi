package test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {   
    
    @Parameters({"test1","test2"})
    @Test(groups="parameter")
    public void ParaTest(String test1,String test2){
        System.out.println("This is " + test1);
        System.out.println("This is " + test2);
    }
}