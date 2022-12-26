import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isCategoriesDisplayed (Boolean isCategoriesDisplayed, String view, String url){
        Assert.assertTrue(isCategoriesDisplayed,"Categories is displayed "+" in "+url+" and in view "+view);
    }
}
