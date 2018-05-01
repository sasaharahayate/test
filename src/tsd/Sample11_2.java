package tsd;

import java.io.File;

public class Sample11_2 {

	public static void main(String[] args) {
		String treeRoot =  ".";

		if(args.length >= 1) {
			treeRoot = args[0];
		}

		File rootDir = new File(treeRoot);
		System.out.println("Root of navigation:" + rootDir.getAbsolutePath());

		if(!(rootDir.isDirectory())) {
			System.out.println("The root of the navigation subtree"
					+ "does not exist as a directory!");
			System.exit(0);
		}

		Sample11_2 obj = new Sample11_2();
		obj.navigate(rootDir);
	}

	public void navigate(File dir) {
		System.out.println(" ");
		System.out.println("Directory" + dir + ":");

		String[] dirCountent = dir.list();

		for(int i = 0; i < dirCountent.length; i++) {
			System.out.println(dirCountent[i]);
			File child = new File(dir,dirCountent[i]);

			if(child.isDirectory()) {
				navigate(child);
			}
		}
	}

}
