package com.bfs.browser;

import java.util.Scanner;

public class Browse {

	public static void main(String[] args) {
		WebBrowser browser;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Type: ");
		String browsertype = sc.nextLine();
		
		if(browsertype.equalsIgnoreCase("Firefox")){
			browser = new FirefoxBrowser();
			browser.get("http://www.google.com");
		}else if(browsertype.equalsIgnoreCase("Chrome")){
			browser = new ChromeBrowser();
			browser.get("http://www.google.com");
		}

	}

}
