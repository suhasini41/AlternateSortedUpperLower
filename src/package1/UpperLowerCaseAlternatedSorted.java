package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpperLowerCaseAlternatedSorted {

	private String upperLowerAlternate(String str) {
		List<Character> ulist = new ArrayList<>();
		List<Character> llist = new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				ulist.add(str.charAt(i));
			}
			else
				llist.add(str.charAt(i));
		}
		Collections.sort(ulist);
		Collections.sort(llist);
		String newString = "";
		int i=0;
		while(true)
		{
			if(i<llist.size())
			{
				newString = newString + llist.get(i);
			}
			if(i<ulist.size())
			{
				newString = newString + ulist.get(i);
			}
			if(i>=llist.size()&&(i>=ulist.size()))
			{
				break;
			}
			i++;
		}
		return newString;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(upperLowerAlternate("pqrPQR"), "pPqQrR");
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(upperLowerAlternate("dBAAa"), "aAdAB");
	}

}
