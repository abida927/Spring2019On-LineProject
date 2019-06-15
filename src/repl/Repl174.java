package repl;

public class Repl174 {

	public static String lameDb(String db, String op, String id, String data) {
		// this tring we will use to store result
		String output = "";
		// we are creating an array of strings with records
		// before; 1etsy#2wooden#3spoon
		// after: {"1etsy", "2wooden", "3spoon"}
		String[] values = db.split("#");
		if (op.equalsIgnoreCase("add")) {
			// 1etsy#2wooden#3spoon+#+4+aaa
			output = db + "#" + id + data;
		} else if (op.equalsIgnoreCase("delete")) {
			for (String str : values) {
				// {"1etsy", "2wooden", "3spoon"}
				// we gonna skip record that we want to delete
				if (!str.startsWith(id)) {
					output += str + "#";
				}

			}
		} else if (op.equalsIgnoreCase("edit")) {
			for (String str : values) {
				// {"1etsy", "2wooden", "3spoon"}
				// we gonna modify record based on id
				if (str.startsWith(id)) {
					output += id + data + "#";
				} else {
					output += str + "#";
				}

			}
		} else {
			// for none operation
			output = db;
		}
		// replcaAll takes regex (regular expression)
		// regex - it's a pattern
		// #$ mean if string ends with #, replcae it with empty string
		return output.replaceAll("#$", "");
	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
