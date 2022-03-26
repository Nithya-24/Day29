package day29Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCase {
	StateCensusAnalyser analyser;

	@Before
	public void initialization() {
		analyser = new StateCensusAnalyser();
	}

	@Test
	public void testRecordMatch() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/main/resources/IndiaStateCensusData.csv");
		assertEquals(true, analyser.checkData());
	}
	@Test
	public void testFileCheckSad() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/main/resources/IndiaStateCensusData.csv");
		assertEquals(true, analyser.checkData());
	}
	
	@Test
	public void testTypeCheckSad() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/main/resources/IndiaStateCensusDataFileWrong.csv");
	}
	
	@Test
	public void testDelimiterCheckSad() throws InvalidFile, InvalidDelimiter  {
		analyser.loadData("src/main/resources/IndiaStateCensusDataWrongDeliminator.xls");
	}
	
	@Test
	public void testHeaderCheckSad() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/main/resources/IndiaStateCensusDataFileWrongHeader.csv");
	}
}