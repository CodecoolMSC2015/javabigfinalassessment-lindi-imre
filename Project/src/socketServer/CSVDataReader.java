package socketServer;

import java.util.List;
import java.util.Set;

import person.Person;

public class CSVDataReader extends DataReader
{
	private String csvFilePath;
	List<Person> persons;

	public CSVDataReader(String property)
	{
	}

	public Set<Person> getPersons()
	{
		return null;
	}

	@Override
	public Set<Person> getPerson(String property, SearchType searchType)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSearchCriteria(String property)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void setSearchType(SearchType searchType)
	{
		// TODO Auto-generated method stub

	}

}
