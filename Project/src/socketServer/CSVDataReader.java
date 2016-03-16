package socketServer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import person.Person;

public class CSVDataReader extends DataReader
{
	private String csvFilePath = "D:\\bfa\\persons.csv";
	List<Person> persons;

	public CSVDataReader(String filePath)
	{
		csvFilePath = filePath;
	}

	@Override
	public Set<Person> getPerson()
	{
		Set<Person> result = new HashSet<Person>();
		return result;
	}

	@Override
	public void setSearchCriteria(String searchCriteria)
	{
		this.searchCriteria = searchCriteria;

	}

	@Override
	public void setSearchType(SearchType searchType)
	{
		this.searchType = searchType;
	}

}
