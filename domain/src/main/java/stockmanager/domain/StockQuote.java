package stockmanager.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class StockQuote {

	private long id;
	private Stock stock;
	private Calendar date;
	private BigDecimal value;
}
