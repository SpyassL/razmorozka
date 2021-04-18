package me.amfero.razmorozka.module;

public enum Category
{
	COMBAT("Combat"),
	EXPLOIT("Exploit"),
	RENDER("Visuals"),
	MOVEMENT("Movement"),
	MISC("Miscellaneous");

	private String name;

	Category(String name)
	{
		setName(name);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}