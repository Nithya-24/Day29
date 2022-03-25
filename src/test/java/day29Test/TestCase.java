package day29Test;

import org.junit.Test;

public class TestCase {
	@Test
	public void testCensusAnalyser() {
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		analyser.loadData();
	}
}