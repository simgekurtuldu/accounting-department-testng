import org.example.Calculate;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculateTest {
    @Test
    public void testCalculateBonus(){
        Calculate calculate = new Calculate();
        Assert.assertEquals(calculate.calculateBonus(30),5000);
    }

    @Test(dataProvider = "credentials")
        public void testCalculate(String employeeName, int numberOfDaysWorked, int dailyWage){
            Calculate calculate1 = new Calculate("Simge", 30, 200);
            Assert.assertEquals(calculate1.getEmployeeName(),employeeName);
            Assert.assertEquals(calculate1.getNumberOfDaysWorked(),numberOfDaysWorked);
            Assert.assertEquals(calculate1.getDailyWage(),dailyWage);
    }
    @DataProvider (name="credentials")
    public Object[][] credentials(){
        return new Object[][]{
                {"Simge",30,200},
                {"Simge",30,100},
                {"Ayse",2,350}
        };
    }
}
