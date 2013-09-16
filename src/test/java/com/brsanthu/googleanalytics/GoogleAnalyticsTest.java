package com.brsanthu.googleanalytics;

import org.junit.BeforeClass;
import org.junit.Test;

public class GoogleAnalyticsTest {

	private static GoogleAnalytics ga = null;

	@BeforeClass
	public static void setup() {
		ga = new GoogleAnalytics("UA-44034973-2", "Junit Test", "1.0.0");
		System.out.println("Creating Google Analytis Object");
	}

	@Test
	public void testPageView() throws Exception {
		ga.send(new PageViewHit("http://www.google.com", "Search"));
	}

	@Test
	public void testSocial() throws Exception {
		ga.send(new SocialHit("Facebook", "Like", "https://www.google.com"));
		ga.send(new SocialHit("Google+", "Post", "It is a comment"));
		ga.send(new SocialHit("Twitter", "Repost", "Post"));
	}
}