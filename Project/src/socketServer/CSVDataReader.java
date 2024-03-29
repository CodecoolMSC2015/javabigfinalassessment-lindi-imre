package socketServer;

import java.util.List;
import java.util.Set;

import person.Person;

public class CSVDataReader extends DataReader
{
	private String csvFilePath;
	List<Person> persons;

	public CSVDataReader(String filePath)
	{
		csvFilePath = filePath;
	}

	@Override
	public Set<Person> getPerson()
	{
		return null;
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
