package org.seleniumArchitecture.steps;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.seleniumArchitecture.pages.InsightsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Steps for Insights Page that represents methods
 */
public class InsightsPageSteps {

  private static final InsightsPage INSIGHTS_PAGE = new InsightsPage();

  private static final String BLOG_URL = "https://blankfactor.com/insights/blog/";

  @Step("Click Blog Page Item")
  public InsightsPageSteps clickBlogPageItem() {
    INSIGHTS_PAGE.blogPageItem().click();

    return this;
  }

  @Step("Verify Blog Page is opened")
  public void verifyBlogPageIsOpened() {
    Selenide.Wait().until(ExpectedConditions.urlToBe(BLOG_URL));

  }
}
