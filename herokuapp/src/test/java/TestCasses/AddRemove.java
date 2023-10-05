package TestCasses;

import Base.Base;
import org.testng.annotations.Test;

public class AddRemove extends Base{

    @Test
    public void AddRemove () throws InterruptedException {
        this.OpenBrowser();
        this.OpenWebsite();
        Thread.sleep(2000);
        home.OpenAddRemovePage();
        Thread.sleep(2000);
        home.PageCheck();
        home.AddItem();
        home.CheckDeleteButton();
        this.CloseBrowser();
    }
}
