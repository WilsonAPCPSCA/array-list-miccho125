import java.util.ArrayList;

public class emperorsNewGrove {
	public static void main (String[]args){
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println(emperorCast);
		emperorCast.add(emperorCast.get(1));
		emperorCast.set(1, emperorCast.get(2));
		emperorCast.remove(2);
		emperorCast.add(2,"Chaca");
		emperorCast.add(3,"Tipo");
		emperorCast.add(5,"Bucky");
		System.out.print(emperorCast);
	}
}
