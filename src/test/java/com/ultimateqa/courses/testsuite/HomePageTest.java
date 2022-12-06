package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.Homepage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

Homepage homepage = new Homepage();

@Test
    public void userShouldNavigateToLoginPageSuccessfully(){
    homepage.navigatedLoginPageWithClick();
}

}
