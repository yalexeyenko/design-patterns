package composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {
	private String groupName;
	private String groupDescription;
	private List<SongComponent> songComponents;
	
	public SongGroup(String groupName, String groupDescription) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.songComponents = new ArrayList<>();
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}
	
	public void add(SongComponent songDocument) {
		this.songComponents.add(songDocument);
	}
	
	public void remove(SongComponent songComponent) {
		this.songComponents.remove(songComponent);
	}
	
	public void displayInfo() {
		System.out.println(getGroupName() + " - " + getGroupDescription());
		for (SongComponent songComponent : songComponents) {
			songComponent.displayInfo();
		}
	}
}
