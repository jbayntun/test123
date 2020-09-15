package hello;

import org.joda.time.LocalTime;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;

public class HelloWorld {
	public static void main(String[] args) throws java.io.IOException {
		LocalTime currentTime = new LocalTime();
		System.out.println("\n\nThe current local time is: " + currentTime + "\n");
		System.out.println(FigletFont.convertOneLine("Hello Snyk!!"));
	}
}
