package Com;

import java.util.Comparator;

public class SortBankByAccNumber implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {
		if (b1.getAc_Number() == b2.getAc_Number())
			return 0;
		else if (b1.getAc_Number() > b2.getAc_Number())
			return 1;
		else
			return -1;

	}

}
