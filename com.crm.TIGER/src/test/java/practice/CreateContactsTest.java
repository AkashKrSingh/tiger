package practice;

import org.testng.annotations.Test;

public class CreateContactsTest {

	@Test(groups="smoke test")
	public void contact() {
		System.out.println("contact will be created");
	}
	@Test(groups="regression test")
	public void contactMandatory() {
		System.out.println("mandatory field contact creation");
	}
	
}
