package ir.telgeram.Adel;

public class HiddenController
{
	public static void addToHidden(Long id)
	{
		String m = Setting.getHiddenList();
		m = m + "-" + String.valueOf(id);
		Setting.setHiddenList(m);
	}

	public static void addToHidden(String user)
	{
		String m = Setting.getHiddenList();
		m = m + "-" + String.valueOf(user);
		Setting.setHiddenList(m);
	}

	public static Boolean isHidden(String user)
	{
		return Setting.getHiddenList().toLowerCase().contains(String.valueOf(user));
	}

	public static Boolean isHidden(Long id)
	{
		return Setting.getHiddenList().toLowerCase().contains(String.valueOf(id));
	}

	public static boolean IsHidden(Long aLong)
	{
		return isHidden(aLong);
	}

	public static void RemoveFromHidden(long selectedDialog)
	{
		String m = Setting.getHiddenList();
		m = m.replace(String.valueOf(selectedDialog), "");
		Setting.setHiddenList(m);

	}
}
