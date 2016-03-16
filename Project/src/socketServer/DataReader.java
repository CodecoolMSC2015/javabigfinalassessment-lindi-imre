package socketServer;

import java.util.Set;

import person.Person;

public abstract class DataReader
{
	protected String searchCriteria;
	protected SearchType searchType;

	public abstract Set<Person> getPerson();

	public abstract void setSearchCriteria(String property);

	public abstract void setSearchType(SearchType searchType);
}
