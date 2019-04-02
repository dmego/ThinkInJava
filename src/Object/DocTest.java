package Object;

//练习12：执行javadoc
/** 
  	对该文件执行 javadoc ,然后通过浏览器观看运行结果
*/

import java.util.*;

/** The first Thinking in Java example program.
* Displays a string and today's date.
* @author Burce Eckel
* @author www.MindView.net
* @version 4.0
*/

public class DocTest {
	/** Entry poing to class & application.
	* @param args array of string arguments
	* @throws exceptions No exceptions thrown
	*/
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());	
	}
} /* Output: (55% match)

*/