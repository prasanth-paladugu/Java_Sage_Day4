//Accept two string and start implementing methods of String, StringBuffer and StringBuilder.
class Ass_1
{
	public static void main(String arg[])
	{
		String st1 = " Prasanth ";
		String st2 = " Paladugu ";

		//String class methods

		System.out.println(st1.charAt(1));
		System.out.println(st1.codePointAt(2));
		System.out.println(st1.compareTo(st2));
		System.out.println(st1. equals(st2));
		System.out.println(st1.concat(st2));
		System.out.println(st1.contains("P"));
		System.out.println(st1.endsWith("h "));
		System.out.println(st1.equals(st2));
		System.out.println(st2.hashCode());
		System.out.println(st2.indexOf('a'));
		System.out.println(st2.lastIndexOf('a'));
		System.out.println(st1.isEmpty());
		System.out.println(st1.length());
		System.out.println(st1.replace('l', 'p'));
		System.out.println(st2.toLowerCase());
		System.out.println(st1.toUpperCase());
		System.out.println(st2.trim());

		//StringBuffer and StringBuilder class methods

		StringBuffer pp=new StringBuffer("PRASANTH ");
		pp.append("P ");
		System.out.println(pp);
		pp.insert(11,"Java   Developer");
		System.out.println(pp);
		pp.replace(11,17,"Python");
		System.out.println(pp);
		System.out.println(pp.capacity());
		pp.delete(17,27);
		System.out.println(pp);
	}
}