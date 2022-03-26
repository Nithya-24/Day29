package day29Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

	public class StateCensusAnalyser {
		ArrayList<CSVstateCensus> censusData = new ArrayList<CSVstateCensus>();

		/**
		 *  Method to load the data and display
		 */
		public void loadData(String filePath) throws InvalidFile { 

			try {
				/**
				 * parsing a CSV file into CSVReader class constructor  
				 */
				CSVReader reader = new CSVReader(new FileReader("src/main/resources/IndiaStateCensusData.csv"));
				String[] record;
				record = reader.readNext();
				/**
				 * reads one line at a time 
				 */
				while ((record = reader.readNext()) != null) {
					censusData.add(new CSVstateCensus(record[0], Long.parseLong(record[1]), Integer.parseInt(record[2]),
							Double.parseDouble(record[3])));
				}

			} catch (FileNotFoundException e) {
				
				throw new InvalidFile("Invalid File");
			} catch (CsvValidationException e) {
			
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
				
			}catch (NumberFormatException e) {
				throw new InvalidFile(" This Record is an invalid type ");
			}
			
		}

		/**
		 * checking the size of the list 
		 * @return 
		 */
		public boolean checkData() {
			if (censusData.size() == 30)
				return true;
			return false;
		}

	}