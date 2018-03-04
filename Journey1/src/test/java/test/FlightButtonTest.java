
package test;



import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;
import pages.SearchFlight;
import util.ExcelReadData;

public class FlightButtonTest extends BaseTest {

	@Test(dataProvider="FlightSearch")
	public void FlightButton(String testCaseName, String fromCity1, String toCity1 ,  String dmonth, String ddate,String toCity2, String rmonth, String rdate,String radioOption){
		//System.out.println(testCaseName+"\t"+fromCity+"\t"+toCity+"\t"+"\t"+fromDate+"\t"+toDate+"\t"+radioOption);
		LandingPage landing = new LandingPage(driver);
		landing.openFlightButton();
		SearchFlight search = new SearchFlight(driver);
		
		//roundtrip travel selection
		search.roundTripSetSourceCity(fromCity1);
		search.roundTripSetDestinationCity1(toCity1);
		search.roundTripSelectDepartDate(dmonth, ddate);
		search.roundTripSelectReturnDate(rmonth, rdate);
		
		/*
		//selecting multicity checkbox
		Assert.assertTrue(search.isMulticitySelected());
		search.multicitySetSourceCity1(fromCity1);		
		search.multicitySetDestinationCity1(toCity1);
		search.multicitySelectDepartDate1(dmonth, ddate);
		search.multicitySetSourceCity2(toCity1);
		search.multicitySetDestinationCity2(toCity2);
		search.multicitySelectDepartDate2(dmonth, ddate);*/
		 search.setAdultSpiner(3);
		search.setchildSpiner(2);
		
		 search.setinfantSpiner(2);
		 search.selectByNameRadio(radioOption);
		 search.clickDoneButton();
		 search.clickSearchButton();
		 
		
}
	
	@DataProvider(name="FlightSearch")
	public Object[][] getData(){
		Map<String,Map<String,String>> flightSearchData = ExcelReadData.getExcelData("src/test/resources/TestData1.xls", "FlightDetails");
		Object[][] myObjectArray = new Object[flightSearchData.values().size()][];
		Set<String> testCases = flightSearchData.keySet();
		Iterator<String> testCaseItr = testCases.iterator();
		for(int j=0 ;j < myObjectArray.length ; j++){
			Object[] testCaseData = null;
			String testCaseName = testCaseItr.next();
			Map<String,String> testCaseMap = flightSearchData.get(testCaseName);
			Collection<String> values =testCaseMap.values();
			Iterator<String> valuesItr = values.iterator();
			int testDataLength =values.size()+1;
			testCaseData =new Object[testDataLength];
			testCaseData[0] = testCaseName;
			for(int i=0; i< values.size(); i++){
				testCaseData[i+1] = valuesItr.next();
			}
				myObjectArray[j] = testCaseData;
				
			}
	return myObjectArray;	
	}
	}


