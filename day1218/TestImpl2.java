package day1218;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestImpl2 implements Test {

	@Override
	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE");
		return sdf.format(new Date());
	}

}
