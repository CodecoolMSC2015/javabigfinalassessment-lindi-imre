package socketServer;

import java.util.Set;

import person.Person;

public abstract class DataReader
{
	private String searchCriteria;
	private SearchType searchType;

	public abstract Set<Person> getPerson(String property, SearchType searchType);

	public abstract void setSearchCriteria(String property);

	public abstract void setSearchType(SearchType searchType);
}
