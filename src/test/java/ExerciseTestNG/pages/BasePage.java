package ExerciseTestNG.pages;

import ExerciseTestNG.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public  BasePage() {
    PageFactory.initElements(Driver.get(), this);
}

}
