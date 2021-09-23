package Phase1Project;

public class Menu {
	Options o= new Options();
	public void process(int x) {
		switch(x){
			case 1:
				o.displayFiles();
				o.display();
				process(o.input());
				break;
			case 2:
				o.operations();
				switch (o.ainput()) {
				case 'a':
					o.search();
					o.display();
					process(o.input());
					break;
				case 'b':
					o.add();
					o.display();
					process(o.input());
					break;
				case 'c':
					o.delete();
					o.display();
					process(o.input());
					break;
				case 'd':
					o.display();
					process(o.input());
					break;
				case 'e': 
					o.exit();
					break;
				default:
					o.display();
					process(o.input());
					break;
				}
				break;
			case 3:
				o.exit();
				break;
			default:
				o.display();
				process(o.input());
		}
	}

				
}
