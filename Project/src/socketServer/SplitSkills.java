package socketServer;

import java.util.Arrays;
import java.util.List;

public class SplitSkills
{
	public static List<String> splitSkills(String criterias)
	{
		List<String> splittedCriterias = Arrays.asList(criterias.split(";"));
		return splittedCriterias;
	}
}
