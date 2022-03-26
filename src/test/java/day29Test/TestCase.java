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
	public void testRecordMatch() throws InvalidFile {
		analyser.loadData("src/main/resources/IndiaStateCensusData.csv");
		assertEquals(true, analyser.checkData());
	}
	@Test
	public void testFileCheckSad() throws InvalidFile {
		analyser.loadData("src/main/resources/IndiaStateCensus.csv");
	}
	
	@Test
	public void testTypeCheckSad() throws InvalidFile {
		analyser.loadData("src/main/resources/IndiaStateCensusDataFileWrong.csv");
	}
}