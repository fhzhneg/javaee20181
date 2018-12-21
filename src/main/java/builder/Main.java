package builder;


public class Main {

	public static void main(String[] args) {
		if(args.length != 1) {
			usage();
			System.exit(0);
		}
		if(args[0].equals("plain")) {
			TextBuilder txt = new TextBuilder();
			Director director = new Director(txt);
			director.construct();
			String result = txt.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder html = new HTMLBuilder();
			Director director = new Director(html);
			director.construct();
			String filename = html.getResult();
			System.out.println(filename+"文件编写完成。");
		} else {
			usage();
			System.exit(0);
		}
		
	}

	private static void usage() {
		System.out.println("Usage: java Main plain         编写纯文本文档");
		System.out.println("Usage: java Main html          编写HTML文档");
	}

}
