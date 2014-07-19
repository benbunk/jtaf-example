package org.finra.jtaf.extwebdriver.example;

import org.finra.jtaf.ewd.ExtWebDriver;
import org.finra.jtaf.ewd.session.SessionManager;
import org.finra.jtaf.ewd.widget.IButton;
import org.finra.jtaf.ewd.widget.element.html.Button;
import org.junit.Assert;
import org.junit.Test;

/**
  *  Tests for ExtWebDriver homepage
  */
 public class ExtWebDriverHomeTest {

    @Test
    public void testLearnMoreButton() throws Exception {
      // Get a new ExtWebDriver session
      ExtWebDriver ewd = SessionManager.getInstance().getNewSession();
//      ExtWebDriver ewd = SessionManager.getInstance().getNewSession("client", "client/firefox.properties");
//      ExtWebDriver ewd = SessionManager.getInstance().getNewSession("client", "client/default.properties");
//      ExtWebDriver ewd = SessionManager.getInstance().getNewSession("client", "client/htmlunit.properties");
//      ExtWebDriver ewd = SessionManager.getInstance().getNewSession("client", "client/ie.properties");
//      ExtWebDriver ewd = SessionManager.getInstance().getNewSession("client", "client/chrome.properties");

      // Open ExtWebDriver home page
      ewd.open("http://finraos.github.io/JTAF-ExtWebDriver");
      
      // Create Button object
      IButton b = new Button("//*[contains(@class,'btn') and text()='Learn more »']");
      
      // Wait for existence of the button
      b.waitForElementPresent();
      
      // Click on button
      b.click();
      
      // Verify the page title
      Assert.assertEquals("Extensions for WebDriver - Getting Started", ewd.getTitle());
    }
 }
 